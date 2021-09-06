package Fundamentals.DataTypesAndVarsExersice;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startYield = Integer.parseInt(scan.nextLine());
        int days=0;
        int totalAmount=0;

        while(startYield>=100){
            days++;
            totalAmount+=startYield-26;
            startYield-=10;
        }
        if(startYield>=26)
            totalAmount-=26;
        else
            totalAmount-=startYield;
        if(days==0)
            totalAmount=0;
        System.out.println(days);
        System.out.println(totalAmount);
    }
}
