/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package error_handling.always_check_type_before_cast.problem;

import java.io.IOException;
import java.io.ObjectInputStream;

import error_handling.always_check_type_before_cast.CrewMessage;
import error_handling.always_check_type_before_cast.InterCom;

class Network {

    ObjectInputStream inputStream;
    InterCom interCom;

    void listen() throws IOException, ClassNotFoundException {
        while (true) {
            Object signal = inputStream.readObject();
            CrewMessage crewMessage = (CrewMessage) signal;
            interCom.broadcast(crewMessage);
        }
    }
}
