/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package error_handling.always_close_multiple_resources.solution;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class Logbook {

    static final Path LOG_FOLDER = Paths.get("/var/log");
    static final Path STATISTICS_CSV = LOG_FOLDER.resolve("stats.csv");
    static final String FILE_FILTER = "*.log";

    void createStatistics() throws IOException {
        try (DirectoryStream<Path> directoryStream =
                     Files.newDirectoryStream(LOG_FOLDER, FILE_FILTER);
             BufferedWriter writer =
                     Files.newBufferedWriter(STATISTICS_CSV)) {
            for (Path logFile : directoryStream) {
                String csvLine = String.format("%s,%d,%s",
                        logFile,
                        Files.size(logFile),
                        Files.getLastModifiedTime(logFile));
                writer.write(csvLine);
                writer.newLine();
            }
        }
    }
}
