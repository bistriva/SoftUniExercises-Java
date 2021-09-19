package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        ArrayDeque<String> forwardLinks = new ArrayDeque<>();
        Scanner scan = new Scanner(System.in);
        String instruction = scan.nextLine();
        String currentURL="";
        while(!instruction.equals("Home")){
            if(!instruction.equals("back")&&!instruction.equals("forward")){
                currentURL=instruction;
                browserHistory.push(instruction);
                System.out.println(currentURL);
                forwardLinks.clear();
            }
            else{
                if(instruction.equals("back")) {
                    if (browserHistory.size()>1) {
                        forwardLinks.addFirst(browserHistory.pop());
                        currentURL = browserHistory.peek();
                        System.out.println(currentURL);
                    }
                    else {
                        System.out.println("no previous URLs");
                    }
                }
                if(instruction.equals("forward")){
                    if(forwardLinks.isEmpty()){
                        System.out.println("no next URLs");
                    }
                    else{
                        currentURL = forwardLinks.pop();
                        browserHistory.push(currentURL);
                        System.out.println(currentURL);
                    }

                }
            }

            instruction = scan.nextLine();
        }
    }
}
