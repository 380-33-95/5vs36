package Start;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class WriteExel extends WorkBasa{



      static String nameFileOutput="E://5vs36.2//src//main//resources//out.xlsx";


      static   FileOutputStream outFile;

    static {
        try {
            outFile = new FileOutputStream(nameFileOutput);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    static XSSFWorkbook outExcel = new XSSFWorkbook();
     static XSSFSheet listExcell = outExcel.createSheet("out 5vs36");
    static Cell cell;
    static Row row;
    static int rownum = -1;
    public static void SortedBaza(){

        //  System.out.println("-----sorted2-------");
        //  System.out.println("__________________");
        Set<Map.Entry<Integer, Integer>> BazaSet2 = Baza.entrySet();
        List<Map.Entry<Integer, Integer>> BazaList2 = new ArrayList<>(BazaSet2);
        //  Collections.sort(BazaList2, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        Collections.sort(BazaList2, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        int a=-1;
        for (Map.Entry<Integer, Integer> BazaEntry2 : BazaList2
        )
        {
            if(a<=35) {
                a++;
            }
            //   System.out.println(a +") "+BazaEntry2.getKey()+"-->"+BazaEntry2.getValue());
            BazaMassiv[0][a]=BazaEntry2.getKey();
            BazaMassiv[1][a]=BazaEntry2.getValue();
//            System.out.println(a+1 +") "+BazaMassiv2[0][a]+"-->"+BazaMassiv2[1][a]);


        }

//        System.out.println("_________");
//        if (Baza.size()>=5) {
//            for (int yu = 0; yu <= 4; yu++) {
//                System.out.printf("out to 5: key= %d ~ %d %n",
//                        BazaMassiv2[0][yu], BazaMassiv2[1][yu]);
//            }
//        }
//        else{
//            System.out.println("end");
//        }

        writeCell();

    }

    public static void writeCell(){

        rownum++;
        row = listExcell.createRow(rownum);

        for (int yu = 0; yu <= 5; yu++) {
//            System.out.printf("out to 5: key= %d ~ %d %n",
//                    BazaMassiv2[0][yu], BazaMassiv2[1][yu]);
//

            cell = row.createCell(yu, CellType.NUMERIC);
            cell.setCellValue(BazaMassiv[0][yu]);


        }

        try {
            outExcel.write(outFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }







    //end class
}
