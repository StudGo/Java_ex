package lab3.number10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example10 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in); // Создание объекта класса Scanner для считывания числа введённого к консоль
        System.out.println("Введите размер массива"); // Сообщение пользователю "для красоты и понимания"
        int size = id.nextInt(); // Запись в переменную Size (нужная для того чтобы задать размер массива)
        //значения введенного в консоль
        System.out.println("Размер массива равен "+ size); // Сообщение пользователю "для красоты и понимания"
        int[] nums = new int[size]; // Создание массива с размером введённым из консоли
        Random random = new Random(); // Создание объекта класса Random для генерации "случайного" числа
        for (int i = 0 ; i < nums.length ; i++ ){
            nums[i] = random.nextInt(200); // Присвоение i-тому элементу массива случайного значения
            System.out.println("Элемент массива ["+i+"] = " + nums[i]); // Сообщение пользователю "для красоты и понимания"
        }

        Arrays.sort(nums); // Сортировка массива по возрастанию его элементов

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < nums.length-1; i++) {
                if(nums[i] < nums[i+1]){
                    isSorted = false;

                    buf = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = buf;
                }
            }
        }



        System.out.println("Произведена сортировка массива"); // Сообщение пользователю "для красоты и понимания"
        for (int i = 0 ; i < nums.length ; i++ ){
            System.out.println("Элемент массива ["+i+"] после сортировки = " + nums[i]); // Сообщение пользователю "для красоты и понимания"
        }
    }
}
