/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package design.combine_state_and_behavior.problem;

class Hull {
    int holes;
}


class HullRepairUnit {

    void repairHole(Hull hull) {
        if (isIntact(hull)) {
            return;
        }
        hull.holes--;
    }

    boolean isIntact(Hull hull) {
        return hull.holes == 0;
    }
}
