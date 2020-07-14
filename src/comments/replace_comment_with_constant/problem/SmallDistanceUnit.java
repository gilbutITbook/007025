/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package comments.replace_comment_with_constant.problem;

enum SmallDistanceUnit {

    CENTIMETER,
    INCH;

    double getConversionRate(SmallDistanceUnit unit) {
        if (this == unit) {
            return 1; // identity conversion rate
        }

        if (this == CENTIMETER && unit == INCH) {
            return 0.393701; // one centimeter in inch
        } else {
            return 2.54; // one inch in centimeters
        }
    }
}
