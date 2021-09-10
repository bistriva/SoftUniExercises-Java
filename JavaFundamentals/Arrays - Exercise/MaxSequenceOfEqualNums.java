package Fundamentals.ArraysExersize;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] input = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        String sequence="";
        int initCount=0;
        int count=0;
        int startIndex=0;

        for(int i=0;i<input.length;i++){
            count=0;
            for(int j=i+1;j<input.length;j++){
                if(input[i]==input[j]){
                    count++;
                }
                else
                    break;
            }
            if(count>initCount) {
                initCount = count;
                startIndex=i;
            }
        }
        for(int i=startIndex;i<=initCount+startIndex;i++){
            sequence = sequence + (input[i])+ " ";
        }
        System.out.println(sequence);

    }
}
