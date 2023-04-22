package lab11.descriptioncol;


import java.util.ArrayDeque;

public class ArrDeq {
    public static void main(String[] args){
        ArrayDeque<Integer> arrDeq = new ArrayDeque<Integer>();

        for (int i = 0; i < (13 * 1000000); i++){
            arrDeq.add(i);
        }

        for (Integer element : arrDeq) {
            System.out.println("Элемент: " + element);
        }

        arrDeq.addFirst(1);
        arrDeq.addFirst(0);

        arrDeq.addLast(10);
        arrDeq.addLast(11);

        System.out.println("\nПоиск головы: " + arrDeq.getFirst());
        System.out.println("Поиск хвоста: " + arrDeq.getLast());

        Object[] arr1 = arrDeq.toArray();
        System.out.println("\nРазмер списка: " + arr1.length);
        System.out.println("Элементы списка: ");
        for (int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }

        System.out.println("\n\nУдаление головы: " + arrDeq.removeFirst());
        System.out.println("Удаление хвоста: " + arrDeq.removeLast());

        System.out.println("\nОкончательный список: " + arrDeq);
    }
}
