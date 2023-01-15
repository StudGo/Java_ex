package lab7.example3;

public class subClass extends superClass{
    public char ch;

    public void setValue(int integer, char ch) {
        this.integer = integer;
        this.ch = ch;
    }
    subClass(int integer, char ch) {
        super(integer);
        this.ch = ch;
    }
    @Override
    public String toString() {
        String str;
        str = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " integer = " + super.integer + "\n" +
                " ch = " + this.ch;
        return str ;
    }

}
