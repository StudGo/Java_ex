package lab9.task2.example1;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        try{
            PositiveAverageArray(SetArray());}
        catch (NullPointerException e){
            System.out.println("Ошибка: ("+e+")");
        }
        catch (Exception e){
            System.out.println("Неверный ввод данных ("+e+")");
        }

    }
    private static int[] SetArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int a = in.nextInt();
        int[] Array = new int[a];
        for(int i=0; i<a; i++){
            System.out.println("Введите целочисленный элемент массива "+"["+(i+1)+"]");
            Array[i]=in.nextInt();
        }
        return Array;
    }
    private static void PositiveAverageArray(int [] InputArray){
        double A=0;
        boolean flag = false;
        for (int j : InputArray) {
            if (j>0){
                A += j;
            }
            else if (j==0){
                flag=true;
            }
        }
        if (A <= 0 && !flag){
            throw new NullPointerException("отсутсвуют положительные элементы массива");
        }
        System.out.println("среднее значение положительных элементов массива = ["+(A/InputArray.length)+"]");
    }
}
