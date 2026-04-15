package sessia6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListOperationsTest {

    //1. Метод для нахождения среднего значения элементов списка:
    //double averageList(List<Integer> list).
    //2. Метод для удаления всех дубликатов из списка:
    //List<Integer> removeDuplicates(List<Integer> list).
    //3. Метод для нахождения максимального элемента в списке:
    //int findMax(List<Integer> list).

    @Test
    public void averageListTest(){
        ListOperations lo = new ListOperations();
        double result = 15.0;
        List<Integer> list = new ArrayList<>();
        list.add(10);list.add(15);list.add(20);
        assertEquals(result, lo.averageList(list),0.0001);
    }

    @Test
    public void removeDuplicatesTest(){
        ListOperations lo = new ListOperations();
        List<Integer> result = List.of(1,12,34,54,23,6);
        List<Integer> list = List.of(1,1,1,12,1,34,12,34,54,54,1,12,23,12,6,6,6,12,1,34,23);
        assertEquals(result, lo.removeDuplicates(list));
    }

    @Test
    public void findMaxTest(){
        ListOperations lo = new ListOperations();
        int result = 15;
        List<Integer> list = List.of(1,2,3,4,1,7,3,15,2,3);
        assertEquals(result, lo.findMax(list));
    }
}
