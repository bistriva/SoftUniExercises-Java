package MultidimensionalArraysLab;

import java.util.Scanner;

public class FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] matrix = readMatrix(8,8,scan);
        int queenRow=0;
        int queenCol=0;
        boolean realQueen=true;
        boolean breakFlag = false;

        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(matrix[i][j]=='q')
                {
                    realQueen = findRealQueen(matrix,i,j);
                    if(realQueen){
                        queenRow=i;
                        queenCol=j;
                        breakFlag=true;
                        break;
                    }

                }

            }
            if(breakFlag) break;
        }

        System.out.println(queenRow + " " + queenCol);

    }

    private static boolean findRealQueen(char[][] matrix, int i, int j) {

        for(int l=0;l<8;l++){
            if(matrix[i][l] == 'q' && l != j)
                return false;
        }
        for(int l=0;l<8;l++){
                if(matrix[l][j] == 'q' && l !=i)
                    return false;
            }

        int k=j-1;
        if(k>=0) {
            for (int l = i - 1; l >= 0; l--) {
                if (matrix[l][k] == 'q') {
                    return false;
                }
                if (k > 0) k--;
                else break;
            }
        }
        k=j+1;
        if(k<8) {
            for (int l = i + 1; l < 8; l++) {

                if (matrix[l][k] == 'q') {
                    return false;
                }
                if (k < 7) k++;
                else break;
            }
        }
        k=j+1;
        if(k<8) {
            for (int l = i - 1; l >= 0; l--) {
                if (matrix[l][k] == 'q') {
                    return false;
                }
                if (k < 7) k++;
                else break;
            }
        }
        k=j-1;
        if(k>=0) {
            for (int l = i + 1; l < 8; l++) {

                if (matrix[l][k] == 'q') {
                    return false;
                }
                if (k > 0) k--;
                else break;
            }
        }
        return true;
    }

    private static char[][] readMatrix(int rows, int cols, Scanner scan) {
        char[][] matrix = new char[rows][cols];
        for(int i=0;i<rows;i++) {
            matrix[i]=scan.nextLine().replaceAll("\\s+","").toCharArray();

        }
        return matrix;
    }
}
