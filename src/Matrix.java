import java.util.Arrays;
import java.util.Random;

public class Matrix {
    public static void main(String[] args) {
        int n = 10;
        int m = 10;
        int[][] matr = new int[n][m];
        fillRanMatr(matr);
        printMatrix(matr);

        System.out.println();
        System.out.println(Arrays.toString(CountRepriz(matr)));
        System.out.println();
        SortSpirMatrix(matr);
        System.out.println();
    }
    public static void fillRanMatr(int[][] matrix) {
        Random ran = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ran.nextInt(99);
            }
        }
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3s", matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static int[] CountRepriz(int[][] matrix) {
        int[] res = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == matrix[i++]) {
                res[i]++;
            }
        }
        return res;
    }
    public static void SortSpirMatrix(int[][] matrix) {
        int row = 0, col = 0;

        for (row = matrix[row][col]; row < matrix.length; row++) {
            for (col = matrix[row][col]; col < matrix.length; col++) {
                if (matrix[row][col] < matrix[row++][col++]) {
                    int minRow = row;
                    int maxRow = row - 1;
                    int minCol = col;
                    int maxCol = col - 1;
                    int count = matrix[row][col];
                    int max = row * col;

                    while (count < max) {
                        //влево
                        for (int k = minCol; k <= maxCol; k++) {
                            matrix[minRow][k] = count;
                            count++;

                        }
                        minRow = minRow + 1;
                        //вниз по правой стороне
                        for (int k = minRow; k <= maxRow; k++) {
                            matrix[k][maxCol] = count;
                            count++;
                        }
                        maxCol = maxCol - 1;
                        //вправо по низу
                        for (int k = maxCol; k >= minCol; k--) {
                            matrix[maxRow][k] = count;
                            count++;
                        }
                        maxRow = maxRow - 1;
                        //вверх  по левой стороне
                        for (int k = maxRow; k >= minRow; k--) {
                            matrix[k][minCol] = count;
                            count++;
                        }
                        minCol = minCol + 1;

                    }
                }
            }
        }
            printMatrix(matrix);
    }
}


