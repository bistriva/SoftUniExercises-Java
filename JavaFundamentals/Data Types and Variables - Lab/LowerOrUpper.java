package Fundamentals.DataTypesAndVars;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char symbol = scan.nextLine().charAt(0);

       if(symbol>=97&&symbol<=122)
            System.out.println("lower-case");
        if(symbol>=65&&symbol<=90)
            System.out.println("upper-case");
    }
}
