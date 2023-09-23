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

/*    public static int[][] multiplyMatrix(int[][] matrix) {

    }*/
    public static void PrintMatrix (int[][] matrix) {

        System.out.println("\n Before multiplying matrix: \n");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}
