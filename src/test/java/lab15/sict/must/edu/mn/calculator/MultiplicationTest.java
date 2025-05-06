package lab15.sict.must.edu.mn.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Multiplication operations.
 */
public class MultiplicationTest {

    private Multiplication multiplication;

    @BeforeEach
    public void setUp() {
        multiplication = new Multiplication();
    }

    @Test
    public void testMultiplyPositive() {
        assertEquals(6.0, multiplication.multiply(2.0, 3.0), 0.0001, "2.0 * 3.0 should equal 6.0");
    }

    @Test
    public void testMultiplyNegative() {
        assertEquals(-6.0, multiplication.multiply(2.0, -3.0), 0.0001, "2.0 * (-3.0) should equal -6.0");
    }

    @Test
    public void testMultiplyZero() {
        assertEquals(0.0, multiplication.multiply(0.0, 5.0), 0.0001, "0.0 * 5.0 should equal 0.0");
    }

    @Test
    public void testIsPositiveResultBothPositive() {
        assertTrue(multiplication.isPositiveResult(2.0, 3.0), "Product of two positives should be positive");
    }

    @Test
    public void testIsPositiveResultBothNegative() {
        assertTrue(multiplication.isPositiveResult(-2.0, -3.0), "Product of two negatives should be positive");
    }

    @Test
    public void testIsPositiveResultOneNegative() {
        assertFalse(multiplication.isPositiveResult(2.0, -3.0), "Product of positive and negative should be negative");
    }

    @Test
    public void testIsPositiveResultWithZero() {
        assertFalse(multiplication.isPositiveResult(0.0, 5.0), "Product with zero should not be positive");
    }
}