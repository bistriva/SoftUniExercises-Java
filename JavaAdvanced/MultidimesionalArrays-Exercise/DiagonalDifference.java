package MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = Integer.parseInt(scan.nextLine());
        String pattern = "\\s+";
        int[][] matrix = readMatrix(rows, scan, pattern);

        int sum = sumMatrixDiagonals(matrix);
        System.out.println(sum);

    }

    private static int sumMatrixDiagonals(int[][] matrix) {
        int sum=0;
        int leftDiagonal=0;
        int rightDiagonal =0;
        for(int i=0;i<matrix.length;i++){
            leftDiagonal+=matrix[i][i];
            rightDiagonal+=matrix[matrix.length-i-1][i];
        }
        sum=leftDiagonal-rightDiagonal;
        return Math.abs(sum);
    }

    private static int[][] readMatrix(int rows, Scanner scan, String pattern) {
        int[][] matrix = new int[rows][rows];
        for(int i=0;i<rows;i++) {
            int[] inputArr = Arrays.stream(scan.nextLine().split(pattern)).mapToInt(Integer::parseInt).toArray();
            matrix[i] = inputArr;
        }
        return matrix;
    }
}
