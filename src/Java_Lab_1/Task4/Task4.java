package Java_Lab_1.Task4;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        System.out.println("\n Before multiplying matrices: ");

        System.out.println("\n First matrix: ");
        MatrixInputAndOutput.matrixInAndOut();

        System.out.println("\n Second matrix: ");
        MatrixInputAndOutput.matrixInAndOut();

        System.out.println("\n After multiplying matrices: ");
        Matrix.PrintMatrix(Matrix.multiplyMatrices(MatrixInputAndOutput.matrixInAndOut(), MatrixInputAndOutput.matrixInAndOut()));
    }
}
