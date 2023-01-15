package lab7.example5;

public class subClass2 extends superClass{
    protected char ch;
    subClass2(String str, char ch) {
        super(str);
        this.ch = ch;
    }
    public void showValue() {
        System.out.println("Название класса: " + this.getClass().getSimpleName() + "\n" +
                "Значение поля str = " + this.str + "\n" +
                "Значение поля ch = " + this.ch);
    }
}
