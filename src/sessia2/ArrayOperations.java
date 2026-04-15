package sessia2;

import java.util.Arrays;

public class ArrayOperations {

    //Метод для нахождения второго по величине элемента в массиве:
    //int findSecondLargest(int[] array).
    public int findSecondLargest(int[] array){
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Массив должен содержать минимум 2 элемента");
        }

        int max_number = Integer.MIN_VALUE;
        int second_number = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max_number) {
                second_number = max_number;
                max_number = num;
            } else if (num > second_number && num < max_number) {
                second_number = num;
            }
        }
        return second_number;
    }


    //Метод для нахождения суммы всех элементов массива, кратных 3:
    //int sumMultiplesOf3(int[] array).
    public int sumMultiplesOf3(int[] array){
        int sum = 0;
        for(int num : array){
            if(num%3 == 0){
                sum += num;
            }
        }
        return sum;
    }


    //Метод для проверки, содержит ли массив дубликаты:
    //boolean hasDuplicates(int[] array).
    public boolean hasDuplicates(int[] array){
        for(int i=0; i< array.length - 1; i++){
            for(int k = i + 1; k < array.length; k++){
                if(array[i] == array[k]) return true;
            }
        }
        return false;
    }
}
