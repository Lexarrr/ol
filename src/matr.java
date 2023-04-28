import java.util.*;

public class matr {
    public static void main(String[] args) {
        int n = 10;
        int m = 10;
        int[][] matr = new int[n][m];
        fillRanMatr(matr);
        printMatrix(matr);

        System.out.println();
        System.out.println(Arrays.toString(countRepriz(matr)));
        System.out.println(Arrays.toString(toGetMass(matr)));
        System.out.println();
        sortSpirMatrix(matr, n, m);
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

    public static int[] countRepriz(int[][] matrix) {
        int[] res = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = j + 1; k < matrix[i].length; k++) {
                    if (matrix[i][j] == matrix[i][k]) {
                        res[i]++;

                    }
                }
            }
        }
        return res;
    }

//    public static ArrayList<Integer> toAList (int[][] array) {
//        ArrayList<Integer> arr = new ArrayList<>();
//            for (int[] i : array) {
//            for(int j : i){
//                arr.add(j);
//            }
//        }
//
//        return arr;
//    }

    public static int[] toGetMass(int[][] mat) {
        int[] matInMas = new int[mat.length * mat[0].length];
        for (int i = 0, k = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                matInMas[k] = mat[i][j];
                k++;

            }
        }
        Arrays.sort(matInMas);
        return matInMas;

    }

    public static void sortSpirMatrix(int[][] matrix, int row, int col) {
        int[] arr = toGetMass(matrix);
        int c = 0;
        int count = arr[c];
        int[][] spiral = new int[row][col];
            for (row = arr[c]; row < spiral.length; row++) {
                for (col = arr[c]; col < spiral.length - 1; col++) {
                    int minR = 0;
                    int maxR = spiral.length - 1;
                    int minCol = 0;
                    int maxCol = spiral.length - 1;
                    int max = row * col;
                    while (count < max) {
                        //влево
                        for (int k = minCol; k <= maxCol; k++) {
                            matrix[minR][k] = count++;
                        }
                        minR += 1;
                        //вниз по правой стороне
                        for (int k = minR; k <= maxR; k++) {
                            matrix[k][maxCol] = count++;
                        }
                        maxCol -= 1;
                        //вправо по низу
                        for (int k = maxCol; k >= minCol; k--) {
                            matrix[maxR][k] = count++;
                        }
                        maxR -= 1;
                        //вверх  по левой стороне
                        for (int k = maxR; k >= minR; k--) {
                            matrix[k][minCol] = count++;
                        }
                        minCol += 1;
//                    for (row = 0; row < spiral.length; row++) {
//                        for (col = 0; col < spiral.length -1; col++) {
//                            if (spiral[row][col] == 0)
//                                spiral[row][col] = count;
//                        }
//                }


                }
            }
        }

        printMatrix(matrix);
    }
}

