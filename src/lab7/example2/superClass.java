package lab7.example2;

public class superClass {
    private String str = "privet";
    public void setValue() {
        this.str = "Метод с присваиванием без параметров";
    }
    public void setValue(String str) {
        this.str = str;
    }
    superClass (String str) {
        this.str = str;
    }
    public int getLengthStr() {
        return str.length();
    }
}
