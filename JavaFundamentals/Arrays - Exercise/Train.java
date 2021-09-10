package Fundamentals.ArraysExersize;

import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[] wagons=new int[n];
        int sum=0;
        String train = "";

        for(int i=0; i<n;i++){
            wagons[i]=Integer.parseInt(scan.nextLine());
            sum+=wagons[i];
            train = train + wagons[i]+" ";
        }

        System.out.println(train);
        System.out.println(sum);
    }
}
