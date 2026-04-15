package sessia5;

public class Main {
    public static void main(String[] args){
        MatrixUtils mu = new MatrixUtils();

        int[][] matrix = {
                {1,2,3},
                {1,20,3},
                {1,2,3}
        };
        System.out.println(mu.sumMainDiagonal(matrix));

        int[][] matrix2 = {
                {1,2,4},
                {1,4,3},
                {4,2,3}
        };
        System.out.println(mu.sumSecondaryDiagonal(matrix2));
    }
}
