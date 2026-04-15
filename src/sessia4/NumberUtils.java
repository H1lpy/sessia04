package sessia4;

public class NumberUtils {
    //1. Метод для проверки, является ли число простым:
    //boolean isPrime(int number).
    //2. Метод для нахождения суммы всех делителей числа (кроме самого числа):
    //int sumOfDivisors(int number).
    //3. Метод для проверки, является ли число совершенным:
    //boolean isPerfectNumber(int number).

    public boolean isPrime(int number){
        if(number < 2) return false;
        for(int i=2; i<number; i++)
            if(number % i == 0) return false;
        return true;
    }

    public int sumOfDivisors(int number){
        int sum = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0) sum+= i;
        }
        return sum;
    }

    public boolean isPerfectNumber(int number){
        int sum = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0) sum+=i;
        }
        return sum == number;
    }
}
