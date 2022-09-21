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

        InitialRazmerBaza();

        InputStream in = null;
        XSSFWorkbook wb = null;
        int sod, zna4 = 0;
        int iter=0;

        int sz=0;

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

            //    System.out.println("->"+sod);
                iter++;
                if(sod>0){

                    BazaLoad.add(sod);
                    zna4=Baza.get(sod)+1;
                    Baza.put(sod,zna4);

//                   Shag1.step1(sod);

                    if (iter<=6){
                        sz+=Baza.get(sod);
                        System.out.print(Baza.get(sod)+" ");
                    }
                    else {
                        System.out.println("="+sz);
                        sz=0;
                        iter=0;
                    }


               //     SummaVerojatnostej.summBox(zna4);

                }

//                if(iter>=5)
//                {
//                    iter=0;
////                    outputBaza();
////                    WriteExel.SortedBaza();
////                    WriteExel.writeCell();
//                }

                }
            }

            wb.close();
//        Shag1.pr1();
//        outputBaza();
//        SortedBaza();
      }

      public static void outputBaza(){
          for (int nb=1; nb<=36; nb++)
          {
              if(Baza.get(nb)>0){
                  System.out.println("#"+nb+" = "+Baza.get(nb));
              }

          }
          System.out.println("_________");
      }


}

