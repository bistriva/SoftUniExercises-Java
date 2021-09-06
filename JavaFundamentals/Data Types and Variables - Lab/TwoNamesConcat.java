package Fundamentals.DataTypesAndVars;

import java.util.Scanner;

public class TwoNamesConcat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name1 = scan.nextLine();
        String name2=scan.nextLine();
        String del = scan.nextLine();

        System.out.printf("%s%s%s",name1,del,name2);
    }
}
