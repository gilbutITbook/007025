/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package comments.replace_comment_with_constant.solution;

enum SmallDistanceUnit {

    CENTIMETER,
    INCH;

    static final double INCH_IN_CENTIMETERS = 2.54;
    static final double CENTIMETER_IN_INCHES = 1 / INCH_IN_CENTIMETERS;
    static final int IDENTITY = 1;


    double getConversionRate(SmallDistanceUnit unit) {
        if (this == unit) {
            return IDENTITY;
        }

        if (this == CENTIMETER && unit == INCH) {
            return CENTIMETER_IN_INCHES;
        } else {
            return INCH_IN_CENTIMETERS;
        }
    }
}
