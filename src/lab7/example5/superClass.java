package lab7.example5;

public class superClass {
    protected String str;
    superClass(String str) {
        this.str = str;
    }
    public void showValue() {
        System.out.println("Название класса: " + this.getClass().getSimpleName() + "\n" +
                "Значение поля str = " + this.str);
    }
}
