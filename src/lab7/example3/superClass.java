package lab7.example3;

public class superClass {
    public int integer;
    public void setValue(int integer) {
        this.integer = integer;
    }
    superClass(int integer) {
        this.integer = integer;
    }
    @Override
    public String toString() {
        String str;
        str = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " integer = " + this.integer;
        return str ;
    }
}
