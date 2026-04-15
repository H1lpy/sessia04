package sessia15;

public class NumberStringUtils {
    //1. Реализуйте класс с тремя методами.
    //2. Написать тестовый класс с использованием JUnit
    //3. Покрыть каждый метод класса тестами для достижения 100% покрытия кода.
    //Класс NumberStringUtils
    //1. Метод для преобразования числа от 1 до 10 в строку:
    //String numberToString(int number).
    //2. Метод для преобразования строки в число от 1 до 10:
    //int stringToNumber(String str).
    //3. Метод для проверки, является ли строка числом:
    //boolean isNumber(String str).

    public String numberToString(int number){
        if(number >= 1 && number <= 10){
            return  String.valueOf(number);
        }else {
            return null;
        }
    }

    public int stringToNumber(String str) {
        int number = Integer.parseInt(str);
        if (number >= 1 && number <= 10) {
            return number;
        }
        throw new IllegalArgumentException("Число должно быть от 1 до 10");
    }

    public boolean isNumber(String str){
        try{
            Integer.parseInt(str);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
