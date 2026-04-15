package sessia12;

public class ArrayChecker {

    //1. Реализуйте класс с тремя методами.
    //2. Написать тестовый класс с использованием JUnit
    //3. Покрыть каждый метод класса тестами для достижения 100% покрытия кода.
    //Класс ArrayChecker
    //1. Метод для проверки, является ли массив отсортированным:
    //boolean isSorted(int[] array).
    //2. Метод для проверки, содержит ли массив только четные числа:
    //boolean containsOnlyEven(int[] array).
    //3. Метод для проверки, содержит ли массив только уникальные элементы:
    //boolean hasUniqueElements(int[] array).

    public boolean isSorted(int[] array){
        boolean up = true;
        boolean down = true;
        for (int i = 0; i < array.length - 1; i++){
            if(!(array[i] < array[i+1])){
                up = false;
            }
            if(!(array[i] > array[i+1])){
                down = false;
            }
        }
        return up || down;
    }

    public boolean containsOnlyEven(int[] array){
        for(int number : array){
            if(number % 2 != 0){
                return false;
            }
        }
        return  true;
    }

    public boolean hasUniqueElements(int[] array){
        for(int k = 0; k < array.length - 1; k++){
            for(int i = k+1; i<array.length; i++){
                if(array[k] == array[i]) return false;
            }
        }
        return true;
    }
}
