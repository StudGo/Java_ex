package lab11.dynamicdatastructures;

public class Test2_2 {
    public static void main(String[] args) {
        //добавление элементов с перемещением головы ( наращивание с головы)
        Node head = new Node(0,null); //начальное значение ссылки на голову
        Node ref = null;
        Node tail = null;
        for (int i = 1; i <= 9; i++) {
            tail = new Node(i, null);
            ref = head;
            while (ref.next != null){
                ref = ref.next;
            }
            ref.next = tail;
        }
        //вывод элементов на экран
        ref = head;
        while (ref != null) {
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }
}
