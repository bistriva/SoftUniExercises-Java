package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElelments {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] matrixDimensions = Arrays.stream(scan.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();

        int[][] matrix = readMatrix(matrixDimensions[0],matrixDimensions[1],scan);
        int sum=0;
        for(int i=0;i<matrixDimensions[0];i++){
            for(int j=0;j<matrixDimensions[1];j++){
                sum+=matrix[i][j];
            }
        }
        System.out.println(matrixDimensions[0]);
        System.out.println(matrixDimensions[1]);
        System.out.println(sum);

    }
    private static int[][] readMatrix(int rows, int cols, Scanner scan) {
        int[][] matrix = new int[rows][cols];
        for(int i=0;i<rows;i++) {
            int[] inputArr = Arrays.stream(scan.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = inputArr;
        }
        return matrix;
    }
}
