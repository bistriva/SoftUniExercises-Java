package Fundamentals.BasicExersize;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int dev = 0;

        if(num%2==0)
            dev=2;
        if(num%3==0)
            dev = 3;
        if(num%6 ==0)
            dev = 6;
        if(num%7==0)
            dev = 7;
        if(num%10==0)
            dev=10;

        if(dev ==0)
            System.out.println("Not divisible");
        else
            System.out.printf("The number is divisible by %d", dev);
    }
}
