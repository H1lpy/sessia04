package sessia20;

public class ArrayStringOperations {

    //Класс ArrayStringOperations
    //1. Метод для нахождения суммы длин всех строк в массиве:
    //int sumStringLengths(String[] array).
    //2. Метод для нахождения средней длины строк в массиве:
    //double averageStringLength(String[] array).
    //3. Метод для нахождения количества строк в массиве, длина которых больше заданного
    //значения:
    //int countStringsLongerThan(String[] array, int length).

    public int sumStringLengths(String[] array){
        int sum = 0;
        for (String object : array){
            sum += object.length();
        }
        return sum;
    }


    public double averageStringLength(String[] array){
        int sum = 0;
        for (String object : array){
            sum += object.length();
        }
        return (double) sum / array.length;
    }

    public int countStringsLongerThan(String[] array, int length){
        int count = 0;
        for(String object : array){
            if(object.length() > length) count++;
        }
        return count;
    }

}
