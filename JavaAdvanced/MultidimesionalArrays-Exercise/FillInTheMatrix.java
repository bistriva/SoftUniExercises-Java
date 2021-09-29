package MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class FillInTheMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(",\\s+");
        int rows = Integer.parseInt(input[0]);
        int[][] matrix=fillPattern(rows, input[1]);

        printMatrix(matrix);

    }

    private static void printMatrix(int[][] matrix) {
        for(int i=0;i< matrix.length;i++){
            Arrays.stream(matrix[i]).forEach(e->System.out.print(e + " "));
            System.out.println();
        }
    }

    private static int[][] fillPattern(int rows, String s) {
        int[][] newMatrix=new int[rows][rows];
        int num=1;
        if(s.equals("A")){
            for(int j=0;j<rows;j++){
                for(int i=0;i<rows;i++){
                    newMatrix[i][j] = num;
                    num++;
                }
            }
        }
        num=1;
        if(s.equals("B")){
            for(int j=0;j<rows;j++){
                if(j%2==0) {
                    for (int i = 0; i < rows; i++) {
                        newMatrix[i][j]=num;
                        num++;
                    }
                }
                else{
                    for(int i=rows-1;i>=0;i--){
                        newMatrix[i][j]=num;
                        num++;
                    }
                }
            }
        }
        return newMatrix;
    }
}
