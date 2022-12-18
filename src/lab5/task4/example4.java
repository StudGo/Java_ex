package lab5.task4;

public class example4 {
    static class CharIntDb {
        char symbol;
        int value;

        CharIntDb(double value) {
            this.symbol = (char)value;
            this.value = (int)(value%1*100);
        }
        CharIntDb(char symbol, int value) {
            this.symbol = symbol;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        CharIntDb cid1 = new CharIntDb('Z', 54);
        CharIntDb cid2 = new CharIntDb(65.6512);
        System.out.println("Конструктор с двумя аргументами:");
        System.out.println("Символ: "+ cid1.symbol + ", целочисленное значение: " + cid1.value);
        System.out.println("Конструктор с аргументом типа double:");
        System.out.println("Передаём значение 65.6512:");
        System.out.println("Символ: "+ cid2.symbol + ", целочисленное значение: " + cid2.value);

    }
}
