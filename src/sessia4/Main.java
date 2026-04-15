package sessia4;

public class Main {
    public static void main(String[] args){
        NumberUtils nu = new NumberUtils();

        int number1 = 12;
        System.out.println(nu.isPrime(number1));

        int number2 = 12;
        System.out.println(nu.sumOfDivisors(number2));

        int number3 = 6;
        System.out.println(nu.isPerfectNumber(number3));
    }
}
