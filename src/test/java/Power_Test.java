import static org.junit.Assert.*;
import org.junit.Test;

public class Power_Test {


    @Test
    public void testPower() {
        // Test case 1: Positive base and exponent
        double base1 = 2.0;
        double exp1 = 3.0;
        double expectedResult1 = 8.0;
        assertEquals(expectedResult1, Scientific_Calculator.power(base1,exp1), 0.001);

        // Test case 2: Zero base and exponent
        double base2 = 0.0;
        double exp2 = 0.0;
        double expectedResult2 = 1.0;
        assertEquals(expectedResult2, Scientific_Calculator.power(base2,exp2), 0.001);

        // Test case 3: Negative base and exponent
        double base3 = -2.0;
        double exp3 = -3.0;
        double expectedResult3 = -0.125;
        assertEquals(expectedResult3, Scientific_Calculator.power(base3,exp3), 0.001);

        // Test case 4: Base is zero and exponent is negative
        double base4 = 0.0;
        double exp4 = -3.0;
        Double expectedResult4 = Double.POSITIVE_INFINITY;
        assertEquals(expectedResult4, Scientific_Calculator.power(base4,exp4), 0.001);
    }

}