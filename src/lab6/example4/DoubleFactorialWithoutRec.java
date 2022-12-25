package lab6.example4;

public class DoubleFactorialWithoutRec {
    static int fact(int n) {
        int result = n;

        while(n!=1 && n!=2) {
            n-=2;
            result *= n;
        }

        return result;
    }
}
