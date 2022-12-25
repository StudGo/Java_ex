package lab6.example10;

import java.util.Arrays;

public class ArrMinMax {
    static int[] arrMM (int ...arr) {
        int[] arrRet = new int[2];
        Arrays.sort(arr);
        arrRet[0] = arr[0];
        arrRet[1] = arr[arr.length - 1];
        return arrRet;
    }
}
