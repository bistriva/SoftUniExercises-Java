package Fundamentals.BasicExersize;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userName = scan.nextLine();
        String password = "";
        char symb;
        int count=0;

        for(int i=userName.length()-1;i>=0;i--)
        {
            symb = userName.charAt(i);
            password = password + symb;
        }

        while(true) {

            String enterPass = scan.nextLine();
            count++;
            if (!enterPass.equals(password)) {
                if(count == 4) {
                    System.out.printf("User %s blocked!", userName);
                    break;
                }
                else
                    System.out.println("Incorrect password. Try again.");
            }
            else {
                System.out.printf("User %s logged in.", userName);
                break;
            }

        }

    }
}
