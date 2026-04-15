package sessia14;

import java.util.Arrays;

public class StringArrayUtils {

    //Задание
    //1. Реализуйте класс с тремя методами.
    //2. Написать тестовый класс с использованием JUnit
    //3. Покрыть каждый метод класса тестами для достижения 100% покрытия кода.
    //Класс StringArrayUtils
    //1. Метод для нахождения самой длинной строки в массиве:
    //String findLongestString(String[] array).
    //2. Метод для нахождения самой короткой строки в массиве:
    //String findShortestString(String[] array).
    //3. Метод для подсчета количества строк, начинающихся с заданного символа:
    //int countStringsStartingWith(String[] array, char target).

    public String findLongestString(String[] array){
        int index = 0;
        for(int i = 1; i<array.length; i++){
            if(array[index].length() < array[i].length()){
                index = i;
            }
        }
        return array[index];
    }

    public String findShortestString(String[] array){
        int index = 0;
        for(int i = 1; i<array.length; i++){
            if(array[index].length() > array[i].length()){
                index = i;
            }
        }
        return array[index];
    }

    public int countStringsStartingWith(String[] array, char target){
        int count = 0;
        for (String object : array){
            if(object.startsWith(String.valueOf(target))) count++;
        }
        return count;
    }
}
