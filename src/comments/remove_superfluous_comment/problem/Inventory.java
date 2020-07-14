/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package comments.remove_superfluous_comment.problem;

import java.util.ArrayList;
import java.util.List;

import general.Supply;

class Inventory {
    // Fields (we only have one)
    List<Supply> supplies = new ArrayList<>(); // The list of supplies.

    // Methods
    int countContaminatedSupplies() {
        // TODO: check if field is already initialized (not null)

        int contaminatedCounter = 0; // the counter
        // No supplies => no contamination
        for (Supply supply : supplies) { // begin FOR
            if (supply.isContaminated()) {
                contaminatedCounter++; // increment counter!
            } // End IF supply is contaminated
        }// End FOR

        // Returns the number of contaminated supplies.
        return contaminatedCounter; // Handle with care!
    }
} // End of Inventory class

