package Start;

/**
 * @author Globus
 * @created 18.02.2021
 */

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class Parser extends WorkBasa{

    public static void Parse(String name) throws IOException {

        InputStream in = null;
        XSSFWorkbook wb = null;
        int sod, zna4;

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
               double cell = cells.next().getNumericCellValue();
               sod=(int)cell;
            //   System.out.println(sod);

               BazaLoad.add(sod);
               zna4=Baza.get(sod)+1;
               Baza.put(sod,zna4);
                }
            }

            wb.close();
      }

}

