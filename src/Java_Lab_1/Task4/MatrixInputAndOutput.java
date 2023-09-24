package Java_Lab_1.Task4;
import java.util.Scanner;

public class MatrixInputAndOutput {
    public static void matrixInAndOut() {

        Scanner scan = new Scanner(System.in);
        Matrix matrix = new Matrix();

        System.out.println(" Enter the number of rows: ");
        matrix.setRowsCount(scan.nextInt());
        System.out.println(" Enter the number of columns: ");
        matrix.setColumnsCount(scan.nextInt());

        Matrix.generateMatrix(matrix.getRowsCount(), matrix.getColumnsCount());
        Matrix.PrintMatrix(Matrix.generateMatrix(matrix.getRowsCount(), matrix.getColumnsCount()));
    }


}
