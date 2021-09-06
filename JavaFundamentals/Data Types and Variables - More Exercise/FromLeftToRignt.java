package Fundamentals.DataTypesAndVarsMoreExercize;

import java.util.Scanner;

public class FromLeftToRignt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lines = Integer.parseInt(scan.nextLine());

        for(int i=1;i<=lines;i++){
            String input = scan.nextLine();
            int sum=0;
            int sum2=0;
            String number1="";
            String number2="";
            boolean spaceFound=false;
            for(int j=0;j<input.length();j++){
                if(input.charAt(j)==32) {
                    spaceFound = true;
                }
                else{
                    if(!spaceFound)
                        number1 = number1 + input.charAt(j);
                    else
                        number2=number2+input.charAt(j);
                }
            }
            long n1=Long.parseLong(number1);
            long n2=Long.parseLong(number2);
            long n=0;
            n = Math.max(n1, n2);
            n=Math.abs(n);
            while(n>0)
                {
                    sum+=n%10;
                    n=n/10;
                }
            System.out.println(sum);
        }
    }
}
