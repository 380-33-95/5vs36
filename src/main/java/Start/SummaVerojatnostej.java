package Start;

import java.util.ArrayList;
import java.util.List;

public class SummaVerojatnostej {

    public static List<Integer> nabor = new ArrayList<Integer>(6);

    public static int box=0, box1=0, xobox=0;


    public static int itr=0;

    public static int q=0;

    public static void sv(){

box=0;

        for (int boxvh:nabor)
              {
                  box += boxvh;
                  System.out.print(nabor.get(q++)+"+");

        }


        q=0;
        xobox=box-box1;
        box1=box;
        nabor.clear();
        System.out.println("="+box+" /="+box/6+" <-> "+xobox);

    }

    public static void summBox (int zna4){

        nabor.add(itr,zna4);
        itr++;
        if (itr>=5){
            sv();
            itr=0;
        }

    }


}
