/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package lambdas.favor_optional_over_null.solution;

import java.util.Optional;

class Connection {

    void send(String message) {

    }
}

class Communicator {

    Connection connectionToEarth;

    void establishConnection() {
        // used to set connectionToEarth, but may be unreliable
    }

    Optional<Connection> getConnectionToEarth() {
        return Optional.ofNullable(connectionToEarth);
    }
}

class Usage {

    static void main() {
        Communicator communicator = new Communicator();

        Connection connection = communicator.getConnectionToEarth()
                                            .orElse(null);
        connection.send("Houston, we got a problem!");
    }

    static void main2() {
        Communicator communicationSystem = new Communicator();

        communicationSystem.getConnectionToEarth()
                            .ifPresent(connection ->
                                connection.send("Houston, we got a problem!")
                            );
    }
}
