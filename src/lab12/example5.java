package lab12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class example5 {
//  Напишите функцию, которая принимает на вход список строк и возвращает новый список,
//  содержащий только те строки, которые содержат заданную подстроку.
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("just string look");
        strings.add("another string");
        strings.add("add without");

        System.out.println("\nСтроки в коллекции: \n");

        for (String s: strings) {
            System.out.println(s);
        }

        List<String> stringsAfter = findSubString(strings);

        System.out.println("\nСтроки со словом string: \n");

        for (String s: stringsAfter) {
            System.out.println(s);
        }
    }

    public static List<String> findSubString(List<String> list){
        return list.stream().filter(x -> x.contains("string")).collect(Collectors.toList());
    }
}
