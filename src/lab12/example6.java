package lab12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class example6 {
//  Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список,
//  содержащий только те числа, которые делятся на заданное число без остатка.
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();


        System.out.println("Массив чисел: ");
        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(50));
        }
        for (int i : integers) {
            System.out.println(i);
        }

        System.out.println("Введите число на которое делить: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        List<Integer> integersAfter = findWithoutLast(integers, number);

        System.out.println("Массив с делителем без остатка: ");
        for (int i : integersAfter) {
            System.out.println(i);
        }
    }

    public static List<Integer> findWithoutLast (List<Integer> list, int num){
        return list.stream().filter(x -> x % num == 0).collect(Collectors.toList());
    }
}
