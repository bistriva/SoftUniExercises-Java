package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2X2Submatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] matrixDimensions = Arrays.stream(scan.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = readMatrix(matrixDimensions[0], matrixDimensions[1], scan);
        int maxSum = 0;
        int[][] resultMatrix = new int[2][2];
        int maxRow=0;
        int maxCol=0;


        for (int i = 0; i < matrixDimensions[0]-1; i++) {
            for(int j=0;j<matrixDimensions[1]-1;j++) {
                int sum = 0;
                for (int k = 0; k < 2; k++) {
                    for (int l = 0; l < 2; l++) {
                        sum += matrix[k+i][l+j];
                    }
                }
                if (maxSum < sum) {
                    maxSum = sum;
                    maxRow=i;
                    maxCol=j;
                }

            }
        }
        for(int k=0;k<2;k++){
            for(int l=0;l<2;l++){
                resultMatrix[k][l]=matrix[k+maxRow][l+maxCol];
            }
        }

        Arrays.stream(resultMatrix).forEach(arr -> System.out.println(arr[0]+" " +arr[1]));
        System.out.println(maxSum);

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
