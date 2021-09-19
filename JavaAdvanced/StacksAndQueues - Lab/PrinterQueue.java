package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> printerQueue = new ArrayDeque<>();
        String input = scan.nextLine();

        while(!input.equals("print")){
            if(!input.equals("cancel")){
                printerQueue.offer(input);
            }
            else{
                if(printerQueue.isEmpty())
                    System.out.println("Printer is on standby");
                else{
                    System.out.println("Canceled " + printerQueue.poll());
                }
            }
            input = scan.nextLine();
        }
        if(!printerQueue.isEmpty())
        {
            printerQueue.stream().forEach(e->System.out.println(e));
        }
    }
}
