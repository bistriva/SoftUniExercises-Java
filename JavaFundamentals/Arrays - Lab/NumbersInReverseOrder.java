package Fundamentals.Arrays;

import java.util.Scanner;

public class NumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String[] array = new String[n];

        for(int i=0;i<n;i++){
            array[i]=scan.nextLine();
        }
        for(int i=n-1;i>=0;i--){
            System.out.printf("%s ",array[i]);
        }
    }
}
