import static org.junit.Assert.*;
import org.junit.Test;

public class Logarithm_Test {



    @Test
    public void testLogarithm() {
        // Test case 1: Logarithm of positive number with base 10
        double num1 = 100.0;
        double expectedResult1 = 4.60517;
        assertEquals(expectedResult1, Scientific_Calculator.logarithm(num1), 0.001);

        // Test case 2: Logarithm of positive number with base e (natural logarithm)
        double num2 = 2.718;
        double expectedResult2 = 1.0;
        assertEquals(expectedResult2, Scientific_Calculator.logarithm(num2), 0.001);

        // Test case 3: Logarithm of zero with any base
        double num3 = 0.0;
        Double expectedResult3 = Double.NEGATIVE_INFINITY;
        assertEquals(expectedResult3, Scientific_Calculator.logarithm(num3), 0.001);

        // Test case 4: Logarithm of negative number with any base
        double num4 = -10.0;
        Double expectedResult4 = Double.NaN; // Logarithm of negative number is undefined
        assertEquals(expectedResult4, Scientific_Calculator.logarithm(num4), 0.001);

    }

}