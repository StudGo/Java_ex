package lab3.number2;

import java.util.Locale;
import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название дня недели");
        String day = in.next();
        day = day.toLowerCase();
        switch(day) {
            case "понедельник": {
                System.out.println("Дню недели " + day + " соответсвует число 1");
                break;
            }
            case "вторник": {
                System.out.println("Дню недели " + day + " соответсвует число 2");
                break;
            }
            case "среда": {
                System.out.println("Дню недели " + day + " соответсвует число 3");
                break;
            }
            case "четверг": {
                System.out.println("Дню недели " + day + " соответсвует число 4");
                break;
            }
            case "пятница": {
                System.out.println("Дню недели " + day + " соответсвует число 5");
                break;
            }
            case "суббота": {
                System.out.println("Дню недели " + day + " соответсвует число 6");
                break;
            }
            case "воскресенье": {
                System.out.println("Дню недели " + day + " соответсвует число 7");
                break;
            }
            default: {
                System.out.println("Дня недели " + day + " не существует");
                break;
            }
        }
    }
}
