/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package preface.intro.solution;

class HelloWorld {

    public static void main(String[] arguments) {
        if (isEmpty(arguments)) {
            return;
        }

        System.out.println("Hello " + arguments[0]);
    }

    private static boolean isEmpty(String[] array) {
        return (array == null) || (array.length == 0);
    }
}
