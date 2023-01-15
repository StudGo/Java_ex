package lab7.example5;

public class Main {
    public static void main(String[] args) {
        superClass test;
        superClass sup = new superClass("Строка суперкласса");
        subClass1 sub1 = new subClass1("Строка подкласса 1", 10);
        subClass2 sub2 = new subClass2("Строка подкласса 2", 'Q');
        test = sup;
        test.showValue();
        test = sub1;
        test.showValue();
        test = sub2;
        test.showValue();
    }
}
