package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");

        ArrayDeque<String> numbersStack = new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split("\\s+")).forEach(numbersStack::push);
        for(int i=1;i<=Integer.parseInt(input[1]);i++){
            numbersStack.pop();
        }
        if(numbersStack.isEmpty())
            System.out.println("0");
        else {
            if (numbersStack.contains(input[2]))
                System.out.println("true");
            else {
                int min = Integer.MAX_VALUE;
                for (String n:numbersStack
                     ) {
                    int currentNumber = Integer.parseInt(n);
                    if(currentNumber<min)
                        min = currentNumber;
                }
                System.out.println(min);
            }
        }
    }
}
