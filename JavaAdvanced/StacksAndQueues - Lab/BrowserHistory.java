package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        Scanner scan = new Scanner(System.in);
        String instruction = scan.nextLine();
        String currentURL="";
        while(!instruction.equals("Home")){
            if(!instruction.equals("back")){
                currentURL=instruction;
                browserHistory.push(instruction);
                System.out.println(currentURL);
            }
            else{
                if(!browserHistory.isEmpty())
                    currentURL=browserHistory.pop();
                if (browserHistory.isEmpty()) {
                    System.out.println("no previous URLs");
                    browserHistory.push(currentURL);
                }
                else {
                    currentURL=browserHistory.peek();
                    System.out.println(currentURL);
                }
            }

            instruction = scan.nextLine();
        }
    }
}

