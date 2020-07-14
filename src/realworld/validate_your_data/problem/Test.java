/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package realworld.validate_your_data.problem;

class Test {

}

class NameTag {

    final String name;

    NameTag(String fullName) {
        this.name = parse(fullName).toUpperCase();
    }

    String parse(String fullName) {
        String[] components = fullName.split("[,| ]");
        if (components == null || components.length < 2) {
            return fullName;
        }
        if (fullName.contains(",")) {
            return components[0];
        } else {
            return components[components.length - 1];
        }
    }
}

class Usage {

     static void main(String[] args) {
        System.out.println(new NameTag("Neil Armstrong").name);
        System.out.println(new NameTag("Neil Alden Armstrong").name);
        System.out.println(new NameTag("Armstrong, Neil").name);
        System.out.println(new NameTag("Edwin Eugene Aldrin, Jr.").name);
        System.out.println(new NameTag("William \"Bill\" H. Gates III").name);
        System.out.println(new NameTag("刘伯明").name);
    }
}
