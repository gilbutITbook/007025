/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package testing.favor_standalone_tests.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testing.OxygenTank;

class OxygenTankTest {
    OxygenTank tank;

    @BeforeEach
    void setUp() {
        tank = OxygenTank.withCapacity(10_000);
        tank.fill(5_000);
    }

    @Test
    void depressurizingEmptiesTank() {
        tank.depressurize();

        Assertions.assertTrue(tank.isEmpty());
    }

    @Test
    void completelyFillTankMustBeFull() {
        tank.fillUp();

        Assertions.assertTrue(tank.isFull());
    }
}
