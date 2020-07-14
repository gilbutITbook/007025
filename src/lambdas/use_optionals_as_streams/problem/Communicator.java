/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package lambdas.use_optionals_as_streams.problem;

import java.util.Optional;

interface Connection {

    void send(String message);

    boolean isFree();
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
        Optional<Connection> connectionOptional =
                communicator.getConnectionToEarth();
        if (!connectionOptional.isPresent()) {
            throw new IllegalStateException();
        }

        Connection connection = connectionOptional.get();
        if (!connection.isFree()) {
            throw new IllegalStateException();
        }

        connection.send(storage.getBackup());
    }
}

