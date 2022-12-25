package lab6.example2;

public class ShowInc {
    private static int count = 0;

    static void showValue () {
        System.out.println("Значение поля равно " + count);
        count++;
    }
}
