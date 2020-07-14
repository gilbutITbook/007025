/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package testing.let_junit_handle_exceptions;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Logbook {

    static final Path CREW_LOG = Paths.get("/var/log/crew.log");

    List<String> readEntries(LocalDate date) throws IOException {
        Objects.requireNonNull(date);
        List<String> result = new LinkedList<>();
        for (String entry : readAllEntries()) {
            if (entry.startsWith(date.toString())) {
                result.add(entry);
            }
        }
        return result;
    }

    public List<String> readAllEntries() throws IOException {
        return Files.readAllLines(CREW_LOG, StandardCharsets.UTF_8);
    }
}
