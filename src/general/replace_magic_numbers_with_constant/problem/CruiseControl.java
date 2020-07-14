/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package general.replace_magic_numbers_with_constant.problem;

class CruiseControl {

    private double targetSpeedKmh;

    void setPreset(int speedPreset) {
        if (speedPreset == 2) {
            setTargetSpeedKmh(16944);
        } else if (speedPreset == 1) {
            setTargetSpeedKmh(7667);
        } else if (speedPreset == 0) {
            setTargetSpeedKmh(0);
        }
    }

    void setTargetSpeedKmh(double speed) {
        targetSpeedKmh = speed;
    }
}

class Main {
    static void usage() {
        CruiseControl cruiseControl = null;
        cruiseControl.setPreset(1);
        cruiseControl.setPreset(2);
        cruiseControl.setPreset(-1);
    }
}
