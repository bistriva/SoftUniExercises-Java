package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input= scan.nextLine().split("\\s+");
        int n = Integer.parseInt(scan.nextLine());
        ArrayDeque<String> kids = new ArrayDeque<>();
        Arrays.stream(input).forEach(kids::offer);
        boolean isPrime=true;
        int cycle=1;
        int kidsNumber = kids.size();

        while (kids.size()>1){
            isPrime=true;
            for(int i=1;i<n;i++){
                kids.offer(kids.poll());
            }

            for(int j=2;j<=kidsNumber;j++){
                   if(cycle%j==0 && cycle != j)
                       isPrime = false;
              }
            if(cycle==1)
                isPrime=false;
            if(isPrime)
                System.out.println("Prime " + kids.peek());
            else
                System.out.println("Removed " + kids.poll());
            cycle++;
        }
        System.out.println("Last is " + kids.poll());
    }
}
