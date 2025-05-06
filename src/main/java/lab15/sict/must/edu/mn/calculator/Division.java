package lab15.sict.must.edu.mn.calculator;

/**
 * A class that provides division operations.
 */
public class Division {

    /**
     * Divides two numbers.
     *
     * @param a dividend
     * @param b divisor
     * @return the quotient of a divided by b
     * @throws IllegalArgumentException if b is zero
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    /**
     * Determines if a division is safe to perform.
     *
     * @param divisor the divisor to check
     * @return true if division is safe, false if divisor is zero
     */
    public boolean isSafeDivision(double divisor) {
        if (divisor == 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Determines if the result of a division will be an integer.
     *
     * @param a dividend
     * @param b divisor
     * @return true if the result is an integer, false otherwise
     * @throws IllegalArgumentException if b is zero
     */
    public boolean resultIsInteger(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }

        double result = a / b;
        return result == Math.floor(result);
    }
}