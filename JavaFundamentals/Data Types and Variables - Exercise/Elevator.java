package Fundamentals.DataTypesAndVarsExersice;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int p = Integer.parseInt(scan.nextLine());
        int courses = n/p;
        if(courses>0){
            if(n%p>0)
                courses +=1;
        }
        else
            courses = 1;

        System.out.println(courses);

    }
}
