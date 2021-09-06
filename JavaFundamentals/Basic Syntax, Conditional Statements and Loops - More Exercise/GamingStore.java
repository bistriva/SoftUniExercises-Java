package Fundamentals.BasicMoreExersice;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double currentBalance=Double.parseDouble(scan.nextLine());
        double moneySpent=0;
        boolean f=true;

        while(f){
            String newGame=scan.nextLine();
            switch(newGame){
                case "Game Time":
                    System.out.printf("Total spent: $%.2f. Remaining: $%.2f", moneySpent, currentBalance-moneySpent);
                    f=false;
                    break;
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    if((currentBalance-moneySpent)>=39.99)
                    {
                        moneySpent += 39.99;
                        System.out.printf("Bought %s\n",newGame);
                    }
                    else
                        System.out.println("Too Expensive");
                    if(currentBalance-moneySpent==0){
                        System.out.println("Out of money!");
                        f=false;
                        break;
                    }
                    break;
                case "CS: OG":
                    if((currentBalance-moneySpent)>=15.99)
                    {
                        moneySpent+= 15.99;
                        System.out.printf("Bought %s\n",newGame);
                    }
                    else
                        System.out.println("Too Expensive");
                    if(currentBalance-moneySpent==0){
                        System.out.println("Out of money!");
                        f=false;
                        break;
                    }
                    break;
                case "Zplinter Zell":
                    if((currentBalance-moneySpent)>=19.99)
                    {
                        moneySpent += 19.99;
                        System.out.printf("Bought %s\n",newGame);
                    }
                    else
                        System.out.println("Too Expensive");
                    if(currentBalance-moneySpent==0){
                        System.out.println("Out of money!");
                        f=false;
                        break;
                    }
                    break;
                case "Honored 2":
                    if((currentBalance-moneySpent)>=59.99)
                    {
                        moneySpent+= 59.99;
                        System.out.printf("Bought %s\n",newGame);
                    }
                    else
                        System.out.println("Too Expensive");
                    if(currentBalance-moneySpent==0){
                        System.out.println("Out of money!");
                        f=false;
                        break;
                    }
                    break;
                case "RoverWatch":
                    if((currentBalance-moneySpent)>=29.99)
                    {
                        moneySpent+= 29.99;
                        System.out.printf("Bought %s\n",newGame);
                    }
                    else
                        System.out.println("Too Expensive");
                    if(currentBalance-moneySpent==0){
                        System.out.println("Out of money!");
                        f=false;
                        break;
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
        }
    }
}
