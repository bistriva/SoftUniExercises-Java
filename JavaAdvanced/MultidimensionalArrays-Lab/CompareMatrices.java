package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] matrixDimesions = scan.nextLine().split("\\s+");
        int rows = Integer.parseInt(matrixDimesions[0]);
        int cols = Integer.parseInt(matrixDimesions[1]);
        int[][] matrix = readMatrix(rows,cols,scan);
        matrixDimesions = scan.nextLine().split("\\s+");
        rows = Integer.parseInt(matrixDimesions[0]);
        cols = Integer.parseInt(matrixDimesions[1]);
        int[][] matrix2 = readMatrix(rows,cols,scan);
        boolean areEqual=areEqualMatrices(matrix,matrix2);

        if(areEqual)
            System.out.println("equal");
        else
            System.out.println("not equal");
    }

    private static boolean areEqualMatrices(int[][] matrix, int[][] matrix2) {
        if(matrix.length != matrix2.length) {
            return false;
        }
        else{
            for(int i=0;i<matrix.length;i++){
                if(matrix[i].length != matrix2[i].length){
                    return false;
                }
                else{
                 for(int j=0;j<matrix[i].length;j++){
                     if(matrix[i][j]!=matrix2[i][j])
                         return false;
                    }
                }
            }
        }
        return true;
    }

    private static int[][] readMatrix(int rows, int cols, Scanner scan) {
        int[][] matrix = new int[rows][cols];
        for(int i=0;i<rows;i++) {
            int[] inputArr = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = inputArr;
        }
        return matrix;
    }
}
