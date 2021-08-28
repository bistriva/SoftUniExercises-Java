package Fundamentals.BasicSyntax;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());

        for(int i=m;i<=10;i++){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
        if(m>10)
            System.out.printf("%d X %d = %d\n",n,m,n*m);

    }
}
