package lab8.task1;

import java.io.*;
import java.util.Arrays;

public class example3 {
    public static void readAllByArray(InputStream in) throws IOException {
        byte[] buff = new byte[5];
        while(true) {
            int count = in.read(buff);
            if(count != -1) {
                System.out.println("Количество: " + count +
                        " buff: " + Arrays.toString(buff) +
                        ", str = " + new String(buff, 0, count, "cp1251"));
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        String fileName = "D:\\java_ex\\java_ex\\MyFile.txt";
        InputStream inFile = null;

        try {
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);
        } catch(IOException ex) {
            System.out.println("Error: " + ex);
        } finally {
            if(inFile != null) {
                try {
                    inFile.close();
                } catch(IOException ignore) {
                    /*NOP*/
                }
            }
        }
    }
}

