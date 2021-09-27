package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = Integer.parseInt(scan.nextLine());
        int cols = Integer.parseInt(scan.nextLine());
        char[][] firstMatrix = readMatrix(rows,cols,scan);
        char[][] secondMatrix = readMatrix(rows,cols,scan);
        char[][] resultMatrix=new char[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                    resultMatrix[i][j]= firstMatrix[i][j] == secondMatrix[i][j] ? firstMatrix[i][j] : '*';
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    private static char[][] readMatrix(int rows, int cols, Scanner scan) {
        char[][] matrix = new char[rows][cols];
        for(int i=0;i<rows;i++) {
                 matrix[i]=scan.nextLine().replaceAll("\\s+","").toCharArray();

        }
        return matrix;
    }
}
