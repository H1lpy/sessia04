public class RecursiveMath {
    public long factorialRecursive(int n){
        if(n == 1){
            return 1;
        }
        return n * (factorialRecursive(n-1));
    }

    public int sumOfDigitsRecursive(int number){
        if(number == 1){
            return 1;
        }
        return number + sumOfDigitsRecursive(number - 1);
    }

    public int fibonacciRecursive(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
