package lab2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.println("Введите целое число");
        int number = in.nextInt();

        if ((number % 3) == 0){
            System.out.println("Введеное число делится на 3 без остатка");
        } else {
            System.out.println("Введеное число не делится на 3 без остатка");
        }
    }
}
