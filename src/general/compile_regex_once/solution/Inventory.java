/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package general.compile_regex_once.solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

import general.Supply;

class Inventory {

    private List<Supply> supplies = new ArrayList<>();

    List<Supply> find(String regex) {
        List<Supply> result = new LinkedList<>();
        Pattern pattern = Pattern.compile(regex);
        for (Supply supply : supplies) {
            if (pattern.matcher(supply.toString()).matches()) {
                result.add(supply);
            }
        }
        return result;
    }
}
