package Fundamentals.DataTypesAndVarsMoreExercize;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String input="";
        boolean isBalanced=true;
        boolean waitForOpeningBracket=true;
        boolean waitForClosingBracket=false;

        for(int i=0;i<n;i++){
            input=scan.nextLine();
            if(waitForOpeningBracket){
                if(input.equals("("))  {
                    waitForClosingBracket=true;
                    waitForOpeningBracket=false;
                    continue;
                }
                else{
                    if(input.equals(")")){
                        isBalanced=false;
                        break;
                    }
                }
            }
            if(waitForClosingBracket){
                if(input.equals(")")){
                    waitForClosingBracket=false;
                    waitForOpeningBracket = true;
                    continue;
                }
                else{
                    if(input.equals("(")){
                        isBalanced = false;
                        break;
                    }
                }
            }

        }
        if(isBalanced&&waitForOpeningBracket)
            System.out.println("BALANCED");
        else
            System.out.println("UNBALANCED");

    }
}
