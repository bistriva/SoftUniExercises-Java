package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> numbers = new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split("\\s+")).forEach(numbers::push);
        numbers.stream().forEach(e->System.out.print(e + " "));
    }
}
