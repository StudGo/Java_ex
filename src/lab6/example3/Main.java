package lab6.example3;

public class Main {
    public static void main(String[] args) {
        int[] ints = {1,6,4,8,9,5,3,2,7,0};
        System.out.println("Минимальное число - " + MinMaxSr.searchMin(ints));
        System.out.println("Максимальное число - " + MinMaxSr.searchMax(1,6,4,8,9,5,3,2,7,0));
        System.out.println("Среднее число - " + MinMaxSr.searchSr(ints));
    }
}
