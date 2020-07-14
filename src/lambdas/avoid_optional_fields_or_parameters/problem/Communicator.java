/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package lambdas.avoid_optional_fields_or_parameters.problem;

import java.util.Optional;

class Connection {

    void send(String message) {

    }
}

class Communicator {

    Optional<Connection> connectionToEarth;
    
    void setConnectionToEarth(Optional<Connection> connectionToEarth) {
        this.connectionToEarth = connectionToEarth;
    }
    Optional<Connection> getConnectionToEarth() {
        return connectionToEarth;
    }
}
