package lab7.example4;

public class superClass {
    public char ch;
    superClass(char ch) {
        this.ch = ch;
    }
    superClass(superClass sp) {
        this.ch = sp.ch;
    }
}
