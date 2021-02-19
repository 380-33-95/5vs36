package Start;

/**
 * @author Globus
 * @created 18.02.2021
 */

import java.io.IOException;

public class Start {



    public static void main (String [] args) throws IOException {

     WorkBasa.InitialRazmerBaza();
     Parser.Parse("G://5vs36//src//main//resources//results.xlsx");
     WorkBasa.SortedBaza();

        ParserStatika.ParseStatik("G://5vs36//src//main//resources//results.xlsx");

   //     WorkBasa.Udalenie();

   //     WorkBasa.SortedBaza2();



}

}
