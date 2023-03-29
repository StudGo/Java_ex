package lab10.example1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class AddBook {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            File inputFile = new File("src/lab10/example1/example.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);

            Element book = doc.createElement("book");
            doc.getDocumentElement().appendChild(book);

            Element title = doc.createElement("title");
            System.out.print("Введите название книги: ");
            title.appendChild(doc.createTextNode(in.nextLine()));
            book.appendChild(title);

            Element author = doc.createElement("author");
            System.out.print("\nВведите автора книги: ");
            author.appendChild(doc.createTextNode(in.nextLine()));
            book.appendChild(author);

            Element year = doc.createElement("year");
            System.out.print("\nВведите год выпуска книги: ");
            year.appendChild(doc.createTextNode(in.nextLine()));
            book.appendChild(year);

            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new FileOutputStream("src/lab10/example1/example.xml"));
            transformer.transform(source, result);
            System.out.println("Книга успешно добавлена");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
