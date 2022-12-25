package lab6.example1;

public class Main {
    public static void main(String[] args) {
        CharAndString cas = new CharAndString();
        cas.setSymbols('u');
        cas.setSymbols("privet");
        cas.showValues();
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        cas.setSymbols(chars);
        cas.showValues();
        char[] ch = {'z'};
        cas.setSymbols(ch);
        cas.showValues();
    }
}
