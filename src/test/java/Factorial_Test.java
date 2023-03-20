import static org.junit.Assert.*;
import org.junit.Test;

public class Factorial_Test {


    @Test
    public void testFactorial() {
        // Test case 1: Factorial of positive number
        int num1 = 4;
        int expectedResult1 = 24;
        assertEquals(expectedResult1, Scientific_Calculator.factorial(num1));

        // Test case 2: Factorial of zero
        int num2 = 0;
        int expectedResult2 = 1;
        assertEquals(expectedResult2, Scientific_Calculator.factorial(num2));

    }

}