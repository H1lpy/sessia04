package sessia10;

public class ArrayMath {

    //1. Реализуйте класс с тремя методами.
    //2. Написать тестовый класс с использованием JUnit
    //3. Покрыть каждый метод класса тестами для достижения 100% покрытия кода.
    //Класс ArrayMath
    //1. Метод для нахождения среднего значения элементов массива:
    //double average(int[] array).
    //2. Метод для нахождения произведения элементов массива:
    //long product(int[] array).
    //3. Метод для нахождения минимального элемента в массиве:
    //int findMin(int[] array).

    public double average(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum+=array[i];
        }
        return (double) sum/array.length;
    }

    public long product(int[] array){
        long pr = 1;
        for(int i = 0;i < array.length; i++){
            pr *= array[i];
        }
        return pr;
    }

    public int findMin(int[] array){
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min) min = array[i];
        }
        return min;
    }
}
