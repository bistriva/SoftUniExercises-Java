package Fundamentals.BasicSyntax;

import java.util.Scanner;

public class RefractorSumOfOddNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 1;
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\n",2 * i + 1);
            sum += 2 * i;
        }
        sum+=n-1;
        System.out.printf("Sum: %d%n", sum);

        }
}
