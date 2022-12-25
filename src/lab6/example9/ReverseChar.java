package lab6.example9;

public class ReverseChar {
    static void reverse (char[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        //return arr;
    }
}
