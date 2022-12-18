package lab1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели: ");
        String ned = in.nextLine();


        System.out.println("Введите месяц: ");
        String mes = in.nextLine();

        System.out.println("Введите день: ");
        int den = in.nextInt();


        System.out.println("Сегодняшняя дата :");
        System.out.printf("День недели " + ned + ". День " + den + ". Месяц " + mes);
    in.close();
    }

}
