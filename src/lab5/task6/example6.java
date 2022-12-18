package lab5.task6;

public class example6 {
    static class MinMax {
        private int min;
        private int max;

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
                    return;
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
    }
}
