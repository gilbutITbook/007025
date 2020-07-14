/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package general.favor_immutable_over_mutable_state;

public enum DistanceUnit {

    MILES,
    KILOMETERS,
    LIGHTYEARS;

    public static final double MILE_IN_KILOMETERS = 1.60934;
    public static final double KILOMETER_IN_MILES = 1 / MILE_IN_KILOMETERS;
    public static final double MILE_IN_LIGHT_YEARS = 1.7011E-13;
    public static final double LIGHT_YEAR_IN_MILES = 1 / MILE_IN_LIGHT_YEARS;
    public static final double KILOMETER_IN_LIGHT_YEARS = 1.057E-13;
    public static final double LIGHT_YEAR_IN_KILOMETERS = 1 / KILOMETER_IN_LIGHT_YEARS;
    public static final int IDENTITY = 1;

    public double getConversionRate(DistanceUnit unit) {
        if (this == unit) {
            return IDENTITY;
        }

        if (this == MILES) {
            if (unit == KILOMETERS) {
                return MILE_IN_KILOMETERS;
            } else {
                return MILE_IN_LIGHT_YEARS;
            }
        } else if (this == KILOMETERS) {
            if (unit == MILES) {
                return KILOMETER_IN_MILES;
            } else {
                return KILOMETER_IN_LIGHT_YEARS;
            }
        } else {
            if (unit == MILES) {
                return LIGHT_YEAR_IN_MILES;
            } else {
                return LIGHT_YEAR_IN_KILOMETERS;
            }
        }
    }

}
