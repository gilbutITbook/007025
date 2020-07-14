/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package testing.parametrize_your_tests;

import design.favor_immutable_over_mutable_state.DistanceUnit;

public final class Distance {
    final DistanceUnit unit;
    final double value;


    public Distance(DistanceUnit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public Distance add(Distance distance) {
        return new Distance(unit, value + distance.convertTo(unit).value);
    }

    public static Distance km(double value) {
        return new Distance(DistanceUnit.KILOMETERS, value);
    }

    public Distance convertTo(DistanceUnit otherUnit) {
        double conversionRate = unit.getConversionRate(otherUnit);
        return new Distance(otherUnit, conversionRate * value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Distance distance = (Distance) o;

        if (Double.compare(distance.value, value) != 0) return false;
        return unit == distance.unit;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = unit != null ? unit.hashCode() : 0;
        temp = Double.doubleToLongBits(value);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Distance{" +
                "unit=" + unit +
                ", value=" + value +
                '}';
    }
}
