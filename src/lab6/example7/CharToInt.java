package lab6.example7;

public class CharToInt {
    static int[] charInt (char[] arrCh) {
        int[] arrInt = new int[arrCh.length];

        for(int i = 0; i < arrCh.length; i++) {
            arrInt[i] = arrCh[i];
        }

        return arrInt;
    }
}
