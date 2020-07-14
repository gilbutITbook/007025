/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package lambdas.favor_optional_over_null.problem;

class Connection {

    void send(String message) {

    }
}

class Communicator {

    Connection connectionToEarth;

    void establishConnection() {
        // used to set connectionToEarth, but may be unreliable
    }

    Connection getConnectionToEarth() {
        return connectionToEarth;
    }
}

class Usage {
    static void main() {
        Communicator communicator = new Communicator();
        communicator.getConnectionToEarth()
                    .send("Houston, we got a problem!");
    }
}
