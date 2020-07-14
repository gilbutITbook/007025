/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package naming.avoid_meaningless_words.problem;


class MainSpaceShipManager {
    AbstractRocketPropulsionEngine abstractRocketPropulsionEngine;
    INavigationController navigationController;
    boolean turboEnabledFlag;

    void navigateSpaceShipTo(PlanetInfo planetInfo) {
        RouteData data = navigationController.calculateRouteData(planetInfo);
        LogHelper.logRouteData(data);
        abstractRocketPropulsionEngine.invokeTask(data, turboEnabledFlag);
    }
}
 class LogHelper {
     static void logRouteData(RouteData data) {
    }
}

interface RouteData {
}

interface PlanetInfo {
}

interface INavigationController {
    void invokeNavigationTask(RouteData someData);

    RouteData calculateRouteData(PlanetInfo someData);
}

class AbstractRocketPropulsionEngine {
    void invokeTask(RouteData someData, boolean b) {
    }

    ;
}