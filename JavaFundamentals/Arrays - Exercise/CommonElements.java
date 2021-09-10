package Fundamentals.ArraysExersize;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input1 = Arrays.stream(scan.nextLine().split(" ")).toArray(String[]::new);
        String[] input2 = Arrays.stream(scan.nextLine().split(" ")).toArray(String[]::new);

        for(int i=0;i<input2.length;i++){
            for(int j=0;j<input1.length;j++){
                if(input2[i].equals(input1[j])) {
                    System.out.printf("%s ",input1[j]);
                }
            }
        }
    }
}
