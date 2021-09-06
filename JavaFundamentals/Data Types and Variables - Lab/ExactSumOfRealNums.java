package Fundamentals.DataTypesAndVars;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        BigDecimal sum = new BigDecimal(0);
        BigDecimal num;

        for(int i=0;i<n;i++)
        {
            num = new BigDecimal(scan.nextLine());
            sum = sum.add(num);
        }
        System.out.println(sum);
    }
}
