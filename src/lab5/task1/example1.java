package lab5.task1;

public class example1 {
    static class CharInsert {
        private char symbol;

        public void setChar(char symbol) {
            this.symbol = symbol;
        }
        public char getSymbol() {
            return this.symbol;
        }
        public void viewSymbol() {
            System.out.println("Значение поля: "+this.symbol+"\nЕго код: "+ (int)this.symbol);
        }
    }

    public static void main(String[] args) {
        CharInsert ci1 = new CharInsert();
        CharInsert ci2 = new CharInsert();
        ci1.setChar('s');
        ci2.setChar('u');
        System.out.println("Тест функции получения символа:");
        System.out.println(ci1.getSymbol());
        System.out.println("Вызываем методы просмотра символа и его кода:");
        ci1.viewSymbol();
        ci2.viewSymbol();
    }
}
