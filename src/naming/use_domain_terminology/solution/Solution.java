/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package naming.use_domain_terminology.solution;

import java.time.LocalDate;
import java.util.Arrays;

class Solution {
}


class Astronaut {
    String tagName;
    String rank;
    int missions;
    LocalDate activeDutySince;

    String toCSV() {
        return String.join(",",
                Arrays.asList(tagName,
                        rank,
                        String.valueOf(missions),
                        String.valueOf(activeDutySince))
        );
    }
}
