package Fundamentals.BasicExersize;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int digit;
        int sum =0;
        int multiple =1;
        String num = scan.nextLine();

        for(int i=0;i<=num.length()-1;i++)
        {
            digit = num.charAt(i) - '0';
            multiple =1;
            for(int j=digit;j>=1;j--){
                multiple = multiple*j;
            }
            sum = sum+multiple;
        }

        if(sum == Integer.parseInt(num))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
