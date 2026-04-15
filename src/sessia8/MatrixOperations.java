package sessia8;

public class MatrixOperations {

    //1. Реализуйте класс с тремя методами.
    //2. Написать тестовый класс с использованием JUnit
    //3. Покрыть каждый метод класса тестами для достижения 100% покрытия кода.

    //1. Метод для умножения двух матриц:
    //int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2).
    //2. Метод для нахождения определителя матрицы 3x3:
    //int determinant3x3(int[][] matrix).
    //3. Метод для транспонирования матрицы:
    //int[][] transposeMatrix(int[][] matrix).

    public int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2){
        if (matrix1[0].length != matrix2.length) {
            return null;
        }

        int rows = matrix1.length; // строки
        int column = matrix2[0].length; // столбцы
        int common = matrix1[0].length; //колво столбцов первой матрицы
        int[][] matrix_result = new int[rows][column];
        for(int i = 0; i < rows; i++){
            for(int k = 0; k < column; k++){
                for(int j = 0; j < common; j++){
                    matrix_result[i][k] += matrix1[i][j] * matrix2[k][j];
                }
            }
        }
        return matrix_result;
    }

    public int determinant3x3(int[][] matrix) {
        int a = matrix[0][0];
        int b = matrix[0][1];
        int c = matrix[0][2];
        int d = matrix[1][0];
        int e = matrix[1][1];
        int f = matrix[1][2];
        int g = matrix[2][0];
        int h = matrix[2][1];
        int i = matrix[2][2];

        return a*e*i + b*f*g + c*d*h - c*e*g - b*d*i - a*f*h;
    }

    public int[][] transposeMatrix(int[][] matrix){
        int rows = matrix[0].length;
        int column = matrix.length;
        int[][]  matrix_result = new int[rows][column];
        for(int i = 0; i < matrix[0].length; i++){
            for(int k = 0; k < matrix.length; k++){
                matrix_result[i][k] = matrix[k][i];
            }
        }
        return matrix_result;
    }
}
