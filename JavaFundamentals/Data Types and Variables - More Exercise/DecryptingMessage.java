package Fundamentals.DataTypesAndVarsMoreExercize;

import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte key=Byte.parseByte(scan.nextLine());
        byte lines=Byte.parseByte(scan.nextLine());
        String message="";
        for(int i=1;i<=lines;i++){
            char symbol = scan.nextLine().charAt(0);
            symbol = (char)(symbol+key);
            message = message + symbol;
        }
        System.out.println(message);
    }
}
