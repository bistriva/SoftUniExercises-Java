package Fundamentals.BasicSyntax;

import java.util.Scanner;

public class BackIn30Mins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double hours = Double.parseDouble(scan.nextLine());
        double mins = Double.parseDouble(scan.nextLine());

        double sumMins = hours*60+mins +30;
        hours = Math.floor(sumMins/60);
        if(hours == 24)
            hours = 0;
        mins = sumMins - Math.floor(sumMins);

        System.out.printf("%.0f:%02.0f", hours, sumMins-Math.floor(sumMins/60)*60);
    }
}
