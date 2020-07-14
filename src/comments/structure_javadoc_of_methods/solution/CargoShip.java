/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package comments.structure_javadoc_of_methods.solution;

import java.util.Queue;
import java.util.Stack;

import general.Supply;

interface CargoShip {
    
    Stack<Supply> unload();

    /**
     * Loads supplies onto the cargo ship.
     *
     * <p>
     * Only lets you load as many supplies as there is remaining capacity.
     *
     * Example:
     * <pre>
     * int capacity = cargoShip.getRemainingCapacity(); // 1
     * Queue&lt;Supply> supplies = Arrays.asList(new Supply("Apple"));
     * Queue&lt;Supply> spareSupplies = cargoShip.load(supplies);
     * spareSupplies.isEmpty(); // true;
     * cargoShip.getRemainingCapacity() == 0; // true
     * </pre>
     *
     * @param supplies to be loaded; must not be null
     * @return supplies that could not be loaded because of too little
     *          capacity; is empty if everything has been loaded
     * @throws NullPointerException if supplies is null
     * @see CargoShip#getRemainingCapacity() check capacity
     * @see CargoShip#unload() unload the supplies
     */
    Queue<Supply> load(Queue<Supply> supplies);

    int getRemainingCapacity();
}
