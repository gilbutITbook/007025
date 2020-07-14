/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package lambdas.avoid_exceptions_in_streams.solution;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Test {

}

class LogBook {

    LogBook(Path path) throws IOException {
        Files.readAllLines(path);
    }

    static boolean isLogbook(Path path) {
        return false;
    }
}

class LogBooks {

    static List<LogBook> getAll() throws IOException {
        try (Stream<Path> stream = Files.walk(Paths.get("/var/log"))) {
            return stream.filter(Files::isRegularFile)
                         .filter(LogBook::isLogbook)
                         .flatMap(path -> {
                             try {
                                 return Stream.of(new LogBook(path));
                             } catch (IOException e) {
                                 return Stream.empty();
                             }
                         })
                         .collect(Collectors.toList());
        }
    }
}

class LogBooks2 {

    private static Path STORAGE = Paths.get("/var/log");

    static List<LogBook> getAll() throws IOException {
        try (Stream<Path> stream = Files.walk(STORAGE)) {

            return stream.filter(Files::isRegularFile)
                         .filter(LogBook::isLogbook)
                         .map(path -> {
                             try {
                                 return new LogBook(path);
                             } catch (IOException e) {
                                 return null;
                             }
                         })
                         .filter(Objects::nonNull)
                         .collect(Collectors.toList());
        }
    }
}
