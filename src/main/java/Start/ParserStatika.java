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

        Sheet sheet = wb.getSheetAt(0);

        Iterator<Row> it = sheet.iterator();

        while (it.hasNext()) {
            Row row = it.next();

            Iterator<Cell> cells = row.iterator();

            while (cells.hasNext()) {

                double cell = cells.next().getNumericCellValue();
                sod=(int)cell;

                  System.out.print("<"+sod+">");
                    if(sod>0){
                        MassivEntry[nr][nb]=Baza.get(sod);
                        System.out.print(" <"+MassivEntry[nr] [nb]+"> ");
                        nb++;
                    }



                   if (nb>5 && nr<1740){

                       ss=

                       MassivEntry[nr] [nb-1]+
                       MassivEntry[nr] [nb-2]+
                       MassivEntry[nr] [nb-3]+
                       MassivEntry[nr] [nb-4]+
                       MassivEntry[nr] [nb-5]+
                       MassivEntry[nr][nb-6];

                       MassivEntry[nr][nb+1]=ss/6;

                   //    nr>0?System.out.print("["+ss+"]"+MassivEntry[nr-1][nb+1]):System.out.print("["+ss+"]");
                       if (nr>0){
                           System.out.print("["+ss+"] "+ss/6+" / "+((ss/6)-MassivEntry[nr-1][nb+1]));
                       }
                       else System.out.print("["+ss+"]");



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
