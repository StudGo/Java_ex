package lab4;

public class example4 {
    public static void main(String[] args) {
        char [][] twoD = new char [5][];
        twoD[0] = new char [1];
        twoD[1] = new char [2];
        twoD[2] = new char [3];
        twoD[3] = new char [4];
        twoD[4] = new char [5];
        char k = '+';

        for(int i = 0; i<twoD.length; i++)
            for(int j = 0; j<i+1; j++) {
                twoD [i][j] = k;
            }

        for (int i=0; i< twoD.length; i++) {
            for (int j = 0; j < i + 1; j++)
                System.out.print(twoD[i][j] + "");
            System.out.println();
        }
    }
}
