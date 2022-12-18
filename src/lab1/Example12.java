package lab1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите Ваш возраст ");
        int g = in.nextInt();


        int d = 2022 - g;


        System.out.println("Ваш год рождения " +d);

        in.close();
    }

}