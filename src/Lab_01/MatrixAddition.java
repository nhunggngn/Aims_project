package Lab_01;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước của ma trận
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Tạo ma trận thứ nhất
        int[][] matrix1 = createMatrix(scanner, rows, columns, "Matrix 1");

        // Tạo ma trận thứ hai
        int[][] matrix2 = createMatrix(scanner, rows, columns, "Matrix 2");

        // Tính tổng hai ma trận
        int[][] sumMatrix = addMatrices(matrix1, matrix2);

        // In ra ma trân tổng
        System.out.println("Sum of matrices:");
        printMatrix(sumMatrix);
    }
    // Phương thức nhập giá trị cho các phần tử của ma trận
    private static int[][] createMatrix(Scanner scanner, int rows, int columns, String matrixName) {
        System.out.println("Enter the elements of " + matrixName + ":");
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrixName + "[" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
// Phương thức cộng ma trận
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int[][] sumMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sumMatrix;
    }
//Phương thức in ma trận
    private static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
