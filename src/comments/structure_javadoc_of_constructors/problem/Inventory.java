/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package comments.structure_javadoc_of_constructors.problem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import general.Supply;

class Inventory {

    List<Supply> supplies;

    /**
     * Constructor for a new Inventory.
     */
    Inventory() {
        this(new ArrayList<>());
    }

    /**
     * Another Constructor for a new Inventory.
     *
     * It is possible to add some supplies to the Inventory.
     */
    Inventory(Collection<Supply> initialSupplies) {
        this.supplies = new ArrayList<>(initialSupplies);
    }
}
