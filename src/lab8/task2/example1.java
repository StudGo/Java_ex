package lab8.task2;

import java.io.*;
import java.util.Scanner;

public class example1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        DataOutputStream wr1 = null;
        DataOutputStream wr2 = null;
        DataInputStream rd = null;

        System.out.print("Введите имя файла для записи: ");
        String fname = sc.nextLine();

        try {
            File f1 = new File(fname);
            f1.createNewFile();
            File f2 = new File("result");
            f2.createNewFile();

            wr1 = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));
            wr2 = new DataOutputStream(new FileOutputStream("result"));
            rd = new DataInputStream(new FileInputStream(f1.getAbsolutePath()));

            //Записать в файл1
            System.out.println("Введите 2 строки для записи в файл:");
            for (int i = 0; i < 2; i++) {
                wr1.writeUTF(sc.nextLine());
            }
            System.out.println("Введите 5 вещественных чисел для записи в файл:");
            for (int i = 0; i < 5; i++) {
                wr1.writeDouble(sc.nextDouble());
            }
            wr1.flush();
            wr1.close();

            //Прочитать из файла1
            String[] strings = new String[2];
            double[] doubles = new double[5];
            for (int i = 0; i < 2; i++) {
                strings[i] = rd.readUTF();
            }
            for (int i = 0; i < 5; i++) {
                doubles[i] = rd.readDouble();
            }
            rd.close();

            //Записать в файл2
            wr2.writeUTF(strings[1]);

            for (int i = 0; i < 5; i++) {
                if(doubles[i] > 0)
                    wr2.writeDouble(doubles[i]);
            }
            wr2.flush();
            wr2.close();

            System.out.println("Done");
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }
}
