package lab3.number3;

import java.util.Scanner;

public class example3v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел Фибоначчи");
        int count = in.nextInt();
        int i = 3;
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0+" "+n1+" ");
        while(i <= count){
            n2=n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
            i++;
        }
        System.out.println();
    }
}
