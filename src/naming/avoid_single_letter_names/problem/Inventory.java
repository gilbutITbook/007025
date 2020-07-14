/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package naming.avoid_single_letter_names.problem;

import java.util.ArrayList;
import java.util.List;

class Inventory {
    List<Supply> sl = new ArrayList<>();

    boolean isInStock(String n) {
        Supply s = new Supply(n);
        int l = 0;
        int h = sl.size() - 1;

        while (l <= h) {
            int m = l + (h - l) / 2;
            int c = sl.get(m).compareTo(s);

            if (c < 0) {
                l = m + 1;
            } else if (c > 0) {
                h = m - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}

class Supply {
    Supply(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    String name;

    int compareTo(Supply supply) {
        return 0;
    }
}
