/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package naming.avoid_meaningless_words.solution;


class SpaceShip {
    Engine engine;
    Navigator navigator;
    boolean turboEnabled;

    void navigateTo(Planet destination) {
        Route route = navigator.calculateRouteTo(destination);
        Logger.log(route);
        engine.follow(route, turboEnabled);
    }
}

class Logger {
    static void log(Route r) {
    }
}

interface Route {
}

interface Planet {
}

interface Navigator {
    void invokeNavigationTask(Route someData);

    Route calculateRouteTo(Planet someData);
}

class Engine {
    void follow(Route someData, boolean b) {
    }

    ;
}