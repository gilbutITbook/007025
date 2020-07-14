/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package lambdas.favor_lambdas_over_anonymous_classes.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

class Test {

}

class Calculator {

    Map<Double, Double> values = new HashMap<>();

    Double square(Double value) {
        Function<Double, Double> squareFunction = factor -> factor * factor;
        return values.computeIfAbsent(value, squareFunction);
    }
}

class Calculator2 {

    Map<Double, Double> values;

    Double square(Double value) {
        /*
        // one-liner
        Function<Double, Double> squareFunction = factor -> factor * factor;
        //  multi-liner
        Function<Double, Double> squareFunction = factor -> {
            return factor * factor;
        };
        */
        return 1.0;
    }
}

/*

*/

class Calculator3 {

    Map<Double, Double> values;

    Double square(Double value) {
        /*
        // without type definition and braces
        Function<Double, Double> squareFunction = factor -> factor * factor;
        //  with type definition and braces
        Function<Double, Double> squareFunction = (Double factor) -> factor * factor;
        */
        return 1.0;
    }
}
