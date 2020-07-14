/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package lambdas.favor_functional_over_imperative_style.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Test {

}

interface Supply {

    String getName();

    boolean isUncontaminated();
}

class Inventory {

    List<Supply> supplies = new ArrayList<>();

    long countDifferentKinds() {
        return supplies.stream()
                       .filter(supply -> supply.isUncontaminated())
                       .map(supply -> supply.getName())
                       .distinct()
                       .count();
    }
}

class Whatever {
    void main() {
        Predicate<Supply> uncontaminated = supply -> supply.isUncontaminated();
        Function<Supply, String> supplyToName = supply -> supply.getName();
    }
}
