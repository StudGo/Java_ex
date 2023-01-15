package lab7.example5;

public class subClass1 extends superClass{
    protected int integer;
    subClass1(String str, int integer) {
        super(str);
        this.integer = integer;
    }
    public void showValue() {
        System.out.println("Название класса: " + this.getClass().getSimpleName() + "\n" +
                "Значение поля str = " + this.str + "\n" +
                "Значение поля integer = " + this.integer);
    }
}
