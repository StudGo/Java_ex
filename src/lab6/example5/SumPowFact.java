package lab6.example5;

public class SumPowFact {
    static int fact (int n) {
        int result = 0;
        for(int i = 1; i <= n; i++) {
            result += Math.pow(i, 2);
        }
        return result;
    }
}
