package lab12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example2 {
//    Напишите функцию, которая принимает на вход два массива целых чисел и возвращает новый массив,
//    содержащий только те элементы, которые есть в обоих массивах.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++){
            arr1[i] = random.nextInt(200);
            arr2[i] = random.nextInt(200);
        }

        System.out.println("Массив arr1: " + Arrays.toString(arr1));
        System.out.println("Массив arr1: " + Arrays.toString(arr2));

        int[] arrResult = findCommonElements(arr1, arr2);

        System.out.println("Массив arr1: " + Arrays.toString(arrResult));
    }

    public static int[] findCommonElements(int[] arr1, int[] arr2){
        return Arrays.stream(arr1).filter(x -> Arrays.stream(arr2).anyMatch(y -> y == x)).toArray();
    }
}
