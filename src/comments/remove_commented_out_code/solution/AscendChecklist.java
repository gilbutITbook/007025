/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package comments.remove_commented_out_code.solution;

import java.util.Arrays;
import java.util.List;

import general.favor_foreach_over_for.Commander;
import general.favor_foreach_over_for.Status;

class LaunchChecklist {

    List<String> checks = Arrays.asList(
            "Cabin Leak",
            "Engine",
            "Hull",
            "OxygenTank"
    );

    Status prepareLaunch(Commander commander) {
        for (String check : checks) {
            boolean shouldAbortTakeoff = commander.isFailing(check);
            if (shouldAbortTakeoff) {
                return Status.ABORT_TAKE_OFF;
            }
        }
        return Status.READY_FOR_TAKE_OFF;
    }
}
