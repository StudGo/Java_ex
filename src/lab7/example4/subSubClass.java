package lab7.example4;

public class subSubClass extends subClass{
    public int integer;

    subSubClass(char ch, String str, int integer) {
        super(ch,str);
        this.integer = integer;
    }
    subSubClass(subSubClass subSub) {
        super(subSub);
        this.integer = subSub.integer;
    }
}
