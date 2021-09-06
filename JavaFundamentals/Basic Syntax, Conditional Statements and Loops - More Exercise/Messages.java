package Fundamentals.BasicMoreExersice;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int strLen=0;
        int index=0;
        String word="";
        char letter=' ';
        int symbolsTyped = Integer.parseInt(scan.nextLine());

        while(symbolsTyped>0) {
            String input = scan.nextLine();
            strLen = input.length() - 1;
            index = input.charAt(0) + strLen;

            /* 2(50)-a(97) 22-b(98) 222-c(99)   +47
             * 3(51)-d(100) 33-e(101) 333-f(102) +49
             * 4(52)-g(103) 44-h(104) 444-i(105) +51
             * 5(53)-j(106) 55-k(107) 555-l(108) +53 */

            letter = (char) (index + 47 + (input.charAt(0) - 50) * 2);
            if (input.charAt(0) == 56 || input.charAt(0) == 57)
                letter = (char) (index + 47 + (input.charAt(0) - 50) * 2 + 1);
            if(input.charAt(0)==48)
                letter = ' ';

            word = word + letter;
            symbolsTyped--;
        }
        System.out.println(word);

    }
}
