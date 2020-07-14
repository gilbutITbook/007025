/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package testing.describe_tests.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import testing.OxygenTank;

class OxygenTankTest {
    static final double PERMILLE = 0.001;

    @Test
    @DisplayName("Expect 44% after filling 22l in an empty 50l tank")
    @Disabled("We don't have small tanks anymore! TODO: Adapt for big tanks")
    void fillTank() {
        OxygenTank smallTank = OxygenTank.withCapacity(50);

        smallTank.fill(22);

        Assertions.assertEquals(0.44, smallTank.getStatus(), PERMILLE);
    }

    @Test
    @DisplayName("Fail if fill level > tank capacity")
    void failOverfillTank() {
        OxygenTank bigTank = OxygenTank.withCapacity(10_000);
        bigTank.fill(5344.0);

        Executable when = () -> bigTank.fill(6000);

        Assertions.assertThrows(IllegalArgumentException.class, when);
    }
}
