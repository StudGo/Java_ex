package lab6.example4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Двойной факториал 6 = " + DoubleFactorial.fact(6));
        System.out.println("Двойной факториал 5 = " + DoubleFactorial.fact(5));
        System.out.println("Двойной факториал 6 без рекурсии = " + DoubleFactorialWithoutRec.fact(6));
        System.out.println("Двойной факториал 5 без рекурсии = " + DoubleFactorialWithoutRec.fact(5));
    }
}
