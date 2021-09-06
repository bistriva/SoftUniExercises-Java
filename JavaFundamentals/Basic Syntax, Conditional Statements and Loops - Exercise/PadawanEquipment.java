package Fundamentals.BasicExersize;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double money = Double.parseDouble(scan.nextLine());
        int students = Integer.parseInt(scan.nextLine());
        double priceSaber = Double.parseDouble(scan.nextLine());
        double priceRobe = Double.parseDouble(scan.nextLine());
        double priceBelt = Double.parseDouble(scan.nextLine());
        double price=0;
        int freeBelts = (int) Math.floor(students/6);

        price = students*(priceSaber + priceRobe + priceBelt)-freeBelts*priceBelt + Math.ceil(students*0.1)*priceSaber;

        if(money>=price)
            System.out.printf("The money is enough - it would cost %.2flv.", price);
        else
            System.out.printf("George Lucas will need %.2flv more.",price-money);
    }
}
