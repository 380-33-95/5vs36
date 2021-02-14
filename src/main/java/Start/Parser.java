package Start;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class Parser extends WorkBasa{

    public static void parse(String name) throws IOException {

        String result = "";
        InputStream in = null;
        XSSFWorkbook wb = null;
        int sod, zna4;

        String value = "";

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

          //     System.out.println(sod);

               zna4=Baza.get(sod);
             Baza.put(sod,zna4++);
            
                }
            }

wb.close();

        for (int fg=1; fg<=Baza.size();fg++) {
            System.out.println(fg+" =>"+Baza.get(fg));
        }

    }

}

