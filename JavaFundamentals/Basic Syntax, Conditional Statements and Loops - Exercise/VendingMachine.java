package Fundamentals.BasicExersize;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command="";
        double sum = 0;
        double coin=0;

        while(true)
        {
            command = scan.nextLine();
            if(!command.equals("Start")) {
                coin = Double.parseDouble(command);
                if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1.0 || coin == 2)
                    sum += coin;
                else
                    System.out.printf("Cannot accept %.2f\n", coin);
            }
            else
                break;
        }
        while(true){
            command = scan.nextLine();
            if(command.equals("End")){
               break;
            }
            else{
                if(command.equals("Nuts") || command.equals("Water") || command.equals("Crisps") || command.equals("Soda") || command.equals("Coke")){
                    switch (command){
                        case "Nuts":
                            if(sum - 2.0 >=0) {
                                sum = sum - 2;
                                System.out.printf("Purchased %s \n", command);
                            }
                            else
                                System.out.println("Sorry, not enough money");
                            break;
                        case "Water":
                            if(sum - 0.7 >=0) {
                                sum = sum - 0.7;
                                System.out.printf("Purchased %s\n", command);
                            }
                            else
                                 System.out.println("Sorry, not enough money");
                            break;
                        case "Crisps":
                            if(sum - 1.5 >=0) {
                                sum = sum - 1.5;
                                System.out.printf("Purchased %s\n", command);
                            }
                            else
                                System.out.println("Sorry, not enough money");
                            break;
                        case "Soda":
                            if(sum - 0.8 >=0) {
                                sum = sum - 0.8;
                                System.out.printf("Purchased %s\n", command);
                            }
                            else
                                System.out.println("Sorry, not enough money");
                            break;
                        case "Coke":
                            if(sum - 1.0 >=0) {
                                sum = sum - 1.0;
                                System.out.printf("Purchased %s\n", command);
                            }
                            else
                                System.out.println("Sorry, not enough money");
                            break;
                    }

                }
                else
                    System.out.println("Invalid product");
            }

        }
        System.out.printf("Change: %.2f", sum);
    }
}
