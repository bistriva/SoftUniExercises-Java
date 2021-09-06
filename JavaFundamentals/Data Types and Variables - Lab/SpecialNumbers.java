package Fundamentals.DataTypesAndVars;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String isSpecial = "";
        int sum=0;

        for(int i=1;i<=n;i++)
        {
            sum=0;
            int num=i;
            while(num>0) {
                sum = sum + num % 10;
                num=num/10;
            }
            if(sum==5 || sum==7 || sum==11)
                isSpecial = "True";
            else
                isSpecial="False";
            System.out.printf("%d -> %s\n",i,isSpecial);
        }
    }
}
