package Start;

/**
 * @author Globus
 * @created 18.02.2021
 */



import java.util.*;


public class WorkBasa {

    public static Map<Integer, Integer> Baza = new HashMap<>() ;//otsortirovann exel
    public static List <Integer> BazaLoad = new ArrayList<>();//zagruzka
    public static int [][]BazaMassiv = new int [2][36];// 1-snachenie  2-statistika
    public static int [][] MassivEntry = new int [1740][10];//perevod v statiku: 0-4 statika, 5 summa statiki
    public static int [][] BazaOut = new int [2] [36]; // result baza

    public static void InitialRazmerBaza()
    {
         for (int key=1; key<=36; key++)
         {
                Baza.put(key,0);
         }
    }


    public static void Udalenie(int limit){
        int z,x,c;
        c=Baza.size();
        z=BazaLoad.size();
       // int limit=5;
        System.out.println("Baza size=" +c+" limit="+limit);

        for(int g=1; g<=limit;g++){   //!!!!!!!!!!!!

            x=BazaLoad.get(z-g);

            Baza.remove(x);
        }
      //  System.out.println("output");
        for (int gh:Baza.keySet()
             ) {
        //    System.out.println("=>>"+gh+" ~ "+Baza.get(gh));
        }
        System.out.println("Baza key deleted=" +(c-Baza.size()));
    }


    public static void SortedBaza(){

      //  System.out.println("-----sorted2-------");
      //  System.out.println("__________________");
        Set<Map.Entry<Integer, Integer>> BazaSet2 = Baza.entrySet();
        List<Map.Entry<Integer, Integer>> BazaList2 = new ArrayList<>(BazaSet2);
      //  Collections.sort(BazaList2, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        Collections.sort(BazaList2, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        int a=-1;
        for (Map.Entry<Integer, Integer> BazaEntry2 : BazaList2
        ) {
            if(a<=35) {
                a++;
            }
         //   System.out.println(a +") "+BazaEntry2.getKey()+"-->"+BazaEntry2.getValue());
            BazaMassiv[0][a]=BazaEntry2.getKey();
            BazaMassiv[1][a]=BazaEntry2.getValue();
            System.out.println(a+1 +") "+BazaMassiv[0][a]+"-->"+BazaMassiv[1][a]);

        }
        if (Baza.size()>=5) {
            for (int yu = 0; yu <= 4; yu++) {
                System.out.printf("out to 5: key= %d ~ %d %n",
                        BazaMassiv[0][yu], BazaMassiv[1][yu]);
            }
        }
        else{
            System.out.println("end");
        }

    }


    public static void SortedBaza3(){

        //  System.out.println("-----sorted2-------");
        //  System.out.println("__________________");
        Set<Map.Entry<Integer, Integer>> BazaSet2 = Baza.entrySet();
        List<Map.Entry<Integer, Integer>> BazaList2 = new ArrayList<>(BazaSet2);
        //  Collections.sort(BazaList2, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        Collections.sort(BazaList2, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        int a=-1;
        for (Map.Entry<Integer, Integer> BazaEntry2 : BazaList2
        ) {
            if(a<=35) {
                a++;
            }
            //   System.out.println(a +") "+BazaEntry2.getKey()+"-->"+BazaEntry2.getValue());
            BazaMassiv[0][a]=BazaEntry2.getKey();
            BazaMassiv[1][a]=BazaEntry2.getValue();
            System.out.println(a+1 +") "+BazaMassiv[0][a]+"-->"+BazaMassiv[1][a]);

        }
        if (Baza.size()>=5) {
            for (int yu = 0; yu <= 4; yu++) {
                System.out.printf("out to 5: key= %d ~ %d %n",
                        BazaMassiv[0][yu], BazaMassiv[1][yu]);
            }
        }
        else{
            System.out.println("end");
        }

    }







    /////////////////////////////
        }


