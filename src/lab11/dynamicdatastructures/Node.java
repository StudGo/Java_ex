package lab11.dynamicdatastructures;

//Класс - структура элемента списка
class Node {
    public int value; //значение
    public Node next; //поле - ссылка (указатель) на следующй элемент

    //конструктор класса
    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
