package lab6.example8;

public class SrZn {
    static double getSrZn(int[] arr) {
        double sum=0;
        for (int x : arr) {
            sum += x;
        }
        return sum/arr.length;
    }
}
