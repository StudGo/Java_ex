package lab8.task1;

import java.io.*;


public class example7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;

        try {
            br = new BufferedReader(new FileReader("D:\\java_ex\\java_ex\\MyFile1.txt"), 1024);
            out = new BufferedWriter(new FileWriter("D:\\java_ex\\java_ex\\MyFile2.txt"));

            int lineCount = 0;
            String s;

            while((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.write(s);
                out.newLine();
            }
        } catch(IOException ex) {
            System.out.println("Ошибка !!!!!!!!" + ex);
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
