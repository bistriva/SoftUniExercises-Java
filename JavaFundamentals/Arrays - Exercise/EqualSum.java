package Fundamentals.ArraysExersize;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] input= Arrays.stream(scan.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

        int leftSum=0;
        int rightSum=0;
        boolean areSumsEqual=false;

        for(int i=0;i<input.length;i++){
            leftSum=0;
            rightSum=0;
            for(int k=i-1;k>=0;k--){
                leftSum+=input[k];
            }
            for(int k=i+1;k<input.length;k++){
                rightSum+=input[k];
            }
            if(leftSum==rightSum){
                System.out.println(i);
                areSumsEqual=true;
            }
        }
        if(!areSumsEqual)
            System.out.println("no");
    }
}
