package Fundamentals.BasicExersize;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lostGames = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());
        double price = 0;

        price = price + Math.floor(lostGames/2)*headsetPrice;
        price = price + Math.floor(lostGames/3)*mousePrice;
        price = price + Math.floor(lostGames/6)*keyboardPrice;
        price = price + Math.floor(lostGames/12)*displayPrice;

        System.out.printf("Rage expenses: %.2f lv.", price);

    }
}
