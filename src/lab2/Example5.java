package lab2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите целое число");
        int number = in.nextInt();

        System.out.println("Во введеном числе в разряде тысячных число - " + number/1000%10);
    }
}

