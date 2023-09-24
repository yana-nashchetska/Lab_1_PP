package Java_Lab_1.Task4;
import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {
    public static int[][] matrixInAndOut() {
        Scanner scan = new Scanner(System.in);
        Matrix matrix = new Matrix();

        System.out.println(" Enter the number of rows: ");
        matrix.setRowsCount(scan.nextInt());
        System.out.println(" Enter the number of columns: ");
        matrix.setColumnsCount(scan.nextInt());
        printMatrix(generateMatrix(matrix.getRowsCount(), matrix.getColumnsCount()));

        int[][] generatedMatrix = generateMatrix(matrix.getRowsCount(), matrix.getColumnsCount());
        return generatedMatrix;
    }

    private static void printMatrix(int[][] generatedMatrix) {
        for (int[] row : generatedMatrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
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

    public static void multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rowsOfFirst = matrix1.length;
        int columnsOfFirst = matrix1[0].length;
        int rowsOfSecond = matrix2.length;
        int columnsOfSecond = matrix2[0].length;

        int[][] resultMatrix = new int[rowsOfFirst][columnsOfSecond];

        if (columnsOfFirst != rowsOfSecond) {
            System.out.println(" You cannot multiply these matrices! ");
        }
        else {
            for (int i = 0; i < rowsOfFirst; i++) {
                for (int j = 0; j < columnsOfSecond; j++) {
                    int sum = 0;
                    for (int k = 0; k < columnsOfFirst; k++) {
                        sum += matrix1[i][k] * matrix2[k][j];
                    }
                    resultMatrix[i][j] = sum;
                }
            }
            printMatrix(resultMatrix);
        }
    }
}