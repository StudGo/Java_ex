package lab11.equalsCollection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class example4 {
    public static void main(String[] args) {

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        LinkedList<Integer> linkList = new LinkedList<>();

        System.out.println("Время выполнения операции удаления элемента в начале arrayDeque = " + getRunningTimeDeque(arrayDeque) + " мс");
        System.out.println("Время выполнения операции удаления элемента в начале linkList = " + getRunningTimeLinkedList(linkList) + " мс");

    }

    private static long getRunningTimeDeque(ArrayDeque<Integer> list) {

        for (int i = 0; i < (13 * 1000000); i++) {
            list.add(i);
        }

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция
        for (int i = 0; i < (13 * 1000000); i++) {
            list.removeFirst();
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }
    private static long getRunningTimeLinkedList(LinkedList<Integer> list) {

        for (int i = 0; i < (13 * 1000000); i++) {
            list.add(i);
        }

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция
        for (int i = 0; i < (13 * 1000000); i++) {
            list.removeFirst();
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }
}
