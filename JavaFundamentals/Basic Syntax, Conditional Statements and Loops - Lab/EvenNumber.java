package Fundamentals.BasicSyntax;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=0;

        while(true){
            num = Integer.parseInt(scan.nextLine());
            if(num%2==0){
                System.out.printf("The number is: %d", Math.abs(num));
                break;
            }
            else
                System.out.println("Please write an even number.");
        }
    }
}
