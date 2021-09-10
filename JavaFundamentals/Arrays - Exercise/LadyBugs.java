package Fundamentals.ArraysExersize;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] ladyBugsArray = new int[n];

        String[] indexes = scan.nextLine().split(" ");

        for (String s : indexes) {
            int index = Integer.parseInt(s);
            if (index < n && index >= 0) {
                ladyBugsArray[index] = 1;
            }
        }
        String command = scan.nextLine();

        while(!command.equals("end")){
            String[] currentCommand=command.split(" ");
            int currentIndex=Integer.parseInt(currentCommand[0]);
            int movement=Integer.parseInt(currentCommand[2]);
            if(currentIndex<n &&currentIndex>=0 && ladyBugsArray[currentIndex] != 0) {
                ladyBugsArray[currentIndex]=0;
                       switch (currentCommand[1]){
                        case "right":
                            int newIndex=currentIndex+movement;
                            if(newIndex>=0 && newIndex<n) {
                                boolean toStop = false;
                                while (ladyBugsArray[newIndex] == 1) {
                                    newIndex = newIndex + movement;
                                    if (newIndex >= n || newIndex < 0) {
                                        toStop = true;
                                        break;
                                    }
                                }

                                if (toStop) break;
                                ladyBugsArray[newIndex] = 1;
                            }
                            break;
                        case "left":
                            newIndex=currentIndex-movement;
                            if(newIndex>=0 && newIndex<n) {
                                boolean toStop = false;
                                while (ladyBugsArray[newIndex] == 1) {
                                    newIndex = newIndex - movement;
                                    if (newIndex < 0 || newIndex >= n) {
                                        toStop = true;
                                        break;
                                    }
                                }

                                if (toStop) break;
                                ladyBugsArray[newIndex] = 1;
                            }
                            break;
                            default: break;
                    }
            }
            //Arrays.stream(ladyBugsArray).forEach(e->System.out.printf("%d ",e));
            //System.out.println();

            command=scan.nextLine();
        }

        Arrays.stream(ladyBugsArray).forEach(e->System.out.printf("%d ",e));
    }
}
