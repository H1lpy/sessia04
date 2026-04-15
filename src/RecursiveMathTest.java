import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RecursiveMathTest {
    @Test
    public void testFactorialRecursive(){
        RecursiveMath rm = new RecursiveMath();
        long result = 2;
        assertEquals(2,result, rm.factorialRecursive(2));
    }

    @Test
    public void testSumOfDigitsRecursive(){
        RecursiveMath rm = new RecursiveMath();
        int result = 15;
        assertEquals(5,result, rm.sumOfDigitsRecursive(5));
    }

    @Test
    public void testFibonacciRecursive(){
        RecursiveMath rm = new RecursiveMath();
        int result = 3;
        assertEquals(5,result, rm.fibonacciRecursive(5));
    }
}
