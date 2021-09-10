package Fundamentals.ArraysExersize;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] input = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

        for(int i=0;i<input.length;i++){
            boolean isBigger=true;
            for(int j=i+1;j<input.length;j++){
                if (input[j]>=input[i]) {
                    isBigger=false;
                }
            }
            if(isBigger)
                System.out.printf("%d ",input[i]);
        }
    }
}
