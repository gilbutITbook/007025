/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package design.split_method_with_boolean_parameters.problem;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.Collections;

class Logbook {

    static final Path CAPTAIN_LOG = Paths.get("/var/log/captain.log");
    static final Path CREW_LOG = Paths.get("/var/log/crew.log");

    void log(String message, boolean classified) throws IOException {
        if (classified) {
            writeMessage(message, CAPTAIN_LOG);
        } else {
            writeMessage(message, CREW_LOG);
        }
    }

    void writeMessage(String message, Path location) throws IOException {
        String entry = LocalDate.now() + " " + message;
        Files.write(location, Collections.singleton(entry),
                StandardCharsets.UTF_8, StandardOpenOption.APPEND);
    }
}

class Main {
    static void usage() throws IOException {
        Logbook logbook = new Logbook();
        logbook.log("Aliens sighted!", true);
        logbook.log("Toilet broken.", false);
    }
}