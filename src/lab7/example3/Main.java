package lab7.example3;

public class Main {
    public static void main(String[] args) {
        superClass sup = new superClass(10);
        subClass sub = new subClass(20, 'U');
        subsubClass subSub = new subsubClass(30, 'R', "subSub");
        System.out.println(sup.toString());
        System.out.println(sub.toString());
        System.out.println(subSub.toString());
    }
}
