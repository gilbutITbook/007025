/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package comments.replace_comment_with_utility_method.problem;

import java.util.ArrayList;
import java.util.List;

class FuelSystem {

    List<Double> tanks = new ArrayList<>();

    int getAverageTankFillingPercent() {
        double sum = 0;
        for (double tankFilling : tanks) {
            sum += tankFilling;
        }
        double averageFuel = sum / tanks.size();
        // round to integer percent
        return Math.toIntExact(Math.round(averageFuel * 100));
    }
}

class FuelSystemAlternative {

    List<Double> tanks;

    int getAverageTankFillingPercent() {
        double sum = 0;
        for (double tankFilling : tanks) {
            sum += tankFilling;
        }
        double averageFuel = sum / tanks.size();
        int roundedToPercent = Math.toIntExact(Math.round(averageFuel * 100));
        return roundedToPercent;
    }
}