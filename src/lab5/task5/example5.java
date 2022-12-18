package lab5.task5;

public class example5 {
    static class Test {
        private int value;

        Test() {
            this.value = 0;
        }
        Test(int value) {
            this.value = value;
            if(value>100) {
                this.value = 100;
            }
        }
        public void setValue (int value) {
            this.value = value;
            if(value>100) {
                this.value = 100;
            }
        }
        public void setValue() {
            this.value = 0;
        }
        public int getValue() {
            return this.value;
        }
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test(200);
        System.out.println("Конструктор без параметров: ");
        System.out.println("Значение: " + t1.getValue());
        System.out.println("Конструктор с параметром 200: ");
        System.out.println("Значение: " + t2.getValue());
        System.out.println("Вызов метода без аргументов: ");
        t2.setValue();
        System.out.println("Значение: " + t2.getValue());
        System.out.println("Вызов метода с аргументом 123");
        t1.setValue(123);
        System.out.println("Значение: " + t1.getValue());

    }
}
