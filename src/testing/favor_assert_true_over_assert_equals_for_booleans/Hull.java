/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package testing.favor_assert_true_over_assert_equals_for_booleans;

public class Hull {
    public int holes;

    void repairHole() {
        if (isRepairNeeded()) {
            holes--;
        }
    }

    public boolean isRepairNeeded() {
        return holes > 0;
    }
}