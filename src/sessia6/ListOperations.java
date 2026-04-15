package sessia6;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {

    //1. Метод для нахождения среднего значения элементов списка:
    //double averageList(List<Integer> list).
    //2. Метод для удаления всех дубликатов из списка:
    //List<Integer> removeDuplicates(List<Integer> list).
    //3. Метод для нахождения максимального элемента в списке:
    //int findMax(List<Integer> list).

    public double averageList(List<Integer> list){
        double sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        return sum / list.size();
    }

    public List<Integer> removeDuplicates(List<Integer> list){
        List<Integer> resultList = new ArrayList<Integer>();
        for(int num : list){
            if (!resultList.contains(num)){
                resultList.add(num);
            }
        }
        return resultList;
    }

    public int findMax(List<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int num : list){
            if(num > max) max = num;
        }
        return max;
    }
}
