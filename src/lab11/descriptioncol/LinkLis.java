package lab11.descriptioncol;

import java.util.*;


public class LinkLis {
    public static void main(String[] args)
    {
        LinkedList<Integer> linkList = new LinkedList<Integer>();

        for (int i = 0; i < (13 * 1000000); i++){
            linkList.add(i);
        }

        int check = 7;
        System.out.println("Содержит " + check + " = " + linkList.contains(check));

        System.out.println("Первый элемент " + linkList.stream().findFirst());

        linkList.remove(1);
        linkList.remove((13 * 1000000 - 2));
        System.out.println("LinkedList (после удаления): " + linkList);

        for (Integer value : linkList) {
            System.out.print(value + ", ");
        }

        System.out.println("\nLinkedList: " + linkList);
    }
}
