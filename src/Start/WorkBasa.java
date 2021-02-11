package Start;

import java.util.HashMap;
import java.util.Map;


public class WorkBasa {

    public static Map<Integer, Integer> Baza = new HashMap<>() ;

    public static void InitialRazmerBaza(){
        for (int key=1; key<=36; key++) {

            Baza.put(key,0);
            System.out.println("Baza "+key+" ves = "+Baza.get(key));
        }
    }



    }


