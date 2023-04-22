package lab11.equalsCollection;

import java.util.*;

public class example1 {
    public static void main(String[] args) {

        LinkedList<Integer> linkList = new LinkedList<>();
        Set<Integer> treeSet = new TreeSet<>();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        System.out.println("Время выполнения операции добавления элемента в начало arrayDeque = " + getRunningTimeDeque(arrayDeque) + " мс");
        System.out.println("Время выполнения операции добавления элемента в начало TreeSet = " + getRunningTimeTreeSet(treeSet) + " мс");
        System.out.println("Время выполнения операции добавления элемента в начало linkList = " + getRunningTimeLinkedList(linkList) + " мс");

    }

    private static long getRunningTimeDeque(ArrayDeque<Integer> list) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция
        for (int i = 0; i < (13 * 1000000); i++) {
            list.add(i);
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
            list.add(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getRunningTimeTreeSet(Set<Integer> list) {
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция
        for (int i = 0; i < (13 * 1000000); i++) {
            list.add(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }
}
