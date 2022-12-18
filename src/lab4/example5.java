package lab4;

import java.util.Random;

public class example5 {
    public static void main(String[] args) {
        Random random = new Random();
        int rand1 = random.nextInt(10);
        if(rand1==0) {
            rand1++;
        }
        int rand2 = random.nextInt(10);
        if(rand2==0) {
            rand2++;
        }
        int[][] mass = new int [rand1][rand2];
        int[][] copyMass = new int [rand2][rand1];
        System.out.println("Исходный массив:");

        for(int i = 0; i< mass.length; i++) {
            for(int j = 0; j<mass[0].length; j++) {
                mass[i][j]=random.nextInt(100);
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Меняем строки и столбцы:");

        for(int i = 0; i < copyMass.length; i++) {
            for(int j = 0; j < copyMass[0].length; j++) {
                copyMass[i][j] = mass[j][i];
                System.out.print(copyMass[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
