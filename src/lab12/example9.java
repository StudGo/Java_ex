package lab12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class example9 {
//  Напишите функцию, которая принимает на вход список строк и возвращает новый список, содержащий только те строки, которые содержат только буквы (без цифр и символов).
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("letter ss q");
        strings.add("string "+'a');
        strings.add("t");
        strings.add("a");
        strings.add("9");
        strings.add("s");
        strings.add("k");
        strings.add("illusion5");
        strings.add("1");

        System.out.println("Коллекция строк: ");
        for (String str : strings) {
            System.out.println(str);
        }

        List<String> stringsAfter = findLetterString(strings);

        System.out.println("Коллекция строк состоящих из буквы: ");

        for (String str : stringsAfter) {
            System.out.println(str);
        }
    }

    public static List<String> findLetterString(List<String> list){
        return list.stream().filter(x -> x.matches("[a-zA-Z]+")).collect(Collectors.toList());
    }
}
