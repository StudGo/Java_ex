package lab4;

public class example3 {
    public static void main(String[] args) {
        int [][] mass = {
                {2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2}
        };

        for(int i = 0; i< mass.length; i++) {
            for(int j = 0; j<5; j++)
                System.out.print(mass[i][j]);
            System.out.println();
        }

    }
}
