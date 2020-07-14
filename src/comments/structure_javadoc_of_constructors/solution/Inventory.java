/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package comments.structure_javadoc_of_constructors.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import general.Supply;

class Inventory {

    List<Supply> supplies;

    /**
     * Creates an empty inventory.
     *
     * @see Inventory#Inventory(Collection) instantiate with initial supplies
     */
    Inventory() {
        this(new ArrayList<>());
    }

    /**
     * Creates an inventory with an initial shipment of supplies.
     *
     * @param initialSupplies Initial supplies.
     *                        Must not be null, can be empty.
     * @throws NullPointerException if initialSupplies is null
     * @see Inventory#Inventory() instantiate with no supplies
     */
    Inventory(Collection<Supply> initialSupplies) {
        this.supplies = new ArrayList<>(initialSupplies);
    }
}

