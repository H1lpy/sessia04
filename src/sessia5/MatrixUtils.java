package sessia5;

public class MatrixUtils {
    //1. Метод для нахождения суммы элементов главной диагонали матрицы:
    //int sumMainDiagonal(int[][] matrix).
    //2. Метод для нахождения суммы элементов побочной диагонали матрицы:
    //int sumSecondaryDiagonal(int[][] matrix).
    //3. Метод для проверки, является ли матрица симметричной:
    //boolean isSymmetric(int[][] matrix).

    public int sumMainDiagonal(int[][] matrix){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            for (int k = 0; k < matrix[0].length; k++){
                if(i == k) sum+=matrix[i][k];
            }
        }
        return sum;
    }

    public int sumSecondaryDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][matrix.length - 1 - i];
        }
        return sum;
    }

    public boolean isSymmetric(int[][] matrix){
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix.length; j++){
                if(matrix[i][j] != matrix[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
}
