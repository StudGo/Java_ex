package lab11.dynamicdatastructures;

//Главный класс
public class Test {
    public static void main(String[] args) {

        Node node0 = new Node(0, null);
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null);

        //связывание узлов с помощью ссылок
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;

        //вывод списка с использованием вспомогательной переменной ref,
        //соответсвующей текущему значению ссылки при прохождении по списку
        Node ref = node0;
        while (ref != null) {
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }
}
