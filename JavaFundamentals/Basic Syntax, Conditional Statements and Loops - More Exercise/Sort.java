package Fundamentals.BasicMoreExersice;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        int n3 = Integer.parseInt(scan.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int mid = 0;

            if (max < n1) max = n1;
            if (max < n2) max = n2;
            if (max < n3) max = n3;

            if (min > n1) min = n1;
            if (min > n2) min = n2;
            if (min > n3) min = n3;
            if (n1 < max && n1 > min)
                mid = n1;
            else {
                if (n2 < max && n2 > min)
                    mid = n2;
                else {
                    if(n3<max && n3>min)
                        mid=n3;
                    else{
                        if(n1==n2 || n1==n3)
                            mid=n1;
                        else
                            mid=n2;
                    }
                }
            }
         System.out.printf("%d\n%d\n%d\n",max, mid, min);

    }
}
