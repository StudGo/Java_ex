package lab5.task2;

public class example2 {
    public static class SerialChar {
        public char firstChar;
        public char secondChar;
        public void serialView () {
            char temp = this.firstChar;
            while((int)temp <= (int)this.secondChar) {
                System.out.print(temp+" ");
                temp++;
            }
        }
    }

    public static void main(String[] args) {
        SerialChar sc = new SerialChar();
        sc.firstChar = 'A';
        sc.secondChar = 'Z';
        sc.serialView();
    }
}
