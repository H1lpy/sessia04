package sessia16;

public class ArrayStringUtils {
    //1. Реализуйте класс с тремя методами.
    //2. Написать тестовый класс с использованием JUnit
    //3. Покрыть каждый метод класса тестами для достижения 100% покрытия кода.
    //Класс ArrayStringUtils
    //1. Метод для объединения массива строк в одну строку:
    //String joinStrings(String[] array, String delimiter).
    //2. Метод для разбиения строки на массив строк по разделителю:
    //String[] splitString(String str, String delimiter).
    //3. Метод для проверки, содержит ли массив строк заданную строку:
    //boolean containsString(String[] array, String target).

    public String joinStrings(String[] array, String delimiter){
        String result = "";
        for(int i = 0; i<array.length; i++){
            result+=array[i];
            if(i < array.length - 1) result+=delimiter;
        }
        return result;
    }

    public String joinStringsPr(String[] array, String delimiter){
        return String.join(delimiter, array);
    }

    public String[] splitString(String str, String delimiter){
        return str.split(delimiter);
    }

    public boolean containsString(String[] array, String target){
        for(String object : array){
            if(object.equals(target)) return true;
        }
        return false;
    }
}
