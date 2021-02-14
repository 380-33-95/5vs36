package Start;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.awt.font.NumericShaper;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class Parser {

    public static String parse(String name) {

        String result = "";
        InputStream in = null;
        XSSFWorkbook wb = null;
        try {
            in = new FileInputStream(name);
            wb = new XSSFWorkbook(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Sheet sheet = wb.getSheetAt(1);
        Iterator<Row> it = sheet.iterator();
        while (it.hasNext()) {
            Row row = it.next();
            Iterator<Cell> cells = row.iterator();
            while (cells.hasNext()) {
                Cell cell = cells.next();
                System.out.println(cell);

                //  result += "[" + cell.getNumericCellValue() + "]";
//                result +=
//                        cell.getStringCellValue();



                }
            }
            result += "\n";


        return result;
    }

}

