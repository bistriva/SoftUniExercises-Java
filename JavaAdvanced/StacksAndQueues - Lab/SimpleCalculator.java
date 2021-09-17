package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> stack=new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split("\\s+")).forEach(stack::push);

        int value = 0;
        int sum=0;
        for (String element:stack
             ) {
            if(!element.equals("+")&&!element.equals("-")){
                value = Integer.parseInt(element);
            }
            else{
                if(element.equals("+"))
                    sum+=value;
                else
                    sum-=value;
                value=0;
           }
        }
        sum+=value;
        System.out.println(sum);
    }
}
