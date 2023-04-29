package lab12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class example7 {
//  Напишите функцию, которая принимает на вход список строк и возвращает новый список,
//  содержащий только те строки, которые имеют длину больше заданного значения.
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        strings.add("length7");
        strings.add("len4");
        strings.add("justString12");

        System.out.println("Коллекция строк: ");
        for (String str:strings) {
            System.out.println(str);
        }

        System.out.println("Введите требуемую длину: ");
        int len = in.nextInt();

        List<String> stringsAfter = findLenStr(strings, len);

        System.out.println("Строки длинной больше " + len + ": ");
        for (String str:stringsAfter) {
            System.out.println(str);
        }
    }

    public static List<String> findLenStr(List<String> list, int len){
        return list.stream().filter(x -> x.length() > len).collect(Collectors.toList());
    }
}