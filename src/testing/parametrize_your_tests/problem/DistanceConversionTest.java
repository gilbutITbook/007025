/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package testing.parametrize_your_tests.problem;

import design.favor_immutable_over_mutable_state.DistanceUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testing.parametrize_your_tests.Distance;

class DistanceConversionTest {

    @Test
    void testConversionRoundTrip() {
        assertRoundTrip(1);
        assertRoundTrip(1_000);
        assertRoundTrip(9_999_999);
    }

    private void assertRoundTrip(int kilometers) {
        Distance expectedDistance = new Distance(
                DistanceUnit.KILOMETERS,
                kilometers
        );

        Distance actualDistance = expectedDistance
                .convertTo(DistanceUnit.MILES)
                .convertTo(DistanceUnit.KILOMETERS);

        Assertions.assertEquals(expectedDistance, actualDistance);
    }
}
