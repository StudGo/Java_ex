package lab7.example2;

public class subClass extends superClass{
    public int integer;

    @Override
    public void setValue() {
        super.setValue();
    }
    @Override
    public void setValue(String str) {
        super.setValue(str);
    }

    public void setValue(int integer) {
        this.integer = integer;
    }
    public void setValue(int integer, String str) {
        super.setValue(str);
        this.integer = integer;
    }
    subClass(int integer, String str) {
        super(str);
        this.integer = integer;
    }
}
