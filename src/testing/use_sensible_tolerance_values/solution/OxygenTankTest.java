/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package testing.use_sensible_tolerance_values.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testing.OxygenTank;


class OxygenTankTest {
    static final double TOLERANCE = 0.00001;


    @Test
    void testNewTankIsEmpty() {
        OxygenTank tank = OxygenTank.withCapacity(100);

        Assertions.assertEquals(0, tank.getStatus(), TOLERANCE);
    }

    @Test
    void testFilling() {
        OxygenTank tank = OxygenTank.withCapacity(100);

        tank.fill(5.8);
        tank.fill(5.6);

        Assertions.assertEquals(0.114, tank.getStatus(), TOLERANCE);
    }
}
