package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operationsNumber = Integer.parseInt(scan.nextLine());
        ArrayDeque<String> commandsStack = new ArrayDeque<>();
        ArrayDeque<String> removedSymbols = new ArrayDeque<>();
        String[] command = new String[2];
        String input="";
        StringBuilder text= new StringBuilder();

        for(int i=0;i<operationsNumber;i++){
            input = scan.nextLine();
            command = input.split("\\s+");
            switch (command[0]){
                case "1":
                    text.append(command[1]);
                    commandsStack.push(input);
                    break;
                case "2":
                    removedSymbols.push(text.substring(text.length()-Integer.parseInt(command[1])));
                    text=text.replace(text.length()-Integer.parseInt(command[1]),text.length(),"");
                    commandsStack.push(input);
                    break;
                case "3":
                    System.out.println(text.charAt(Integer.parseInt(command[1])-1));
                    break;
                case "4":
                    String[] undoCommand=commandsStack.pop().split("\\s+");
                    if(undoCommand[0].equals("1")){
                        int symbolsNumber = undoCommand[1].length();
                        text=text.replace(text.length()-symbolsNumber,text.length(),"");
                    }
                    else
                    {
                        text.append(removedSymbols.pop());
                    }
                    break;
            }
        }

    }
}
