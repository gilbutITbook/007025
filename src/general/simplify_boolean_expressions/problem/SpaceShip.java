/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package general.simplify_boolean_expressions.problem;


import general.simplify_boolean_expressions.Crew;
import general.simplify_boolean_expressions.FuelTank;
import general.simplify_boolean_expressions.Hull;
import general.simplify_boolean_expressions.Navigator;
import general.simplify_boolean_expressions.OxygenTank;

class SpaceShip {

    Crew crew;
    FuelTank fuelTank;
    Hull hull;
    Navigator navigator;
    OxygenTank oxygenTank;

    boolean willCrewSurvive() {
        return hull.holes == 0 &&
                fuelTank.fuel >= navigator.requiredFuelToEarth() &&
                oxygenTank.lastsFor(crew.size) > navigator.timeToEarth();
    }
}
