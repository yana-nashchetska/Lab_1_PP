package Java_Lab_1.Task4;

import java.util.Random;

public class Matrix {
    private int rowsCount;
    private int columnsCount;
    public Matrix() {
    }

    public int getRowsCount() {
        return rowsCount;
    }

    public int getColumnsCount() {
        return columnsCount;
    }

    public void setRowsCount(int rowsCount) {
        this.rowsCount = rowsCount;
    }
    public void setColumnsCount(int columnsCount) {
        this.columnsCount = columnsCount;
    }

    public static int[][] generateMatrix(int rowsCount, int columnsCount) {
        int[][] matrix = new int[rowsCount][columnsCount];
        Random random = new Random();

        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < columnsCount; j++)
                matrix[i][j] = random.nextInt(10);
        }
        return matrix;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][]matrix2) {
        int rowsOfFirst = matrix1.length; // count of rows of the first;
        int columnsOfFirst = matrix1[0].length; // count of columns of the first one;
        int rowsOfSecond = matrix2.length; // count of rows of the first;
        int columnsOfSecond = matrix2[0].length; // count of columns of the second matrix;

        int[][] result = new int[rowsOfFirst][columnsOfSecond];

        if( columnsOfFirst != rowsOfSecond) {
            System.out.println(" You cannot multiply these matrices! ");
            return result;
        } else {
           for(int rF = 0; rF < rowsOfFirst; rF++) {
               for(int cS = 0; cS < columnsOfSecond; cS++) {
                   int sum = 0;
                   for(int cF = 0; cF < columnsOfFirst; cF++) {
                       sum+= matrix1[rF][cF] * matrix2[cF][cS];
                   }
                   result[rF][cS] = sum;
               }
           }
        }
        return result;
    }
    public static void PrintMatrix (int[][] matrix) {

        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}
