/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package general.avoid_leaking_references.problem;

import java.util.ArrayList;
import java.util.List;

import general.Supply;

class Inventory {

    private final List<Supply> supplies;

    Inventory(List<Supply> supplies) {
        this.supplies = supplies;
    }

    List<Supply> getSupplies() {
        return supplies;
    }
}

class Usage {

    static void main(String[] args) {
        List<Supply> supplies = new ArrayList<>();
        Inventory inventory = new Inventory(supplies);

        inventory.getSupplies().size(); // == 0
        supplies.add(new Supply("Apple"));
        inventory.getSupplies().size(); // == 1

        inventory.getSupplies().add(new Supply("Banana"));
        inventory.getSupplies().size(); // == 2
    }
}
