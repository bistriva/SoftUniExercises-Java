package Fundamentals.BasicSyntax;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=Integer.parseInt(scan.nextLine());
        int sum=0;
        int i=0;
        int n=1;

        while(i<num){
            if(n%2==1) {
                System.out.println(n);
                sum = sum + n;
                i++;
            }
            n++;
        }
        System.out.printf("Sum: %d",sum);
    }
}
