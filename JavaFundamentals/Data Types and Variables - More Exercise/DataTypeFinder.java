package Fundamentals.DataTypesAndVarsMoreExercize;

import java.util.Locale;
import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input=scan.nextLine();
        String dataType=" ";
        int notNum=0;

        while(!input.equals("END")){
            if(input.length()==1 && (input.charAt(0)<48 || input.charAt(0)>57)) {
                dataType = "character";
            }
            String booleanTest = input.toLowerCase(Locale.ROOT);
            if(booleanTest.equals("true")||booleanTest.equals("false")){
                dataType = "boolean";
            }
            for(int i=0;i<input.length();i++) {
                   if(input.charAt(i)<48 || input.charAt(i)>57)
                       notNum++;
            }
            if(!(dataType.equals("character") || dataType.equals("boolean"))) {
                if(notNum == 0)
                    dataType = "integer";
                else {
                    if (notNum == 1) {
                        if (input.contains(".")&&input.charAt(0) != 46)
                            dataType = "floating point";
                        else {
                            if (input.charAt(0) == 45)
                                dataType = "integer";
                            else
                                dataType="string";
                        }
                    }
                    else {
                        if (notNum == 2 && input.charAt(0) == 45 && input.contains("."))
                            dataType = "floating point";
                        else
                            dataType = "string";
                    }
                }
            }
            System.out.printf("%s is %s type\n",input,dataType);
            dataType=" ";
            notNum=0;
            input = scan.nextLine();
        }

    }
}
