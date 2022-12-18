package lab1;
import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите месяц: ");
        String m = in.nextLine();

        System.out.println("Введите количество дней в месяце: ");
        int d = in.nextInt();

        System.out.printf("Месяц %s содержит %s ", m, d);

        if (d == 1) {
            System.out.println("день");
        }
        in.close();
            if (d  == 2 | d  == 3 | d  == 4 | d  == 22 | d  == 23 | d  == 24)
            {
                System.out.println("дня");
            }
            else
            {
                System.out.println("дней");
            }
            in.close();
        }
    }


