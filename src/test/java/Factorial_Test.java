import static org.junit.Assert.*;
import org.junit.Test;

// Test
//test3
// dummy

public class Factorial_Test {


    @Test
    public void testFactorial() {
        // Test case 1: Factorial of positive number
        int num1 = 5;
        int expectedResult1 = 120;
        assertEquals(expectedResult1, Scientific_Calculator.factorial(num1));

        // Test case 2: Factorial of zero
        int num2 = 0;
        int expectedResult2 = 1;
        assertEquals(expectedResult2, Scientific_Calculator.factorial(num2));

    }

}