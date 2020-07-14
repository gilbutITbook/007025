/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package error_handling.expose_cause_in_variable.solution;

class TransmissionParser {
    static Transmission parse(String rawMessage) {
        if (rawMessage != null
                && rawMessage.length() != Transmission.MESSAGE_LENGTH) {
            throw new MalformedMessageException(
                String.format("Expected %d, but got %d characters",
                    Transmission.MESSAGE_LENGTH, rawMessage.length()),
                    rawMessage);
        }

        String rawId = rawMessage.substring(0, Transmission.ID_LENGTH);
        String rawContent = rawMessage.substring(Transmission.ID_LENGTH);
        try {
            int id = Integer.parseInt(rawId);
            String content = rawContent.trim();
            return new Transmission(id, content);
        } catch (NumberFormatException e) {
            throw new MalformedMessageException(
                String.format("Expected number, but got '%s'", rawId),
                rawMessage, e);
        }
    }
}
final class MalformedMessageException extends IllegalArgumentException {
    final String raw;

    MalformedMessageException(String message, String raw) {
        super(String.format("%s in '%s'", message, raw));
        this.raw = raw;
    }
    MalformedMessageException(String message, String raw, Throwable cause) {
        super(String.format("%s in '%s'", message, raw), cause);
        this.raw = raw;
    }
}

class Transmission {

    static final int MESSAGE_LENGTH = 146;
    static final int ID_LENGTH = 6;

    final int id;
    final String content;

    Transmission(int id, String content) {
        this.id = id;
        this.content = content;
    }
}
