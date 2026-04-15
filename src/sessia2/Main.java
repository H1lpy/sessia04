package sessia2;


public class Main {
    public static void main(String[] args) {
        ArrayOperations ao = new ArrayOperations();

        int[] Array1 = {432,3,1,8,180,187,100,434,430,60};
        System.out.println(ao.findSecondLargest(Array1));

        int[] Array2 = {4,3,3,1,8,6,4,23,88,90};
        System.out.println(ao.sumMultiplesOf3(Array2));

        int[] Array3 = {90,3,2,1,8,6,9,23,88,90};
        System.out.println(ao.hasDuplicates(Array3));
    }
}

