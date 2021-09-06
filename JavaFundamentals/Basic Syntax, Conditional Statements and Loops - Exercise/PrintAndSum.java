package Fundamentals.BasicExersize;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNum = Integer.parseInt(scan.nextLine());
        int lastNum = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for(int i=firstNum;i<=lastNum;i++)
        {
            System.out.printf("%d ",i);
            sum = sum+i;
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
