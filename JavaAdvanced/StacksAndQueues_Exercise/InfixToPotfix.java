package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class InfixToPotfix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        ArrayDeque<String> numbersQueue = new ArrayDeque<>();
        ArrayDeque<String> operatorsStack = new ArrayDeque<>();

        for(int i=0;i<input.length;i++){
            if(input[i].matches("[a-z]+|\\d+")){
                numbersQueue.offer(input[i]);
            }
            else{
                if(operatorsStack.isEmpty())
                    operatorsStack.push(input[i]);
                else {
                    switch(input[i]){
                        case "+":
                        case "-":
                            if(!operatorsStack.peek().equals("(")&&!operatorsStack.peek().equals(")"))
                                numbersQueue.offer(operatorsStack.pop());
                            operatorsStack.push(input[i]);
                            break;
                        case "*":
                        case "/":
                            if(operatorsStack.peek().equals("*")||operatorsStack.peek().equals("/"))
                                numbersQueue.offer(operatorsStack.pop());
                            operatorsStack.push(input[i]);
                            break;
                        case "(":
                            operatorsStack.push(input[i]);
                            break;
                        case ")":
                            while (!operatorsStack.peek().equals("(")&&!operatorsStack.isEmpty()) {
                                numbersQueue.offer(operatorsStack.pop());
                            }
                            operatorsStack.pop();
                            break;
                    }
                    }

                }
            }
        System.out.println(numbersQueue.toString().replaceAll("[\\[\\],]","") + " " +operatorsStack.toString().replaceAll("[\\[\\],]",""));
        }
}

