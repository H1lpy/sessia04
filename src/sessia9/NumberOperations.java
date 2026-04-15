package sessia9;

public class NumberOperations {

    //Задание
    //1. Реализуйте класс с тремя методами.
    //2. Написать тестовый класс с использованием JUnit
    //3. Покрыть каждый метод класса тестами для достижения 100% покрытия кода.
    //Класс NumberOperations
    //1. Метод для нахождения суммы всех делителей числа:
    //int sumOfDivisors(int number).
    //2. Метод для проверки, является ли число совершенным:
    //boolean isPerfectNumber(int number).
    //3. Метод для нахождения обратного числа:
    //double reciprocal(double number).

    public int sumOfDivisors(int number){
        int sum = 0;
        for(int i = 1; i<number; i++){
            if(number % i == 0) sum += i;
        }
        return sum;
    }

    public boolean isPerfectNumber(int number){
        int sum = 0;
        for(int i = 1; i<number; i++){
            if(number % i == 0) sum += i;
        }
        return number == sum;
    }

    public double reciprocal(double number){
        return 1/number;
    }
}
