package sessia11;

public class StringOperations {

    //Задание
    //1. Реализуйте класс с тремя методами.
    //2. Написать тестовый класс с использованием JUnit
    //3. Покрыть каждый метод класса тестами для достижения 100% покрытия кода.
    //Класс StringOperations
    //1. Метод для конкатенации двух строк:
    //String concatenate(String str1, String str2).
    //2. Метод для проверки, начинается ли строка с заданного префикса:
    //boolean startsWith(String str, String prefix).
    //3. Метод для проверки, заканчивается ли строка заданным суффиксом:
    //boolean endsWith(String str, String suffix).

    public String concatenate(String str1, String str2){
        return str1 + str2;
    }

    public boolean startsWith(String str, String prefix){
        return str.startsWith(prefix);
    }

    public boolean endsWith(String str, String suffix){
        return str.endsWith(suffix);
    }
}
