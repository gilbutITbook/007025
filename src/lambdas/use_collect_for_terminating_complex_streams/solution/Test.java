/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package lambdas.use_collect_for_terminating_complex_streams.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Test {

}

interface Supply {

    String getName();

    boolean isUncontaminated();
}

class Inventory {

    List<Supply> supplies = new ArrayList<>();

    Map<String, Long> countDifferentKinds() {
        return supplies.stream()
                       .filter(Supply::isUncontaminated)
                       .collect(Collectors.groupingBy(Supply::getName,
                               Collectors.counting())
                       );
    }
}
