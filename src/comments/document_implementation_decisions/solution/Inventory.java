/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package comments.document_implementation_decisions.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import comments.document_implementation_decisions.Supply;

class Inventory {
    // Keep this list sorted. See isInStock().
    private List<Supply> list = new ArrayList<>();

    void add(Supply supply) {
        list.add(supply);
        Collections.sort(list);
    }

    boolean isInStock(String name) {
        /*
         * In the context of checking availability of supplies by name,
         * facing severe performance issues with >1000 supplies
         * we decided to use the binary search algorithm
         * to achieve item retrieval within 1 second,
         * accepting that we must keep the supplies sorted.
         */
        return Collections.binarySearch(list, new Supply(name)) != -1;
    }
}
