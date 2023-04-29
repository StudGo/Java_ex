package lab12;

import java.util.List;
import java.util.stream.Collectors;

public class example3 {
//    Напишите функцию, которая принимает на вход список строк и возвращает новый список, содержащий
//    только те строки, которые начинаются с большой буквы.
    public static void main(String[] args) {
        String str = "Напишите функцию, Которая принимает на вход список" +
                "строк и возвращает новый список, Cодержащий только те строки, " +
                "которые Начинаются с большой буквы.";
        List<String> strings = List.of(str.split(" "));
        System.out.println("\nСтрока после сплитования: \n");
        for(String s : strings){
            System.out.println(s);
        }

        List<String> stringsAfter = filterCapitalizedStrings(strings);

        System.out.println("\nСтрока после преобразования: \n");
        for (String s : stringsAfter){
            System.out.println(s);
        }
    }

    public static List<String> filterCapitalizedStrings(List<String> list){
        return list.stream().filter(s -> Character.isUpperCase(s.charAt(0))).collect(Collectors.toList());
    }
}
