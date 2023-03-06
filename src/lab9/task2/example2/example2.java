package lab9.task2.example2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        EMatrix();
        EPrintColumn();
    }

    private static void EMatrix() {
        try {PrintMatrix(CreateMatrix());}
        catch(NegativeArraySizeException e){
            System.out.println("Введен неверный размер матрицы ("+e+")");
            EMatrix();
        }
        catch(InputMismatchException e){
            System.out.println("введен неверный параметр матрицы ("+e+")");
            EMatrix();
        }
    }

    private static void EPrintColumn(){
        try{PrintColumn();}
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Столбик за пределами матрицы ("+e+")");
            EPrintColumn();
        }
        catch(InputMismatchException e){
            System.out.println("Введен неверный параметр столбика ("+e+")");
            EPrintColumn();
        }
    }

    private static int width;
    private static int height;
    private static int[][] MatrixStat;

    private static void PrintMatrix(int[][] Array) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("[" + (j+1) + "][" + (i+1) + "]=" + Array[j][i]+"\t"); //печать
            }
            System.out.println();
        }
    }
    private static int [][] CreateMatrix(){
        Random random = new Random(200);
        Scanner id = new Scanner(System.in);
        System.out.print("Введите ширину матрицы: ");
        width = id.nextInt();
        System.out.print("Введите высоту матрицы: ");
        height = id.nextInt();
        int [][] Matrix = new int [width][height];
        for (int i = 0 ; i <width; i++) {
            for (int j = 0 ; j <height; j++) {
                Matrix[i][j] = random.nextInt(200);
            }
        }
        MatrixStat = Matrix;
        return Matrix;
    }
    private static void PrintColumn(){
        Scanner id = new Scanner(System.in);
        System.out.print("Выберите столбик матрицы: ");
        int column = id.nextInt();
        for(int i = 0; i<height;i++){
            System.out.print("[" + column + "][" + (i+1) + "]=" + MatrixStat[column-1][i]+"\n");
        }
    }
}
