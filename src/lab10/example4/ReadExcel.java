package lab10.example4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class ReadExcel {
    public static void main(String[] args) throws IOException {
        //Открываем файл Excel для чтения
        String filePath = "src/lab10/example4/example4.xlsx";
        XSSFWorkbook workbook = null;
        FileInputStream inputStream = null;
        try{
            inputStream = new FileInputStream(filePath);

            //Создаем экземпляр книги Excel из файла
            workbook = new XSSFWorkbook(inputStream);

            //Получаем лист из книги по его имени
            XSSFSheet sheet = workbook.getSheet("Товары");

            //Перебираем строки и ячейки листа
            for(Row row: sheet) {
                for (Cell ccell : row) {
                    System.out.println(ccell.toString() + "\t");
                }
                System.out.println();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Файл " + filePath + " не найден");
        } catch (IOException ex) {
            System.out.println("Не удалось прочитать файл");
        } finally {
            workbook.close();
            inputStream.close();
        }
    }
}
