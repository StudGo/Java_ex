package lab11.equalsCollection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class example7 {
    public static void main(String[] args) {

        LinkedList<Integer> linkList = new LinkedList<>();
        Set<Integer> treeSet = new TreeSet<>();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        System.out.println("Время выполнения операции получения элемента по индексу arrayDeque = " + getRunningTimeDeque(arrayDeque) + " мс");
        System.out.println("Время выполнения операции получения элемента по индексу TreeSet = " + getRunningTimeTreeSet(treeSet) + " мс");
        System.out.println("Время выполнения операции получения элемента по индексу linkList = " + getRunningTimeLinkedList(linkList) + " мс");

    }

    private static long getRunningTimeDeque(ArrayDeque<Integer> list) {

        for (int i = 0; i < (13 * 1000000000); i++) {
            list.add(i);
        }

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция
        list.getFirst();

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
        list.get(list.size()/2);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getRunningTimeTreeSet(Set<Integer> list) {

        for (int i = 0; i < (13 * 1000000); i++) {
            list.add(i);
        }

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция
        list.contains(list.size()/2);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }
}
