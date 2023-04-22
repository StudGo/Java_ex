package lab11.task;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество человек (N): ");
        int N = scanner.nextInt();

        ArrayList<Integer> peopleArrayList = new ArrayList<>();

        LinkedList<Integer> peopleLinkedList = new LinkedList<>();

        Long startTimeLinked = System.currentTimeMillis();
        for (int i = 1; i <= N; i++) {
            peopleLinkedList.add(i);
        }

        int index = 0;
        while (peopleLinkedList.size() > 1) {
            index = (index + 1) % peopleLinkedList.size();
            peopleLinkedList.remove(index);
        }
        Long endTimeLinked = System.currentTimeMillis();

        System.out.println("Последний оставшийся человек: " + peopleLinkedList.get(0));

        Long startTimeArray = System.currentTimeMillis();
        for (int i = 1; i <= N; i++) {
            peopleArrayList.add(i);
        }

        index = 0;
        while (peopleArrayList.size() > 1) {
            index = (index + 1) % peopleArrayList.size();
            peopleArrayList.remove(index);
        }
        Long endTimeArray = System.currentTimeMillis();

        System.out.println("Последний оставшийся человек: " + peopleArrayList.get(0));

        System.out.println("Время затраченное на LinkedList = " + (endTimeLinked-startTimeLinked) + " мс");
        System.out.println("Время затраченное на ArrayList = " + (endTimeArray-startTimeArray) + " мс");
    }
}
