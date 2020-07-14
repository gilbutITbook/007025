/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package naming.use_domain_terminology.problem;

import java.time.LocalDate;
import java.util.Arrays;

class Problem {
}


class Person {
    String lastName;
    String role;
    int travels;
    LocalDate employedSince;

    String serializeAsLine() {
        return String.join(",",
                Arrays.asList(lastName,
                        role,
                        String.valueOf(travels),
                        String.valueOf(employedSince))
        );
    }
}
