package sessia17;

public class MathStringUtils {
    //1. Реализуйте класс с тремя методами.
    //2. Написать тестовый класс с использованием JUnit
    //3. Покрыть каждый метод класса тестами для достижения 100% покрытия кода.
    //Класс MathStringUtils
    //1. Метод для нахождения суммы чисел в строке, разделенных пробелами:
    //int sumNumbersInString(String str).
    //2. Метод для нахождения произведения чисел в строке, разделенных пробелами:
    //long productNumbersInString(String str).
    //3. Метод для нахождения среднего арифметического чисел в строке, разделенных
    //пробелами:
    //double averageNumbersInString(String str).

    public int sumNumbersInString(String str){
        String[] str_massive = str.split(" ");
        int sum = 0;
        for(String object : str_massive){
            sum += Integer.parseInt(object);
        }
        return sum;
    }

    public long productNumbersInString(String str){
        String[] splitted = str.split(" ");
        long result = 1;
        for(String number : splitted){
            result *= Long.parseLong(number);
        }
        return result;
    }

    public double averageNumbersInString(String str){
        String[] splitted = str.split(" ");
        int sum = 0;
        for(String object : splitted){
            sum += Integer.parseInt(object);
        }
        return (double) sum / splitted.length;
    }
}
