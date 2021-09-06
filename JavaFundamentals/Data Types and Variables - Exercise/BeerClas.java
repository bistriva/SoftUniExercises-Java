package Fundamentals.DataTypesAndVarsExersice;

import java.util.Scanner;

public class BeerClas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lines=Integer.parseInt(scan.nextLine());
        double biggestVolume = 0;
        String kegModel=" ";

        for(int i=1;i<=lines;i++){
            String model = scan.nextLine();
            double kegRadius= Double.parseDouble(scan.nextLine());
            int kegHeight = Integer.parseInt(scan.nextLine());
            double volume = Math.PI*Math.pow(2,kegRadius)*kegHeight;
            if(volume>biggestVolume) {
                biggestVolume = volume;
                kegModel = model;
            }
        }
        System.out.println(kegModel);
    }
}
