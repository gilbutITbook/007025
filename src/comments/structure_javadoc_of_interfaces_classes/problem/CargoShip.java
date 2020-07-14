/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package comments.structure_javadoc_of_interfaces_classes.problem;


import java.util.Queue;
import java.util.Stack;

import general.Supply;

/**
 * This class represents a cargo ship.
 * It can unload a {@link Stack} of supplies, load a {@link Queue} of
 * supplies, and it can show the remainingCapacity as a long.
 */
interface CargoShip {
    Stack<Supply> unload();
    Queue<Supply> load(Queue<Supply> supplies);
    int getRemainingCapacity();
}
