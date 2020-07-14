/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package design.favor_abstract_over_concrete_types.problem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

import design.favor_abstract_over_concrete_types.CargoShip;
import general.Supply;

class Inventory {
    LinkedList<Supply> supplies = new LinkedList();

    void stockUp(ArrayList<Supply> delivery) {
        supplies.addAll(delivery);
    }

    LinkedList<Supply> getContaminatedSupplies() {
        LinkedList<Supply> contaminatedSupplies = new LinkedList<>();
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
        ArrayList<Supply> loadableDelivery = new ArrayList<>(delivery);
        inventory.stockUp(loadableDelivery);
    }
}