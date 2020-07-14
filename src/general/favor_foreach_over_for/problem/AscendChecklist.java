/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package general.favor_foreach_over_for.problem;

import java.util.Arrays;
import java.util.List;

import general.favor_foreach_over_for.Commander;
import general.favor_foreach_over_for.Status;

class LaunchChecklist {

    List<String> checks = Arrays.asList("Cabin Pressure",
                                        "Communication",
                                        "Engine");

    Status prepareForTakeoff(Commander commander) {
        for (int i = 0; i < checks.size(); i++) {
            boolean shouldAbortTakeoff = commander.isFailing(checks.get(i));
            if (shouldAbortTakeoff) {
                return Status.ABORT_TAKE_OFF;
            }
        }
        return Status.READY_FOR_TAKE_OFF;
    }
}
