/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package testing.cover_the_edge_cases.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testing.cover_the_edge_cases.Transmission;
import testing.cover_the_edge_cases.TransmissionParser;

class TransmissionParserTest {

    @Test
    void testValidTransmission() {
        TransmissionParser parser = new TransmissionParser();

        Transmission transmission = parser.parse("032Houston, UFO sighted!");

        Assertions.assertEquals(32, transmission.getId());
        Assertions.assertEquals("Houston, UFO sighted!",
                transmission.getContent());
    }
}
