package Fundamentals.DataTypesAndVarsExersice;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pokePower = Integer.parseInt(scan.nextLine());
        int distance = Integer.parseInt(scan.nextLine());
        byte exhaustionFactor = Byte.parseByte(scan.nextLine());
        int pokedTargets=0;
        double originalPokePow=pokePower*1.0;

        while(pokePower>=distance)
        {
            pokedTargets++;
            pokePower-=distance;
            if(originalPokePow/2.0 == pokePower*1.0 && pokePower>exhaustionFactor && exhaustionFactor !=0){
                    pokePower = pokePower/exhaustionFactor;
            }
        }
        System.out.println(pokePower);
        System.out.println(pokedTargets);
    }
}
