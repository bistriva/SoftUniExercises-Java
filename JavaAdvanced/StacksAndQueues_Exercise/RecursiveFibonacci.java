package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Map<Integer, Long> fibonacciNumbers = new LinkedHashMap<>();

        long result = calcFibonacciOf(n, fibonacciNumbers);

        System.out.println(result);
    }

    private static long calcFibonacciOf(int n, Map<Integer, Long> lookupFibonacci) {
        if(n==0 || n==1)
            return  1;
        else
           if(lookupFibonacci.containsKey(n)) {
               return lookupFibonacci.get(n);
           }
           else{
               long newRecord = calcFibonacciOf(n-1, lookupFibonacci) + calcFibonacciOf(n-2, lookupFibonacci);
               lookupFibonacci.put(n, newRecord);
               return newRecord;

           }

    }
}
