package lab1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("ВВедите фамилию: ");
        String fam = in.nextLine();


        System.out.println("Введите имя: ");
        String name = in.nextLine();


        System.out.println("Введите отчество: " );
        String otch = in.nextLine();

        System.out.printf("Привет,  " + fam + " "+  name + " " + otch);
        in.close();
    }

}
