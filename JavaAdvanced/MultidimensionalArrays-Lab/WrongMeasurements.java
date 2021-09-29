package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = Integer.parseInt(scan.nextLine());
        int[][] matrix = readMatrix(rows,scan);
        int[] wrongNumIndexes = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int wrongNumber = matrix[wrongNumIndexes[0]][wrongNumIndexes[1]];

         matrix = replaceWrongNumbers(matrix,wrongNumber);


       printMatrix(matrix);

    }

    private static int[][] replaceWrongNumbers(int[][] matrix, int wrongNumber) {
        int[][] resultMatrix = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==wrongNumber){
                    int rightNum = 0;
                    if(i>0 && matrix[i-1][j] != wrongNumber)
                        rightNum+=matrix[i-1][j];
                    if(i< matrix.length-1 && matrix[i+1][j] != wrongNumber){
                        rightNum+=matrix[i+1][j];
                    }
                    if(j>0 && matrix[i][j-1] != wrongNumber)
                        rightNum+=matrix[i][j-1];
                    if(j<matrix[i].length-1 && matrix[i][j+1] != wrongNumber)
                        rightNum+=matrix[i][j+1];
                    resultMatrix[i][j] = rightNum;
                }
                else
                    resultMatrix[i][j]=matrix[i][j];
            }
        }
        return resultMatrix;
    }

    private static void printMatrix(int[][] matrix) {
        for(int i=0;i< matrix.length;i++){
            Arrays.stream(matrix[i]).forEach(e->System.out.print(e + " "));
            System.out.println();
        }
    }

    private static int[][] readMatrix(int rows, Scanner scan) {
        int[][] matrix = new int[rows][];
        for(int i=0;i<rows;i++) {
            matrix[i]= Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }
}
