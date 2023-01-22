package lab8.task1;

import java.io.*;
import java.net.URL;

public class example2 {
    public static void readAllByByte(InputStream in) throws IOException {
        while(true) {
            int oneByte = in.read();
            if(oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.println("\n" + "end");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            InputStream inFile = new FileInputStream("text.txt");
            readAllByByte(inFile);
            System.out.println("\n\n\n");
            inFile.close();

            InputStream inUrl = new URL("http://google.com").openStream();
            readAllByByte(inUrl);
            System.out.println("\n\n\n");
            inUrl.close();

            InputStream inArray = new ByteArrayInputStream(new byte[] {7, 9, 3, 7, 4});
            readAllByByte(inArray);
            System.out.println("\n\n\n");
            inArray.close();
        } catch(IOException ex) {
            System.out.println("Error: " + ex);
        }
    }
}
