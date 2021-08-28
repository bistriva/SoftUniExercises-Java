package Fundamentals.BasicSyntax;

import java.util.Locale;
import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String weekday  = scan.nextLine();
        weekday = weekday.toLowerCase();
        int age = Integer.parseInt(scan.nextLine());
        int ticketPrice = 0;

        if(age<=18 && age>=0) {
            switch (weekday) {
                case "weekday":
                    ticketPrice = 12;
                    break;
                case "weekend":
                    ticketPrice = 15;
                    break;
                case "holiday":
                    ticketPrice = 5;
                    break;
            }
        }
        else  if (age > 18 && age <= 64) {
                    switch (weekday) {
                        case "weekday":
                            ticketPrice = 18;
                            break;
                        case "weekend":
                            ticketPrice = 20;
                            break;
                        case "holiday":
                            ticketPrice = 12;
                            break;
                    }
                }
        else if (age>64 &&age<=122)
                {
                    switch (weekday) {
                        case "weekday":
                            ticketPrice = 12;
                            break;
                        case "weekend":
                            ticketPrice = 15;
                            break;
                        case "holiday":
                            ticketPrice = 10;
                            break;
                    }

                }
        if(ticketPrice == 0)
            System.out.println("Error!");
        else
            System.out.printf("%d$", ticketPrice);

    }
}
