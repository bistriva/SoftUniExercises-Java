package Fundamentals.ArraysExersize;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[] arr1 = new String[n];
        String[] arr2 = new String[n];

        for(int i=0; i<n; i++){
            String input = scan.nextLine();
            String[] temparr1 = input.split(" ");
            if(i%2==0) {
                arr1[i] = temparr1[0];
                arr2[i] = temparr1[1];
            }
            else {
                arr1[i] = temparr1[1];
                arr2[i] = temparr1[0];
            }
        }
        for(String a : arr1){
                System.out.printf("%s ",a);
            }
        System.out.println();
        for(String a : arr2){
            System.out.printf("%s ",a);
        }


    }
}
