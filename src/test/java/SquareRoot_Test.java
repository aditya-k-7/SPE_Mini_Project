import static org.junit.Assert.*;
import org.junit.Test;

public class SquareRoot_Test {



    @Test
    public void testSqrt() {
        // Test case 1: Square root of positive number
        double num1 = 16.0;
        double expectedResult1 = 4.0;
        assertEquals(expectedResult1, Scientific_Calculator.squareRoot(num1), 0.001);

        // Test case 2: Square root of zero
        double num2 = 0.0;
        double expectedResult2 = 0.0;
        assertEquals(expectedResult2, Scientific_Calculator.squareRoot(num2), 0.001);

        // Test case 3: Square root of negative number
        double num3 = -16.0;
        Double expectedResult3 = Double.NaN; // Square root of negative number is undefined
        assertEquals(expectedResult3, Scientific_Calculator.squareRoot(num3), 0.001);
    }

}