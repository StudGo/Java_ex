package lab10.example1;

import java.io.File;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import javax.xml.xpath.*;
import java.util.List;
import java.util.ArrayList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
public class SearchBook {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            File inputFile = new File("src/lab10/example1/example.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            XPathFactory xpathFactory = XPathFactory.newInstance();
            XPath xpath = xpathFactory.newXPath();
            doc.getDocumentElement().normalize();
            System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
            System.out.print("Введите автора: ");
            List<String> list = new ArrayList<>();
            XPathExpression xPathExpression = xpath.compile("/library/book[author='"+in.nextLine()+"']/title/text()");
            NodeList nodes = (NodeList) xPathExpression.evaluate(doc, XPathConstants.NODESET);
            for (int i = 0; i < nodes.getLength(); i++)
                list.add(nodes.item(i).getNodeValue());

            /*NodeList nodeList = doc.getElementsByTagName("book");
;
            List<Element> books = nodeList.stream()
                    .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                    .map(node -> (Element) node)
                    .filter(element -> {
                        String author = element.getElementsByTagName("author").item(0).getTextContent();
                        String year = element.getElementsByTagName("year").item(0).getTextContent();
                        return author.equalsIgnoreCase("Лев Толстой") && year.equals("1869");
                    })
                    .collect(Collectors.toList());*/
            System.out.print("Книги автора:" + list);

        }catch (XPathExpressionException ex) {
            ex.printStackTrace();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
