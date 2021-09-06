package Fundamentals.BasicMoreExersice;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word=scan.nextLine();
        String sym;

        for(int i=word.length()-1;i>=0;i--){
             System.out.printf("%c",word.charAt(i));
        }
    }
}
