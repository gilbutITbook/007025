/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package lambdas.favor_lambdas_over_anonymous_classes.problem;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

class Test {

}

interface InterCom {

    void broadcast(String message);
}

class Calculator {

    Map<Double, Double> values = new HashMap<>();

    Double square(Double x) {
        Function<Double, Double> squareFunction =
                new Function<Double, Double>() {
                    @Override
                    public Double apply(Double value) {
                        return value * value;
                    }
                };
        return values.computeIfAbsent(x, squareFunction);
    }
}
