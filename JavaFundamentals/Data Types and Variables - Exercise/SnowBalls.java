package Fundamentals.DataTypesAndVarsExersice;

import java.net.Inet4Address;
import java.util.Scanner;

public class SnowBalls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int snowballsNum = Integer.parseInt(scan.nextLine());
        double highestSnowBallValue=0;
        int highestSnowBallTime=0;
        int highestSnowBallSnow=0;
        int highestSnowBallQuality=0;

        for(int i=1;i<=snowballsNum;i++){
            int snowBallSnow = Integer.parseInt(scan.nextLine());
            int snowBallTime = Integer.parseInt(scan.nextLine());
            int snowBalQuality = Integer.parseInt(scan.nextLine());
            double snowBallValue = Math.pow((snowBallSnow/snowBallTime),snowBalQuality);
            if(snowBallValue>highestSnowBallValue) {
                highestSnowBallValue = snowBallValue;
                highestSnowBallTime=snowBallTime;
                highestSnowBallSnow=snowBallSnow;
                highestSnowBallQuality=snowBalQuality;
            }

        }
        System.out.printf("%d : %d = %.0f (%d)",highestSnowBallSnow, highestSnowBallTime, highestSnowBallValue, highestSnowBallQuality);

    }
}
