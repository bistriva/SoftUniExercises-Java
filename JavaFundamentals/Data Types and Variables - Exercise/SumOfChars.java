package Fundamentals.DataTypesAndVarsExersice;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        byte n = Byte.parseByte(scan.nextLine());
        int charSum=0;

        for(int i=0;i<n;i++){
            char symbol = scan.nextLine().charAt(0);
            charSum+=symbol;
        }

        System.out.printf("The sum equals: %d", charSum);
    }
}
