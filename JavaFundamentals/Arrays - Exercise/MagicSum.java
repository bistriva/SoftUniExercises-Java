package Fundamentals.ArraysExersize;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int n= Integer.parseInt(scan.nextLine());

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++) {
                if (arr[i] + arr[j] == n)
                    System.out.printf("%d %d\n", arr[i], arr[j]);
            }
        }

    }
}
