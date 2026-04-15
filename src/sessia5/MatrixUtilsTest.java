package sessia5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class MatrixUtilsTest {

    @Test
    public void sumMainDiagonalTest(){
        MatrixUtils mu = new MatrixUtils();
        int result = 11;
        int[][] matrix = {
                {1,2,3},
                {1,9,3},
                {1,2,1}
        };
        assertEquals(result, mu.sumMainDiagonal(matrix));
    }

    @Test
    public void sumSecondaryDiagonal(){
        MatrixUtils mu = new MatrixUtils();
        int result = 13;
        int[][] matrix = {
                {1,2,3},
                {1,9,3},
                {1,2,1}
        };
        assertEquals(result, mu.sumSecondaryDiagonal(matrix));
    }

    @Test
    public void isSymmetric(){
        MatrixUtils mu = new MatrixUtils();
        boolean result = false;
        int[][] matrix = {
                {1,2,3},
                {1,9,3},
                {1,2,1}
        };
        assertEquals(result, mu.isSymmetric(matrix));
    }

    @Test
    public void isSymmetricTrue(){
        MatrixUtils mu = new MatrixUtils();
        boolean result = true;
        int[][] matrix = {
                {1,2,1},
                {2,2,2},
                {1,2,1}
        };
        assertEquals(result, mu.isSymmetric(matrix));
    }

}
