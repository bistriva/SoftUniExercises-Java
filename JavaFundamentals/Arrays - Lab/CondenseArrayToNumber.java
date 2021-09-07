package Fundamentals.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr= Arrays.stream(scan.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

        if(arr.length>1) {
            int[] arr2 = arr;
            for (int j = 0; j < arr.length - 1; j++) {
                int[] newArr = new int[arr2.length - 1];
                for (int i = 0; i < arr.length - 1 - j; i++) {
                    newArr[i] = arr2[i] + arr2[i + 1];
                }
                arr2 = newArr;
                if (arr.length - 1 - j == 1)
                    System.out.printf("%d", arr2[0]);
            }
        }
        else
            System.out.println(arr[0]);

    }
}
