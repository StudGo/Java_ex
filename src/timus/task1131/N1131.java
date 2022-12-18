package timus.task1131;

import java.io.PrintWriter;
import java.util.Scanner;

public class N1131 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int valuePC, patchCord, hours = 0, canCopy = 1, computersWithPrograms = 1;
        valuePC = in.nextInt();
        patchCord = in.nextInt();

        while(canCopy <= patchCord & computersWithPrograms < valuePC & computersWithPrograms < patchCord){
            computersWithPrograms += canCopy;
            hours++;
            canCopy = computersWithPrograms;
        }
        hours += Math.ceil((double)(valuePC - computersWithPrograms)/ patchCord);
        out.println(hours);
        out.flush();
    }
}
