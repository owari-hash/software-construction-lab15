package lab15.sict.must.edu.mn.calculator;

/**
 * A class that provides multiplication operations.
 */
public class Multiplication {

    /**
     * Multiplies two numbers.
     *
     * @param a first number
     * @param b second number
     * @return the product of a and b
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Determines if a multiplication will result in a positive number.
     *
     * @param a first number
     * @param b second number
     * @return true if the product will be positive, false otherwise
     */
    public boolean isPositiveResult(double a, double b) {
        if (a == 0 || b == 0) {
            return false; // zero result
        } else if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
            return true; // positive result
        } else {
            return false; // negative result
        }
    }
}