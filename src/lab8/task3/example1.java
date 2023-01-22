package lab8.task3;

import java.io.*;
import java.util.Scanner;

public class example1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите имя файла для чтения: ");
        String fname = sc.nextLine();

        BufferedWriter wr = null;
        BufferedReader rd = null;

        try {
            File f1 = new File(fname);
            File f2 = new File("result");
            f2.createNewFile();

            wr = new BufferedWriter(new FileWriter(f2.getAbsolutePath()));
            rd = new BufferedReader(new FileReader(f1.getAbsolutePath()));

            String resStr = "аАоОуУеЕыЫэЭяЯиИюЮ";
            String str = null;
            while((str = rd.readLine()) != null) {
                int numberLine = 0;
                int countWords = 0;
                String[] words = str.split(" ");

                for(String w: words) {

                    if(resStr.indexOf(w.charAt(0)) > -1) {
                        countWords++;
                        wr.write(numberLine + ": " + w + "\n");
                    }
                }
                numberLine++;
                wr.write("Из " + numberLine + " строки выписано " + countWords + " слов(а) " + "\n");
            }

            System.out.println("Done");
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        } finally {
            rd.close();
            wr.flush();
            wr.close();
        }
    }
}
