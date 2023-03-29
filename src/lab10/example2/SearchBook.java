package lab10.example2;

import java.io.FileReader;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class SearchBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("src/lab10/example2/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: "+jsonObject.keySet().iterator().next());
            System.out.println("Введите автора: ");
            String author = in.nextLine();
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
            for (Object o: jsonArray)
            {
                JSONObject book = (JSONObject) o;
                if(book.get("author").equals(author)){
                    System.out.println("\nТекущий элемент: book");
                    System.out.println("Название книги: " + book.get("title"));
                    System.out.println("Автор: " + book.get("author"));
                    System.out.println("Год издания: " + book.get("year"));
                }
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
