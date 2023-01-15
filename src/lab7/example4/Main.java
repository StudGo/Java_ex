package lab7.example4;

public class Main {
    public static void main(String[] args) {
        subClass sub = new subClass('W', "Конструктов подкласса");
        subSubClass subSub = new subSubClass('E', "Конструктор подподкласса", 10);
        subSubClass subSubtest = new subSubClass(subSub);
        superClass test = new subSubClass(subSubtest);
        System.out.println(subSubtest.ch +" "+ subSubtest.str +" "+ subSubtest.integer);
        System.out.println(sub.ch +" "+ sub.str);
        System.out.println(test.ch);
    }
}
