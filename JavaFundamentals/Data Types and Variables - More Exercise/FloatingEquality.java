package Fundamentals.DataTypesAndVarsMoreExercize;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a=Double.parseDouble(scan.nextLine());
        double b=Double.parseDouble(scan.nextLine());
        double eps = 0.000001;

        if(Math.abs(a-b)>eps)
            System.out.println("False");
        else
            System.out.println("True");
    }
}
