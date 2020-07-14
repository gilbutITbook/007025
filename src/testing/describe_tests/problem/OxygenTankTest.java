/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package testing.describe_tests.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import testing.OxygenTank;

class OxygenTankTest {
    static final double PERMILLE = 0.001;

    @Test
    @Disabled
    void testFill() {
        OxygenTank smallTank = OxygenTank.withCapacity(50);

        smallTank.fill(22);

        Assertions.assertEquals(0.44, smallTank.getStatus(), PERMILLE);
    }

    @Test
    private void testFill2() {
        OxygenTank bigTank = OxygenTank.withCapacity(10_000);
        bigTank.fill(5344.0);

        Executable when = () -> bigTank.fill(6000);

        Assertions.assertThrows(IllegalArgumentException.class, when);
    }
}
