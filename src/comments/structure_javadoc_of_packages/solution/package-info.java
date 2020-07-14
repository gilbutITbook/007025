/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
/**
 * Classes for managing an inventory of supplies.
 *
 * <p>
 * The core class is the {@link logistics.Inventory} that lets you
 * <ul>
 * <li> stock it up from a {@link logistics.CargoShip},
 * <li> dispose of any contaminated {@link logistics.Supply},
 * <li> and search for any {@link logistics.Supply} by name.
 * </ul>
 *
 * <p>
 * The classes let you unload supplies and immediately dispose of any supply
 * that was contaminated.
 * <pre>
 * Inventory inventory = new Inventory();
 * inventory.stockUp(cargoShip.unload());
 * inventory.disposeContaminatedSupplies();
 * inventory.getContaminatedSupplies().isEmpty(); // true
 * </pre>
 */
package logistics;
