package lab6.example6;

public class ArrCopy {
    static int[] arrReturn (int[] arr, int value) {
        int count;
        int[] arrCopy;
        if(value>arr.length) {
            arrCopy = new int[arr.length];
            count = arr.length;
        } else {
            arrCopy = new int[value];
            count = value;
        }
        System.arraycopy(arr, 0, arrCopy, 0, count);

        /*for(int i = 0; i < count; i++) {
            arrCopy[i] = arr[i];
        }*/

        return arrCopy;
    }
}
