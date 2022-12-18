package lab1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите Ваше имя: ");
        String name = in.nextLine();

        System.out.println("Введите год Вашего рождения ");
        int g = in.nextInt();


        int d = 2022 - g;


        System.out.println(name + ", Ваш возраст " +d);
        in.close();
    }

}