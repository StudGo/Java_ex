package lab7.example4;

public class subClass extends superClass{
    public String str;
    subClass(char ch, String str) {
        super(ch);
        this.str = str;
    }
    subClass(subClass sub) {
        super(sub);
        this.str = sub.str;
    }
}
