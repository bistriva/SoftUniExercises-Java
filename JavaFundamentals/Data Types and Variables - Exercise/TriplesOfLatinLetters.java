package Fundamentals.DataTypesAndVarsExersice;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for(int i=1; i<=n;i++){
            for(int j=1;j<=n;j++){
                for(int k=1;k<=n;k++) {
                    System.out.printf("%c%c%c\n", i + 96, j+96,k+96);
                }
            }
        }
    }
}
