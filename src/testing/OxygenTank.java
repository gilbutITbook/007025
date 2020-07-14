/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package testing;

public class OxygenTank {
    final double capacity;
    double currentFilling;

    private OxygenTank(double capacity) {
        this.capacity = capacity;
    }

    public static OxygenTank withCapacity(double capacity) {
        return new OxygenTank(capacity);
    }

    public double getStatus() {

        return currentFilling / capacity;
    }

    public void fill(double amount) {
        if (currentFilling + amount > capacity) {
            throw new IllegalArgumentException(
                    String.format("Filling the tank with %f exceeds the capacity by %f", amount, currentFilling + amount - capacity));
        }
        currentFilling += amount;
    }

    public void depressurize() {

    }

    public boolean isEmpty() {
        return false;
    }

    public void fillUp() {

    }

    public boolean isFull() {
        return true;
    }
}
