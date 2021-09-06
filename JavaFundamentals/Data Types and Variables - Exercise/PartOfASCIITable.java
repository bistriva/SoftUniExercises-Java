package Fundamentals.DataTypesAndVarsExersice;

import java.util.Scanner;

public class PartOfASCIITable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        byte startChar = Byte.parseByte(scan.nextLine());
        byte endChar = Byte.parseByte(scan.nextLine());

        for(int i=startChar;i<=endChar;i++){
            System.out.printf("%c ",i);
        }
    }
}
