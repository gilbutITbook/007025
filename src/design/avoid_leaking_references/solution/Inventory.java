/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package design.avoid_leaking_references.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import general.Supply;

class Inventory {

    private final List<Supply> supplies;

    Inventory(List<Supply> supplies) {
        this.supplies = new ArrayList<>(supplies);
    }

    List<Supply> getSupplies() {
        return Collections.unmodifiableList(supplies);
    }
}

class Usage {

    static void main(String[] args) {
        List<Supply> externalSupplies = new ArrayList<>();
        Inventory inventory = new Inventory(externalSupplies);

        inventory.getSupplies().size(); // == 0
        externalSupplies.add(new Supply("Apple"));
        inventory.getSupplies().size(); // == 0

        // UnsupportedOperationException
        inventory.getSupplies().add(new Supply("Banana"));
    }
}
