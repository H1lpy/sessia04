package sessia7;

import java.util.ArrayList;
import java.util.List;

public class AdvancedNumberUtils {

    //1. Метод для нахождения всех делителей числа:
    //List<Integer> findAllDivisors(int number).
    //2. Метод для нахождения суммы всех простых делителей числа:
    //int sumPrimeDivisors(int number).
    //3. Метод для проверки, является ли число автоморфным:
    //boolean isAutomorphic(int number).

    public List<Integer> findAllDivisors(int number){
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= number; i++){
            if(number % i == 0) list.add(i);
        }
        return list;
    }

    public boolean isPrime(int number){
        if(number < 2) return false;
        for(int i=2; i<number; i++)
            if(number % i == 0) return false;
        return true;
    }

    public int sumPrimeDivisors(int number){
        int sum = 0;
        for(int i = 2; i<number;i++){
            if(number % i == 0 && isPrime(i)){
                sum += i;
            }
        }
        return sum;
    }

    public boolean isAutomorphic(int number){
        String squareS = Long.toString(number * number);
        String numberS = Integer.toString(number);
        return squareS.endsWith(numberS);
    }
}
