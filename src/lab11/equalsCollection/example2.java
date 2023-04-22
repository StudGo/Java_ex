package lab11.equalsCollection;

import java.util.*;

public class example2 {
    public static void main(String[] args) {

        LinkedList<Integer> linkList = new LinkedList<>();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        System.out.println("Время выполнения операции добавления элемента в конец arrayDeque = " + getRunningTimeDeque(arrayDeque) + " мс");
        System.out.println("Время выполнения операции добавления элемента в конец linkList = " + getRunningTimeLinkedList(linkList) + " мс");

    }



    private static long getRunningTimeDeque(ArrayDeque<Integer> list) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция
        for (int i = 0; i < (13 * 1000000); i++) {
            list.addLast(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getRunningTimeLinkedList(LinkedList<Integer> list) {
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция
        for (int i = 0; i < (13 * 1000000); i++) {
            list.addLast(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

}
