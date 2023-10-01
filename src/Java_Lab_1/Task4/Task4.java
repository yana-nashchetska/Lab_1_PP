package Java_Lab_1.Task4;

public class Task4 {
    public static void main(String[] args) {

        System.out.println("\n Before multiplying matrices: ");

        System.out.println("\n First matrix: ");
        int[][] matrix1 = MatrixOperations.inputMatrixSizes();
        MatrixOperations.printMatrix(matrix1);

        System.out.println("\n Second matrix: ");
        int[][] matrix2 = MatrixOperations.inputMatrixSizes();
        MatrixOperations.printMatrix(matrix2);

        System.out.println("\n After multiplying matrices: ");
        MatrixOperations.multiplyMatrices(matrix1, matrix2);
    }
}