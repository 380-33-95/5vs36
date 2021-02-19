package Start;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

/**
 * @author Globus
 * @created 19.02.2021
 */
public class ParserStatika extends WorkBasa {


    public static void ParseStatik(String name) throws IOException {

        InputStream in = null;
        XSSFWorkbook wb = null;
        int sod, nb=0, nr=0, ss;

        try {
            in = new FileInputStream(name);
            wb = new XSSFWorkbook(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Sheet sheet = wb.getSheetAt(2);

        Iterator<Row> it = sheet.iterator();

        while (it.hasNext()) {
            Row row = it.next();

            Iterator<Cell> cells = row.iterator();

            while (cells.hasNext()) {

                double cell = cells.next().getNumericCellValue();
                sod=(int)cell;

                //   System.out.print("<"+sod+">");

                   MassivEntry[nr][nb]=Baza.get(sod);
                System.out.print(" <"+MassivEntry[nr] [nb]+"> ");
                   nb++;

                   if (nb>4 && nr<20){

                       ss=

                       MassivEntry[nr] [nb-1]+
                       MassivEntry[nr] [nb-2]+
                       MassivEntry[nr] [nb-3]+
                       MassivEntry[nr] [nb-4]+
                       MassivEntry[nr] [nb-5];

                       System.out.print("["+ss+"]");

                       nr++;
                       nb=0;
                       System.out.println();
                   }
            }
        }

        wb.close();

    }

    /////////////////////end class
}
