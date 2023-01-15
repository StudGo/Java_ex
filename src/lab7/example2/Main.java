package lab7.example2;

public class Main {
    public static void main(String[] args) {
        superClass sup = new superClass("Конструктор суперкласса с 1 параметром");
        System.out.println("Конструктор с 1 параметром(26) - " + sup.getLengthStr());
        sup.setValue();
        System.out.println("Метод без параметров(36) - " + sup.getLengthStr());
        sup.setValue("Длина строки 15");
        System.out.println("Длина строки 15 - " + sup.getLengthStr());
        subClass sub = new subClass(10, "Конструктор подкласса с 2 параметрами:");
        System.out.println("Конструктор с 2 параметрами\nДлина строки (38) - " + sub.getLengthStr() +
        "\nЗначение поля подкласса (10) - " + sub.integer);
        sub.setValue(50, "Метод подкласса 18");
        System.out.println("Метод подкласса с 2 параметрами (int, String):\n" +
                "Значение поля подкласса (50) - " + sub.integer +
                "\nДлина строки (18) - " + sub.getLengthStr());
    }
}
