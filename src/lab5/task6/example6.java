package lab5.task6;

public class example6 {
    static class MinMax {
        private int min;
        private int max;

        MinMax() {
            min = 0;
            max = 0;
        }

        MinMax(int value) {
            this.max = value;
        }

        MinMax(int min, int max) {
            if(min > max) {
                int temp = max;
                max = min;
                min = temp;
            }
            this.min = min;
            this.max = max;
        }

        public void setMinMax(int value) {
            if(value > this.min) {
                if(value > this.max) {
                    this.max = value;
                } else {
                    this.min = value;
                }
            }
        }
        public void setMinMax(int min, int max) {
            if(min > max) {
                int temp = max;
                max = min;
                min = temp;

            }

            if(min > this.min) {
                if(min > this.max) {
                    this.min = min;
                    this.max = max;
                } else {
                    this.min = min;
                    if(max > this.max) {
                        this.max = max;
                    }
                }
            } else if(max > this.min) {
                if(max > this.max) {
                    this.max = max;
                } else {
                    this.min = max;
                }
            }
        }

        public void showValues() {
            System.out.println("Минимальное значение - " + min +"\nМаксимальное значение - " + max);
        }
    }

    public static void main(String[] args) {
        MinMax mm = new MinMax();
        MinMax mm1 = new MinMax(6);
        MinMax mm2 = new MinMax(7, 2);
        mm.setMinMax(6);
        mm.setMinMax(7, 10);
        mm.showValues();
        mm1.setMinMax(4, 8);
        mm1.setMinMax(10,3);
        mm1.showValues();
        mm2.setMinMax(4, 5);
        mm2.showValues();

    }
}
