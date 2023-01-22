package timus.task1068;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = 0, n, start, finish;
        n = in.nextInt();
        if(n < 1) {
            start = n; finish = 1;
        }
        else {
            start = 1; finish = n;
        }
        for(int i = start; i <= finish; ++i)
            s += i;
        System.out.println(s);
    }
}
