package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[] command=new String[2];
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i=0;i<n;i++){
            command = scan.nextLine().split("\\s+");
            switch (command[0]){
                case "1":
                    stack.push(Integer.parseInt(command[1]));
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    System.out.println(Collections.max(stack));
                    break;
            }
        }
    }
}
