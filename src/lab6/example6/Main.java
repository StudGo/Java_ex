package lab6.example6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,6,4,3,7,5,8,9,0,2};
        System.out.println(Arrays.toString(ArrCopy.arrReturn(arr, 5)));
        System.out.println(Arrays.toString(ArrCopy.arrReturn(arr, 20)));
    }
}
