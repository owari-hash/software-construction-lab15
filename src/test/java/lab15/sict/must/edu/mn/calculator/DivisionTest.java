package lab15.sict.must.edu.mn.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Division operations.
 */
public class DivisionTest {

    private Division division;

    @BeforeEach
    public void setUp() {
        division = new Division();
    }

    @Test
    public void testDividePositive() {
        assertEquals(2.0, division.divide(6.0, 3.0), 0.0001, "6.0 / 3.0 should equal 2.0");
    }

    @Test
    public void testDivideNegative() {
        assertEquals(-2.0, division.divide(6.0, -3.0), 0.0001, "6.0 / (-3.0) should equal -2.0");
    }

    @Test
    public void testDivideZeroDividend() {
        assertEquals(0.0, division.divide(0.0, 5.0), 0.0001, "0.0 / 5.0 should equal 0.0");
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            division.divide(1.0, 0.0);
        });

        String expectedMessage = "Cannot divide by zero";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testIsSafeDivisionWithZero() {
        assertFalse(division.isSafeDivision(0.0), "Division by zero should not be safe");
    }

    @Test
    public void testIsSafeDivisionWithNonZero() {
        assertTrue(division.isSafeDivision(3.5), "Division by non-zero should be safe");
    }

    @Test
    public void testResultIsIntegerTrue() {
        assertTrue(division.resultIsInteger(6.0, 3.0), "6.0 / 3.0 should be an integer");
    }

    @Test
    public void testResultIsIntegerFalse() {
        assertFalse(division.resultIsInteger(5.0, 2.0), "5.0 / 2.0 should not be an integer");
    }

    @Test
    public void testResultIsIntegerWithZeroDivisor() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            division.resultIsInteger(5.0, 0.0);
        });

        String expectedMessage = "Cannot divide by zero";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}