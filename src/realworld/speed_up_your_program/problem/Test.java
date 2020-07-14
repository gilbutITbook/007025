/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package realworld.speed_up_your_program.problem;

import java.util.List;

class Test {

}

interface Supply {

    String getName();

    boolean isUncontaminated();

    boolean isContaminated();
}

class Inventory {

    List<Supply> supplies;

    long countDifferentKinds() {
        return supplies.stream()
                       .sequential() // this can be omitted
                       .filter(Supply::isUncontaminated)
                       .map(Supply::getName)
                       .distinct()
                       .count();
    }
}
