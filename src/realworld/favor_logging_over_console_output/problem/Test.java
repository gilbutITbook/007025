/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package realworld.favor_logging_over_console_output.problem;

import java.util.Arrays;
import java.util.List;

import general.favor_foreach_over_for.Commander;
import general.favor_foreach_over_for.Status;

class Test {

}

class LaunchChecklist {

    List<String> checks = Arrays.asList("Cabin Pressure",
                                        "Communication",
                                        "Engine");

    Status prepareAscend(Commander commander) {
        System.out.println("Prepare ascend");
        for (String check : checks) {
            if (commander.isFailing(check)) {
                System.out.println(check + " ... FAILURE");
                System.err.println("Abort take off");
                return Status.ABORT_TAKE_OFF;
            }
            System.out.println(check + " ... OK");
        }
        System.out.println("Read for take off");
        return Status.READY_FOR_TAKE_OFF;
    }
}
