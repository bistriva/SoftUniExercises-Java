package Fundamentals.DataTypesAndVars;

import java.util.Scanner;

public class RefractorSpecialNumbers {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                int number = Integer.parseInt(scanner.nextLine());

                for (int i = 1; i <= number; i++) {
                    int num = i;
                    int sum = 0;
                    while (num > 0) {
                        sum += num % 10;
                        num = num / 10;
                    }
                    boolean isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
                    if(isSpecial)
                        System.out.printf("%d -> True\n", i);
                    else
                        System.out.printf("%d -> False\n",i);
                }


            }
}

