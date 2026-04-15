package sessia18;

public class StringArrayOperations {
    //1. Реализуйте класс с тремя методами.
    //2. Написать тестовый класс с использованием JUnit
    //3. Покрыть каждый метод класса тестами для достижения 100% покрытия кода.
    //Класс StringArrayOperations
    //1. Метод для нахождения количества строк в массиве, содержащих заданную подстроку:
    //int countStringsContaining(String[] array, String substring).
    //2. Метод для нахождения количества строк в массиве, заканчивающихся на заданный
    //символ:
    //int countStringsEndingWith(String[] array, char target).
    //3. Метод для нахождения количества строк в массиве, начинающихся с заданного
    //символа:
    //int countStringsStartingWith(String[] array, char target).

    public int countStringsContaining(String[] array, String substring){
        int count = 0;
        for(String object : array){
            if(object.contains(substring)) count++;
        }
        return count;
    }

    public int countStringsEndingWith(String[] array, char target){
        int count = 0;
        for(String object : array){
            if(object.endsWith(String.valueOf(target))) count++;
        }
        return count;
    }

    public int countStringsStartingWith(String[] array, char target){
        int count = 0;
        for(String object : array){
            if(object.startsWith(String.valueOf(target))) count++;
        }
        return count;
    }
}
