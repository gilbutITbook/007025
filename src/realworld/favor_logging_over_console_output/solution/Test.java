/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package realworld.favor_logging_over_console_output.solution;

import java.util.Arrays;
import java.util.List;

import general.favor_foreach_over_for.Commander;
import general.favor_foreach_over_for.Status;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Test {

}

class LaunchChecklist {

    private static final Logger LOGGER =
            LogManager.getLogger(LaunchChecklist.class);

    List<String> checks = Arrays.asList("Cabin Pressure",
                                        "Communication",
                                        "Engine");

    Status prepareAscend(Commander commander) {
        LOGGER.info("{}: Prepare ascend", commander);
        LOGGER.debug("{} Checks: {}", checks.size(), checks);
        for (String check : checks) {
            if (commander.isFailing(check)) {
                LOGGER.warn("{}: {} ... FAILURE", commander, check);
                LOGGER.error("{}: Abort take off!", commander);
                return Status.ABORT_TAKE_OFF;
            }
            LOGGER.info("{}: {} ... OK", commander, check);
        }
        LOGGER.info("{}: Read for take off!", commander);
        return Status.READY_FOR_TAKE_OFF;
    }
}
