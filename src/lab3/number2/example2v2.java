package lab3.number2;

import java.util.Scanner;

public class example2v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название дня недели");
        String day = in.next();
        day = day.toLowerCase();

        if(day.equals("понедельник")){
            System.out.println("Дню недели " + day + " соответсвует число 1");
        } else if (day.equals("вторник")) {
            System.out.println("Дню недели " + day + " соответсвует число 2");
        } else if (day.equals("среда")) {
            System.out.println("Дню недели " + day + " соответсвует число 3");
        } else if (day.equals("четверг")) {
            System.out.println("Дню недели " + day + " соответсвует число 4");
        } else if (day.equals("пятница")) {
            System.out.println("Дню недели " + day + " соответсвует число 5");
        } else if (day.equals("суббота")) {
            System.out.println("Дню недели " + day + " соответсвует число 6");
        } else if (day.equals("воскресенье")) {
            System.out.println("Дню недели " + day + " соответсвует число 7");
        } else {
            System.out.println("Дня недели " + day + " не существует");
        }
    }
}
