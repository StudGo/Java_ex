package lab10.example3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.List;

public class ReadNews {
    public static void main(String[] args) throws InterruptedException, IOException {
        Document doc = null;
        try {
            //Получаем HTML-код
            doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();
        }catch (UnknownHostException ex) {
            Thread.sleep(1000);
            try {
                doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();
            } catch (UnknownHostException exc) {
                exc.printStackTrace();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        if(doc == null) return;
            //Извлекаем список новостей
        Elements newsParent = doc
                .select("body > table > tbody > tr > td > div > table > " +
                            "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                            "tr > td:nth-child(1)");

        try(FileWriter fileWriter = new FileWriter("src/lab10/example3/parse.txt")) {
            //Выводим последние 10 новостей в консоль
            for (int i = 3; i < 20; i++) {
                if (!(i % 2 == 0)) {
                    List<Node> nodes = newsParent.get(0).childNodes();
                    System.out.println("Тема: " +
                            ((Element) nodes.get(i))
                                    .getElementsByClass("blocktitle")
                                    .get(0).childNodes().get(0));

                    System.out.println("Дата: " +
                            ((Element) nodes.get(i))
                                    .getElementsByClass("blockdate")
                                    .get(0).childNodes().get(0) +
                            "\n");

                    fileWriter.write(((Element) nodes.get(i))
                            .getElementsByClass("blocktitle")
                            .get(0).childNodes().get(0).toString() + "\n");


                    fileWriter.write(((Element) nodes.get(i))
                            .getElementsByClass("blockdate")
                            .get(0).childNodes().get(0).toString() +
                            "\n\n");
                }
            }
        }
    }
}
