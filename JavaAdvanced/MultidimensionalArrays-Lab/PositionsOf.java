package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] matrixDimesions = scan.nextLine().split("\\s+");
        int rows = Integer.parseInt(matrixDimesions[0]);
        int cols = Integer.parseInt(matrixDimesions[1]);
        int[][] matrix = readMatrix(rows,cols,scan);
        int number = Integer.parseInt(scan.nextLine());
        boolean isfound = false;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == number) {
                    isfound=true;
                    System.out.println(i + " " + j);
                }
            }
        }
        if(!isfound)
            System.out.println("not found");

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
