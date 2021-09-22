package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int S = scan.nextInt();
        int X = scan.nextInt();
        ArrayDeque<Integer> queueNumbers = new ArrayDeque<>();

        for(int i=0;i<N;i++){
            queueNumbers.offer(scan.nextInt());
        }

        for(int i=0;i<S;i++){
            queueNumbers.poll();
        }

        if(queueNumbers.isEmpty())
            System.out.println(0);
        else
        {
            if(queueNumbers.contains(X))
                System.out.println("true");
            else
                System.out.println(Collections.min(queueNumbers));
        }
    }
}
