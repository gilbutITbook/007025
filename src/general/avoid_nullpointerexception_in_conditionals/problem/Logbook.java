/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package general.avoid_nullpointerexception_in_conditionals.problem;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.Collections;

class Logbook {

    void writeMessage(String message, Path location) throws IOException {
        if (Files.isDirectory(location)) {
            throw new IllegalArgumentException("The path is invalid!");
        }
        if (message.trim().equals("") || message == null) {
            throw new IllegalArgumentException("The message is invalid!");
        }
        String entry = LocalDate.now() + ": " + message;
        Files.write(location, Collections.singletonList(entry),
                StandardCharsets.UTF_8, StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
    }
}
