package Fundamentals.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] array = scan.nextLine().split(" ");
        String a=" ";

        for(int i=0;i< array.length/2;i++){
            a=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=a;
        }

        String output= String.join(" ", array);

        System.out.println(output);
    }
}
