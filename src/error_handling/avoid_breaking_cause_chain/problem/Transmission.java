/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package error_handling.avoid_breaking_cause_chain.problem;

class TransmissionParser {
    static Transmission parse(String rawMessage) {
        if (rawMessage != null
                && rawMessage.length() != Transmission.MESSAGE_LENGTH) {
            throw new IllegalArgumentException(
                String.format("Expected %d, but got %d characters in '%s'",
                        Transmission.MESSAGE_LENGTH, rawMessage.length(),
                        rawMessage));
        }

        String rawId = rawMessage.substring(0, Transmission.ID_LENGTH);
        String rawContent = rawMessage.substring(Transmission.ID_LENGTH);
        try {
            int id = Integer.parseInt(rawId);
            String content = rawContent.trim();
            return new Transmission(id, content);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(
                String.format("Expected number, but got '%s' in '%s'",
                        rawId, rawMessage));
        }
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
