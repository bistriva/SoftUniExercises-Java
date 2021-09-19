package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input=Integer.parseInt(scan.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        if(input==0)
            System.out.println(input);
        else{
            while(input !=0){
                stack.push(input%2);
                input/=2;
            }
            stack.forEach(e->System.out.print(e));
        }
    }
}
