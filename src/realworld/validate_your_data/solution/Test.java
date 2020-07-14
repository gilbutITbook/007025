/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package realworld.validate_your_data.solution;

import java.util.Objects;

class Test {

}

class NameTag {

    final String name;

    NameTag(String name) {
        Objects.requireNonNull(name);
        this.name = name;
    }
}

class Usage {

     static void main(String[] args) {
        System.out.println(new NameTag("ARMSTRONG").name);
        System.out.println(new NameTag("ARMSTRONG").name);
        System.out.println(new NameTag("ALDRIN").name);
        System.out.println(new NameTag("ARMSTRONG").name);
        System.out.println(new NameTag("GATES").name);
        System.out.println(new NameTag("刘").name);
    }
}
