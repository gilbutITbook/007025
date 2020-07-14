/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package lambdas.avoid_side_effects.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Test {

}

interface Supply {

    String getName();

    boolean isUncontaminated();
}

class Inventory {

    List<Supply> supplies = new ArrayList<>();

    long countDifferentKinds() {
        List<String> names = supplies.stream()
                                     .filter(Supply::isUncontaminated)
                                     .map(Supply::getName)
                                     .distinct()
                                     .collect(Collectors.toList());
        return names.size();
    }
}

class Inventory2 {

    List<Supply> supplies = new ArrayList<>();

    long countDifferentKinds() {
        return supplies.stream()
                       .filter(Supply::isUncontaminated)
                       .map(Supply::getName)
                       .distinct()
                       .count();
    }
}
