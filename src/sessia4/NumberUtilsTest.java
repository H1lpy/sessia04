package sessia4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NumberUtilsTest {

    @Test
    public void isPrimeTest(){
        NumberUtils nu = new NumberUtils();
        boolean result = true;
        assertEquals(result, nu.isPrime(5));
    }

    @Test
    public void sumOfDivisorsTest(){
        NumberUtils nu = new NumberUtils();
        int result = 1;
        assertEquals(result, nu.sumOfDivisors(3));
    }

    @Test
    public void isPerfectNumber(){
        NumberUtils nu = new NumberUtils();
        boolean result = true;
        assertEquals(result, nu.isPerfectNumber(6));
    }
}
