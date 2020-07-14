/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package design.avoid_returning_null.problem;

import java.util.Arrays;
import java.util.List;

class SpaceNations {

    static List<SpaceNation> nations = Arrays.asList(
            new SpaceNation("US", "United States"),
            new SpaceNation("RU", "Russia")
    );

    static SpaceNation getByCode(String code) {
        for (SpaceNation nation : nations) {
            if (nation.getCode().equals(code)) {
                return nation;
            }
        }
        return null;
    }
}

class SpaceNation {

    final String code;
    final String name;

    SpaceNation(String code, String name) {
        this.code = code;
        this.name = name;
    }

    String getName() {
        return name;
    }

    String getCode() {
        return code;
    }
}

class Usage {

    static void main(String[] args) {
        String us = SpaceNations.getByCode("US").getName();
        // -> "United States"
        String anguilla = SpaceNations.getByCode("AI").getName();
        // -> NullPointerException
    }
}
