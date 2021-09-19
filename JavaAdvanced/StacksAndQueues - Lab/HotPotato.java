package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input= scan.nextLine().split("\\s+");
        int n = Integer.parseInt(scan.nextLine());
        ArrayDeque<String> kids = new ArrayDeque<>();
        Arrays.stream(input).forEach(kids::offer);

        while (kids.size()>1){
            for(int i=1;i<n;i++){
                kids.offer(kids.poll());
            }
            System.out.println("Removed " + kids.poll());
        }
        System.out.println("Last is " + kids.poll());
    }
}
