package lab11.task;

public class task2 {
    public static String temp = "";
    public static void main(String [] args) {
        binary(255);
        System.out.print(temp);
    }
    public static void binary(int a){
        int b;
        if(a == 0){
            return;
        }
        b = a%2;
        temp = b + temp;
        binary(a/2);
    }
}
