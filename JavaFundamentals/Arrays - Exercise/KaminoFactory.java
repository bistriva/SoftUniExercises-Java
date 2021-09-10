package Fundamentals.ArraysExersize;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String input=scan.nextLine();
        String currentDNASequence="";
        String bestDNASequence="";
        int bestDNASampleNumber=0;
        int sampleNumber=0;

        while(!input.equals("Clone them!")){
            currentDNASequence = input;
            sampleNumber++;
            if(bestDNASequence.equals("")) {
                bestDNASequence=currentDNASequence;
                bestDNASampleNumber=sampleNumber;
            }
            else{
               if(checkSubsequenceOfOnes(currentDNASequence)>checkSubsequenceOfOnes(bestDNASequence)){
                   bestDNASequence=currentDNASequence;
                   bestDNASampleNumber=sampleNumber;
               }
               else{
                   if(checkSubsequenceOfOnes(currentDNASequence)==checkSubsequenceOfOnes(bestDNASequence)){
                       if(checkLeftmostStartingIndex(currentDNASequence)<checkLeftmostStartingIndex(bestDNASequence))
                       {
                           bestDNASequence=currentDNASequence;
                           bestDNASampleNumber=sampleNumber;
                       }
                       else{
                           if(checkSum(currentDNASequence)>checkSum(bestDNASequence)){
                               bestDNASequence=currentDNASequence;
                               bestDNASampleNumber=sampleNumber;
                           }
                       }
                   }
               }

            }

            input=scan.nextLine();
        }

        System.out.println("Best DNA sample " + bestDNASampleNumber +" with sum: " + checkSum(bestDNASequence)+".");
        bestDNASequence = bestDNASequence.replace("!","");
        String sequence="";
        for(int i=0;i<bestDNASequence.length();i++){
            sequence = sequence + bestDNASequence.charAt(i) + " ";
        }
        System.out.println(sequence);


    }

    private static int checkSum(String currentDNASequence) {
        int sum =0;
        for(int i=0;i<currentDNASequence.length();i++){
            if(currentDNASequence.charAt(i)==49)
                sum++;
        }
        return sum;
    }

    private static int checkLeftmostStartingIndex(String currentDNASequence) {
        int leftmostIndex=0;
        int subsequenceOfOnes=0;
        int maxsubsequenceOfOnes=0;
        String sequence=currentDNASequence.replace("!","");
        for(int i=0;i<sequence.length()-1;i++){
            if(sequence.charAt(i) == 49 &&sequence.charAt(i+1)==49)
                subsequenceOfOnes++;
            else
            {
                subsequenceOfOnes=0;
            }
            if(maxsubsequenceOfOnes<subsequenceOfOnes)    {
                maxsubsequenceOfOnes=subsequenceOfOnes;
                leftmostIndex=i-maxsubsequenceOfOnes+1;
            }

        }

    return leftmostIndex;
    }

    private static int checkSubsequenceOfOnes(String currentDNASequence) {
        int subsequenceOfOnes=0;
        int maxsubsequenceOfOnes=0;
        String sequence = currentDNASequence.replace("!","");
        for(int i=0;i<sequence.length()-1;i++){
            if(sequence.charAt(i) == 49 &&sequence.charAt(i+1)==49)
                subsequenceOfOnes++;
            else
            {
                subsequenceOfOnes=0;
            }
            if(maxsubsequenceOfOnes<subsequenceOfOnes)
                maxsubsequenceOfOnes=subsequenceOfOnes;
        }
        return maxsubsequenceOfOnes;
    }
}
