/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package comments.document_implementation_decisions;

import java.util.Objects;

public class Supply implements Comparable<Supply> {

    private final String name;

    public Supply(String name) {
        this.name = Objects.requireNonNull(name);
    }

    @Override
    public int compareTo(Supply o) {
        return this.name.compareTo(o.name);
    }
}
