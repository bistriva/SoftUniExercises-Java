package Fundamentals.BasicExersize;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine());
        String groupType = scan.nextLine();
        String weekday = scan.nextLine();
        double totalPrice =0.0;

        switch (groupType){
            case "Students":
                if(weekday.equals("Friday"))
                    totalPrice = people*8.45;
                if(weekday.equals("Saturday"))
                    totalPrice = people*9.80;
                if(weekday.equals("Sunday"))
                    totalPrice = people*10.46;
                if(people>=30)
                    totalPrice = totalPrice*0.85;
                break;
            case "Business":
                if(people>=100)
                    people = people - 10;
                if(weekday.equals("Friday"))
                    totalPrice = people*10.90;
                if(weekday.equals("Saturday"))
                    totalPrice = people*15.60;
                if(weekday.equals("Sunday"))
                    totalPrice = people*16;
                break;
            case "Regular":
                if(weekday.equals("Friday"))
                    totalPrice = people*15.0;
                if(weekday.equals("Saturday"))
                    totalPrice = people*20.0;
                if(weekday.equals("Sunday"))
                    totalPrice = people*22.50;
                if(people>=10 && people<=20)
                    totalPrice = totalPrice*0.95;
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);

    }
}
