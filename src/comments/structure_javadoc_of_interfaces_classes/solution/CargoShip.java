/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package comments.structure_javadoc_of_interfaces_classes.solution;

import java.util.Queue;
import java.util.Stack;

import general.Supply;

/**
 * A cargo ship can load and unload supplies according to its capacity.
 *
 * <p>
 * Supplies are loaded sequentially and can be unloaded in LIFO
 * (last-in-first-out) order. The cargo ship can only store supplies up to
 * its capacity. Its capacity is never negative.
 */
interface CargoShip {
    Stack<Supply> unload();
    Queue<Supply> load(Queue<Supply> supplies);
    int getRemainingCapacity();
}
