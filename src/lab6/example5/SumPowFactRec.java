package lab6.example5;

public class SumPowFactRec {
    static int fact (int n) {
        double result;
        if(n==1) {
            return 1;
        }
        result = fact(n-1) + Math.pow(n,2);
        return (int)result;
    }
}
