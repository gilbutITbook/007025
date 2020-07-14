/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package general.always_use_braces.solution;

import java.util.Objects;

import general.CruiseControl;
import general.User;

class BoardComputer {

    CruiseControl cruiseControl;

    void authorize(User user) {
        Objects.requireNonNull(user);
        if (user.isUnknown()) {
            cruiseControl.logUnauthorizedAccessAttempt();
        }
        if (user.isAstronaut()) {
            cruiseControl.grantAccess(user);
        }
        if (user.isCommander()) {
            cruiseControl.grantAccess(user);
        }
        cruiseControl.grantAdminAccess(user); // SECURITY THREAT
    }
}
