package lab6.example10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Минимальное и максимальное значение:\n" + Arrays.toString(ArrMinMax.arrMM(15,525,25,1,5,7,8,125,9,0)));
        System.out.println("Минимальное и максимальное значение:\n" + Arrays.toString(ArrMinMax.arrMM(1,2,3,4,5,6,7,8,9,10,-6)));
    }
}
