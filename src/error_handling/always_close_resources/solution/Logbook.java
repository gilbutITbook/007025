/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package error_handling.always_close_resources.solution;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


class Logbook {

    static final Path LOG_FOLDER = Paths.get("/var/log");
    static final String FILE_FILTER = "*.log";

    List<Path> getLogs() throws IOException {
        List<Path> result = new ArrayList<>();

        try (DirectoryStream<Path> directoryStream =
                     Files.newDirectoryStream(LOG_FOLDER, FILE_FILTER)) {
            for (Path logFile : directoryStream) {
                result.add(logFile);
            }
        }

        return result;
    }
}


class Main {

    private static final Path LOG_FOLDER = null;
    private static final String FILE_FILTER = "";

    static void main(String... args) throws IOException {
        DirectoryStream<Path> resource =
                Files.newDirectoryStream(LOG_FOLDER, FILE_FILTER);
        try {
            // usage of resource
        } finally {
            if (resource != null) {
                resource.close();
            }
        }
    }
}
