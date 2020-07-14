/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package lambdas.avoid_optional_fields_or_parameters.solution;

import java.util.Objects;
import java.util.Optional;

class Connection {

    void send(String message) {

    }
}

class Communicator {

    Connection connectionToEarth;

    void setConnectionToEarth(Connection connectionToEarth) {
        this.connectionToEarth = Objects.requireNonNull(connectionToEarth);
    }
    Optional<Connection> getConnectionToEarth() {
        return Optional.ofNullable(connectionToEarth);
    }

    void reset() {
        connectionToEarth = null;
    }
}
