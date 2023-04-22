package lab11.descriptioncol;

import java.util.*;

public class TreSe {
    public static void main(String[] args)
    {
        Set<Integer> treSe = new TreeSet<>();

        for (int i = 0; i < (13 * 1000000); i++){
            treSe.add(i);
        }

        int check = 7;
        System.out.println("Содержит " + check + " = " + treSe.contains(check));

        System.out.println("Первый элемент " + treSe.stream().findFirst());

        treSe.remove(1);
        treSe.remove((13 * 1000000 - 2));
        System.out.println("Array(после удаления): " + treSe);

        for (Integer value : treSe) {
            System.out.print(value + ", ");
        }

        System.out.println("\nArray: " + treSe);
    }
}
