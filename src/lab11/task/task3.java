package lab11.task;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class task3 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> arrValue = new ArrayList<Integer>();
        System.out.println("Сколько чисел необходимо добавить: ");
        int count = in.nextInt();
        System.out.println("Введите числа: ");
        input(count, arrValue);
        System.out.println("Вывод значений: ");
        output(arrValue.listIterator());
    }
    public static void input(int count, ArrayList<Integer> arr) {
        if(count != 0) {
            arr.add(in.nextInt());
            input(count - 1, arr);
        }
    }
    public static void output(ListIterator<Integer> arr) {
        if(arr.hasNext()) {
            System.out.println(arr.next());
            output(arr);
        }
    }
}
