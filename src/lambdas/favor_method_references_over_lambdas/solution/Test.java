/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package lambdas.favor_method_references_over_lambdas.solution;

import java.util.ArrayList;
import java.util.List;

class Test {

}

interface Supply {

    String getName();

    boolean isContaminated();

    boolean isUncontaminated();
}

class Inventory {

    List<Supply> supplies = new ArrayList<>();

    long countDifferentKinds() {
        return supplies.stream()
                       .filter(Supply::isUncontaminated)
                       .map(Supply::getName)
                       .distinct()
                       .count();
    }
}
