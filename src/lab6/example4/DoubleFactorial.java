package lab6.example4;

public class DoubleFactorial {
    static int fact(int n) {
        int result;
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return  2;
        }
        result = fact(n-2) * n;
        return result;
    }
}
