/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package naming.avoid_abbreviations.problem;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class Logbook {
    static final Path DIR = Paths.get("/var/log");
    static final Path CSV = DIR.resolve("stats.csv");
    static final String GLOB = "*.log";

    void createStats() throws IOException {
        try (DirectoryStream<Path> dirStr =
                     Files.newDirectoryStream(DIR, GLOB);
             BufferedWriter bufW = Files.newBufferedWriter(CSV)) {
            for (Path lFile : dirStr) {
                String csvLn = String.format("%s,%d,%s",
                        lFile,
                        Files.size(lFile),
                        Files.getLastModifiedTime(lFile));
                bufW.write(csvLn);
                bufW.newLine();
            }
        }
    }
}
