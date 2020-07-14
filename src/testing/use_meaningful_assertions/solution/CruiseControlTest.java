/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package testing.use_meaningful_assertions.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testing.expected_before_actual_value.CruiseControl;
import testing.expected_before_actual_value.SpeedPreset;

class CruiseControlTest {

    @Test
    void setPlanetarySpeedIs7667() {
        CruiseControl cruiseControl = new CruiseControl();

        cruiseControl.setPreset(SpeedPreset.PLANETARY_SPEED);

        Assertions.assertEquals(7667, cruiseControl.getTargetSpeedKmh());
    }
}
