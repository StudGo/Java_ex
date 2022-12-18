package lab3.number1;

import java.io.PrintWriter;
import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите целое число в диапазоне от 1 до 7");
        int number = in.nextInt();
        switch(number){
            case 1:{
                System.out.println("Число " + number + " соответсвует понедельнику");
                break;
            }
            case 2:{
                System.out.println("Число " + number + " соответсвует вторнику");
                break;
            }
            case 3:{
                System.out.println("Число " + number + " соответсвует среде");
                break;
            }
            case 4:{
                System.out.println("Число " + number + " соответсвует четвергу");
                break;
            }
            case 5:{
                System.out.println("Число " + number + " соответсвует пятнице");
                break;
            }
            case 6:{
                System.out.println("Число " + number + " соответсвует субботе");
                break;
            }
            case 7:{
                System.out.println("Число " + number + " соответсвует воскресению");
                break;
            }
            default:{
                System.out.println("Введено некорректное значение");
                break;
            }
        }
    }
}
