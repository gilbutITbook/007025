/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package general.return_boolean_expression_directly.solution;

class Astronaut {

    String name;
    int missions;

    boolean isValid() {
        return missions >= 0 && name != null && !name.trim().isEmpty();
    }
}

class Main {
    String name = "";
    int missions = 1;

    boolean isValid() {
        boolean isValidMissions = missions >= 0;
        boolean isValidName = name != null && !name.trim().isEmpty();
        return isValidMissions && isValidName;
    }
}
