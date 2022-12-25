package lab6.example1;

public class CharAndString {
    char ch = '0';
    String str = "0";

    void setSymbols (char ch) {
        this.ch = ch;
    }
    void setSymbols(String str) {
        this.str = str;
    }
    void setSymbols(char[] chars) {
        if(chars.length>1) {
            this.str = new String(chars);
        } else {
            this.ch = chars[0];
        }
    }
    void showValues () {
        System.out.println("ch - " + ch + "\nstr - " + str);
    }
}
