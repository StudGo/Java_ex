package lab4;

import java.util.Random;

public class example6 {
    public static void main(String[] args) {
        int size = 5;
        Random random = new Random();
        int [][] arr = new int [size][size];

        System.out.println("Исходный массив");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = random.nextInt(100);
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        int remStr= random.nextInt(size),remCol = random.nextInt(size);
        System.out.println();
        System.out.println("Удаляем " + (remStr+1) + " строку и " + (remCol+1) +" колонку");

        int[][] remArr = new int[size-1][size-1];

        for(int i = 0; i < remArr.length; i++) {
            for(int j = 0; j < remArr[0].length; j++) {
                remArr[i][j] = arr[i + (i < remStr ? 0 : 1)][j + (j < remCol ? 0 : 1)];
                System.out.print(remArr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
