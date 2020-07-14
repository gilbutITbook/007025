/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package design.favor_immutable_over_mutable_state.problem;

import design.favor_immutable_over_mutable_state.DistanceUnit;

class Distance {
    DistanceUnit unit;
    double value;

    Distance(DistanceUnit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    static Distance km(double value) {
        return new Distance(DistanceUnit.KILOMETERS, value);
    }

    void add(Distance distance) {
        distance.convertTo(unit);
        value += distance.value;
    }

    void convertTo(DistanceUnit otherUnit) {
        double conversionRate = unit.getConversionRate(otherUnit);
        unit = otherUnit;
        value = conversionRate * value;
    }
}


class Main {
    static void usage() {
        Distance toMars = new Distance(DistanceUnit.KILOMETERS, 56_000_000);
        Distance marsToVenus = new Distance(DistanceUnit.LIGHTYEARS, 0.000012656528);
        Distance toVenusViaMars = toMars;
        toVenusViaMars.add(marsToVenus);
    }
}
