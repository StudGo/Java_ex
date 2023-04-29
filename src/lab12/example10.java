package lab12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class example10 {
//  Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список, содержащий только те числа, которые меньше заданного значения.
public static void main(String[] args) {
    List<Integer> integers = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    Random random = new Random();

    for (int i = 0; i < 10; i++) {
        integers.add(random.nextInt(50));
    }
    System.out.println("Массив целых чисел: ");
    for (int i : integers) {
        System.out.println(i);
    }

    System.out.println("Введите число, меньше которого сохранить числа: ");
    int num = in.nextInt();

    List<Integer> integersAfter = findSmallerThen(integers, num);

    System.out.println("Полученный массив: ");
    for (int i : integersAfter) {
        System.out.println(i);
    }

}

    public static List<Integer> findSmallerThen(List<Integer> list, int num){
        return list.stream().filter(x -> x < num).collect(Collectors.toList());
    }
}
