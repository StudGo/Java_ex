package lab2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число которое при делении на 5 в остатке получится 2, а при делении на 7 в остатке получается 1");
        int number = in.nextInt();

        //System.out.println("Деление на 5 - остаток "+ number%5 + "\nДеление на 7 - остаток "+ number%7);

        if((number%5)==2 & (number%7)==1){
            System.out.println("Число удовлетворяет условию");
        } else {
            System.out.println("Число не удовлетворяет условию");
        }
    }
}
