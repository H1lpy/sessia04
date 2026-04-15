package sessia7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import sessia4.NumberUtils;

import java.util.List;

public class AdvancedNumberUtilsTest {

    //1. Метод для нахождения всех делителей числа:
    //List<Integer> findAllDivisors(int number).
    //2. Метод для нахождения суммы всех простых делителей числа:
    //int sumPrimeDivisors(int number).
    //3. Метод для проверки, является ли число автоморфным:
    //boolean isAutomorphic(int number).

    @Test
    public void findAllDivisorsTest(){
        AdvancedNumberUtils anu = new AdvancedNumberUtils();
        List<Integer> result = List.of(1,5);
        assertEquals(result,anu.findAllDivisors(5));
    }

    @Test
    public void isPrimeTest(){
        AdvancedNumberUtils anu = new AdvancedNumberUtils();
        boolean result = true;
        assertEquals(result, anu.isPrime(5));
    }

    @Test
    public void sumPrimeDivisorsTest(){
        AdvancedNumberUtils anu = new AdvancedNumberUtils();
        int result = 1796;
        assertEquals(result,anu.sumPrimeDivisors(17890));
    }

    @Test
    public void isAutomorphicTest(){
        AdvancedNumberUtils anu = new AdvancedNumberUtils();
        boolean result = true;
        assertEquals(result, anu.isAutomorphic(5));
    }


}
