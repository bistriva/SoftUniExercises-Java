package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[][] matrix = readMatrix(n,n,scan, "\\s+");

        for(int i=0;i<n;i++){
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
        int j=0;
        for(int i=n-1;i>=0;i--){
             System.out.print(matrix[i][j] + " ");
            j++;
        }
        System.out.println();
    }
    private static int[][] readMatrix(int rows, int cols, Scanner scan, String splitPattern) {
        int[][] matrix = new int[rows][cols];
        for(int i=0;i<rows;i++) {
            int[] inputArr = Arrays.stream(scan.nextLine().split(splitPattern)).mapToInt(Integer::parseInt).toArray();
            matrix[i] = inputArr;
        }
        return matrix;
    }
}
