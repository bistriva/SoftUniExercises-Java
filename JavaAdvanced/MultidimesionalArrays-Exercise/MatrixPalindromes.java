package MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixPalindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] input= Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        generateMatrix(input);
    }

    private static void generateMatrix(int[] input) {
        String[][] matrix = new String[input[0]][input[1]];
        for(int i=0;i<input[0];i++){
            for(int j=0;j<input[1];j++){
                String element="";
                StringBuilder phrase= new StringBuilder();
                char firstLetter = (char)(97+i);
                char midLetter = (char)(97+i+j);
                phrase.append(firstLetter);
                phrase.append(midLetter);
                phrase.append(firstLetter);
                matrix[i][j] = phrase.toString();
                phrase.delete(0,2);
            }
        }

        for(int i=0;i<matrix.length;i++){
            Arrays.stream(matrix[i]).forEach(e->System.out.print(e + " "));
            System.out.println();
        }

    }
}
