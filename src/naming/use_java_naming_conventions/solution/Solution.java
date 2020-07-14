/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package naming.use_java_naming_conventions.solution;


class Solution {}

class Rover {
    static final double WALKING_SPEED = 3;

    final String serialNumber;
    double milesPerHour;

    Rover(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    void drive() {
        milesPerHour = WALKING_SPEED;
    }

    void stop() {
        milesPerHour = 0;
    }
}
