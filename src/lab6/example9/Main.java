package lab6.example9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
        System.out.println(Arrays.toString(arr));
        ReverseChar.reverse(arr);
        System.out.println(Arrays.toString(arr));
        ReverseChar.reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
