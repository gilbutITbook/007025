/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package general.split_method_with_optional_parameters.solution;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

class Logbook {

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

    List<String> readAllEntries() throws IOException {
        return Files.readAllLines(CREW_LOG, StandardCharsets.UTF_8);
    }
}

class Main {
    static void usage() throws IOException {
        Logbook logbook = new Logbook();
        List<String> completeLog = logbook.readAllEntries();

        final LocalDate moonLanding = LocalDate.of(1969, Month.JULY, 20);
        List<String> moonLandingLog = logbook.readEntries(moonLanding);
    }
}