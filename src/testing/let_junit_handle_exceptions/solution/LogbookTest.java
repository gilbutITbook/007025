/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package testing.let_junit_handle_exceptions.solution;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import testing.let_junit_handle_exceptions.Logbook;

class LogbookTest {

    @Test
    void readLogbook() throws IOException {
        Logbook logbook = new Logbook();

        List<String> entries = logbook.readAllEntries();

        Assertions.assertEquals(13, entries.size());
    }

    @Test
    void readLogbookFail() {
        Logbook logbook = new Logbook();

        Executable when = () -> logbook.readAllEntries();

        Assertions.assertThrows(IOException.class, when);
    }
}

