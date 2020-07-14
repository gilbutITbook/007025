/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package lambdas.favor_method_references_over_lambdas.problem;

import java.util.ArrayList;
import java.util.List;

class Test {

}

interface Supply {

    String getName();

    boolean isUncontaminated();

    boolean isContaminated();
}

class Inventory {

    List<Supply> supplies = new ArrayList<>();

    long countDifferentKinds() {
        return supplies.stream()
                       .filter(supply -> !supply.isContaminated())
                       .map(supply -> supply.getName())
                       .distinct()
                       .count();
    }
}
