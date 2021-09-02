package MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //чете ред от конзолата, разделено със спейс
        int[] rowsAndCols = readArray(scanner.nextLine());

        //взема броят на редовете на масива
        int rows = rowsAndCols[0];
        //взема браят на колоните на масива
        int cols = rowsAndCols[1];

        int[][] firstMatrix = readMatrix(rows,cols,scanner);

        rowsAndCols = readArray(scanner.nextLine());
        rows = rowsAndCols[0];
        cols = rowsAndCols[1];

//        for (int row = 0; row < matrix.length; row++) {
//            int[]arr = matrix[row];
//            for (int col = 0; col < matrix[row].length; col++) {
//                System.out.print(arr[j] + " ");
//            }
//            System.out.println();
//        }
        int[][] secondMatrix = readMatrix(rows, cols, scanner);

        if (matrixAreEqual(firstMatrix, secondMatrix)){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
    }

    private static boolean matrixAreEqual(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length){
            return false;
        }
        for (int row = 0; row < firstMatrix.length; row++) {
            int[] firstArray = firstMatrix[row];
            int[] secondArray = secondMatrix[row];

            if (firstArray.length != secondArray.length){
                return false;
            }

            for (int col = 0; col < firstArray.length; col++) {
                if (firstArray[col] != secondArray[col]){
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] readMatrix(int rows, int cols, Scanner scanner){
        int [][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            matrix[i] = readArray(scanner.nextLine());
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        for (int[] arr : matrix) {
            for (int element : arr) {
                System.out.println(element + " ");
            }
            System.out.println();
        }
    }

    public static int[] readArray(String line){
        return Arrays.stream(line.split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }
}
