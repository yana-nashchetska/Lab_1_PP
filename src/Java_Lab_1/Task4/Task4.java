package Java_Lab_1.Task4;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Matrix matrix1 = new Matrix();

        System.out.println("Enter the number of rows: ");
        matrix1.setRowsCount(scan.nextInt());
        System.out.println("Enter the number of columns: ");
        matrix1.setColumnsCount(scan.nextInt());

        Matrix.generateMatrix(matrix1.getRowsCount(), matrix1.getColumnsCount());
        Matrix.PrintMatrix(Matrix.generateMatrix(matrix1.getRowsCount(), matrix1.getColumnsCount()));

   /*     //matrix1.generateMatrix(matrix1.getRowsCount(), matrix1.getColumnsCount());
        Matrix.PrintMatrix(matrix1.generateMatrix());*/



    }
}
