/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package design.avoid_returning_null.solution;

import java.util.Arrays;
import java.util.List;

class SpaceNations {

    /** Null object. */
    static final SpaceNation UNKNOWN_NATION = new SpaceNation("", "");

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
        return UNKNOWN_NATION;
    }
}

class SpaceNation {
    final String code;
    final String name;

    SpaceNation(String code, String name) {
        this.code = code;
        this.name = name;
    }

    String getCode() {
        return code;
    }

    String getName() {
        return name;
    }
}

class Usage {

    static void main(String[] args) {
        String us = SpaceNations.getByCode("US").getName(); // -> "United States"
        String anguilla = SpaceNations.getByCode("AI").getName(); // -> ""
    }
}
