/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package lambdas.use_optionals_as_streams.solution;

import java.util.Optional;


interface Connection {

    void send(String message);

    boolean isFree();
}

interface Logbook {

    void log(String message);
}

interface Storage {

    String getBackup();
}

class Communicator {

    private Connection connectionToEarth;

    Optional<Connection> getConnectionToEarth() {
        return Optional.ofNullable(connectionToEarth);
    }
}

class BackupJob {

    Communicator communicator;
    Storage storage;

    void backupToEarth() {
        Connection connection = communicator.getConnectionToEarth()
                .filter(Connection::isFree)
                .orElseThrow(IllegalStateException::new);
        connection.send(storage.getBackup());
    }
}

class Usage {

    static void main() {
        Communicator communicator = null;
        String state = communicator.getConnectionToEarth()
                                    .map(Connection::isFree)
                                    .map(isFree -> isFree ? "free" : "busy")
                                    .orElse("absent");
    }
}

