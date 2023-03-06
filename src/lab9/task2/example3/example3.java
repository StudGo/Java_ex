package lab9.task2.example3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        ESetArray();
        SumArray(StatArray);

    }
    private static byte[] StatArray;

    private static void ESetArray(){
        try{SetArray();}
        catch (InputMismatchException e){
            System.out.println("Введите корректное значение ("+e+")");
            ESetArray();
        }
        catch (Exception e){
            System.out.println("Ошибка: ("+e+")");
            ESetArray();
        }

    }
    static class ByteRangeException extends InputMismatchException{
        ByteRangeException(){
            super("Число за пределами диапазона byte");
        }
    }
    private static void EInput(int i) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите byte элемент массива "+"["+(i+1)+"]");
            int temp=0;
            try{
                temp=scan.nextInt();
                if(temp<-128||temp>127){
                    throw new ByteRangeException();}
            }catch(ByteRangeException e){
                System.out.println("Значение за пределами диапазона byte ("+e+")");
                EInput(i);}
            StatArray[i] = (byte)temp;
        }
        catch(InputMismatchException e){
            System.out.println("Введите число ("+e+")");
            EInput(i);}


    }
    private static void SetArray() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива");
        int a = scan.nextInt();
        StatArray = new byte[a];
        for(int i=0;i<a;i++){
            EInput(i);
        }
    }

    private static void SumArray(byte [] InputArray){
        int A=0;
        for (int j : InputArray) {
            A += (int) j;
        }
        System.out.println("Сумма элементов массива = ["+(A)+"]");
    }
}
