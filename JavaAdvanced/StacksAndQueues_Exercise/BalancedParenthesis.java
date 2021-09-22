package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParenthesis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Character> parenthesisStack = new ArrayDeque<>();
        String input = scan.nextLine();
        boolean isBalanced=true;

        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='{' || input.charAt(i)=='[' || input.charAt(i)=='(')
                parenthesisStack.push(input.charAt(i));
            else
            {
                switch (input.charAt(i)){
                    case '}': if(!parenthesisStack.isEmpty()&&parenthesisStack.peek()=='{')
                                parenthesisStack.pop();
                              else
                                  isBalanced=false;
                                break;
                    case ']':
                            if(!parenthesisStack.isEmpty()&&parenthesisStack.peek()=='[')
                                parenthesisStack.pop();
                            else
                                isBalanced=false;
                            break;
                    case ')':
                        if(!parenthesisStack.isEmpty()&&parenthesisStack.peek()=='(')
                            parenthesisStack.pop();
                        else
                            isBalanced=false;
                        break;
                }
            }
        }
        if(isBalanced)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
