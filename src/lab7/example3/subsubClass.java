package lab7.example3;

public class subsubClass extends subClass{
    public String str;
    public void setValue(int integer, char ch, String str) {
        this.integer = integer;
        this.ch = ch;
        this.str = str;
    }
    subsubClass(int integer, char ch, String str) {
        super(integer, ch);
        this.str = str;
    }
    @Override
    public String toString() {
        String str;
        str = "subSub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " integer = " + super.integer + "\n" +
                " ch = " + super.ch + "\n" +
                " str = " + this.str;
        return str ;
    }
}
