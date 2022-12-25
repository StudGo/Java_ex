package lab6.example3;

import java.util.Arrays;

public class MinMaxSr {
    static int searchMin(int ...ints) {
        int min;
        Arrays.sort(ints);
        min = ints[0];
        return min;
    }
    static int searchMax(int ...ints) {
        int max;
        Arrays.sort(ints);
        max = ints[ints.length-1];
        return max;
    }
    static int searchSr(int ...ints) {
        int sr;
        Arrays.sort(ints);
        sr = ints[(ints.length-1)/2];
        return sr;
    }
}
