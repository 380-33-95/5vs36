package Start;

public class Shag1 extends WorkBasa{


    public static int timebuffer [] = new int [6];

    static int sz=0;

    public static void step1(int sod){

        if(sz<=5){

            Shag1.timebuffer[sz]=sod;
        //    System.out.println("tb ["+sz+"]= "+Pribligenie1.timebuffer[sz]);
            sz++;
        }

        if(sz>5){
            sz=0;
        }

    }

    public static void pr1(){



        for (int i:timebuffer
             ) {
            Baza.put(i,0);

        }



    }

}
