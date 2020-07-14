/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package testing.parametrize_your_tests.solution;

import design.favor_immutable_over_mutable_state.DistanceUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import testing.parametrize_your_tests.Distance;

class DistanceConversionTest {

    @ParameterizedTest(name = "#{index}: {0}km == {0}km->mi->km")
    @ValueSource(ints = {1, 1_000, 9_999_999})
    void testConversionRoundTrip(int kilometers) {
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
