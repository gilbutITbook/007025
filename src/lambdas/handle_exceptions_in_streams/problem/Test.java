/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package lambdas.handle_exceptions_in_streams.problem;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

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

    private static Path STORAGE = Paths.get("/var/log");

    static List<LogBook> getAll() throws IOException {
        return Files.walk(STORAGE)
                    .filter(Files::isRegularFile)
                    .filter(LogBook::isLogbook)
                    .map(path -> {
                        try {
                            return new LogBook(path);
                        } catch (IOException e) {
                            throw new UncheckedIOException(e);
                        }
                    })
                    .collect(Collectors.toList());
    }
}
