package Fundamentals.ArraysExersize;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int rotations = Integer.parseInt(scan.nextLine());

        String[] arr = input.split(" ");

        for(int i=0;i<rotations;i++)
        {
            String tempVal = arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=tempVal;
        }
        String output = String.join(" ", arr);
        System.out.println(output);

    }
}
