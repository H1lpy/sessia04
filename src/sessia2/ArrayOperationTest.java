package sessia2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationTest {

    @Test
    public void findSecondLargestTest(){
        ArrayOperations ao = new ArrayOperations();
        int result = 7;
        int[] array = {1,2,3,4,5,6,7,8};
        assertEquals(result, ao.findSecondLargest(array));
    }

    @Test
    public void findSecondLargestTestErr(){
        ArrayOperations ao = new ArrayOperations();
        int[] array = {1};
        assertThrows(IllegalArgumentException.class, () -> {
            ao.findSecondLargest(array);
        });
    }

    @Test
    public void findSecondLargestTest2(){
        ArrayOperations ao = new ArrayOperations();
        int result = 98;
        int[] array = {1,2,3,4,99,98,7,8};
        assertEquals(result, ao.findSecondLargest(array));
    }

    @Test
    public void sumMultiplesOf3Test(){
        ArrayOperations ao = new ArrayOperations();
        int result = 30;
        int[] array = {1,2,10,10,9,9,9,3};
        assertEquals(result, ao.sumMultiplesOf3(array));
    }

    @Test
    public void hasDuplicatesTrue(){
        ArrayOperations ao = new ArrayOperations();
        boolean result = true;
        int[] array = {1,2,3,4,5,6,7,1};
        assertEquals(result,ao.hasDuplicates(array));
    }

    @Test
    public void hasDuplicatesFalse(){
        ArrayOperations ao = new ArrayOperations();
        boolean result = false;
        int[] array = {1,2,3,4,5,6,7,8};
        assertEquals(result,ao.hasDuplicates(array));
    }
}
