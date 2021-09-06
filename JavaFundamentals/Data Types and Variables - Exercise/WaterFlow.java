package Fundamentals.DataTypesAndVarsExersice;

import java.util.Scanner;

public class WaterFlow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lines=Integer.parseInt(scan.nextLine());
        int capacity = 0;

        for(int i=1;i<=lines;i++){
            int quantity = Integer.parseInt(scan.nextLine());
            if((capacity+quantity)>255) {
                System.out.println("Insufficient capacity!");
            }
            else
                capacity+=quantity;
        }
        System.out.println(capacity);
    }
}
