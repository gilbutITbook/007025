/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package design.favor_abstract_over_concrete_types.solution;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import design.favor_abstract_over_concrete_types.CargoShip;
import general.Supply;

class Inventory {
    List<Supply> supplies = new LinkedList();

    void stockUp(Collection<Supply> delivery) {
        supplies.addAll(delivery);
    }

    List<Supply> getContaminatedSupplies() {
        List<Supply> contaminatedSupplies = new LinkedList<>();
        for (Supply supply : supplies) {
            if (supply.isContaminated()) {
                contaminatedSupplies.add(supply);
            }
        }
        return contaminatedSupplies;
    }
}
class Usage {
    static void main(String[] args) {
        CargoShip cargoShip = null;
        Inventory inventory = null;
        Stack<Supply> delivery = cargoShip.unload();
        inventory.stockUp(delivery);
    }
}