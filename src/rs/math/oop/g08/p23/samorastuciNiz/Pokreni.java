package rs.math.oop.g08.p23.samorastuciNiz;

import static java.lang.System.out;

public class Pokreni {

    public static void main(String... arg){
        SamorastuciNizNiski snn = new SamorastuciNizNiski();
        for(int i=0; i<=100; i++){
            snn.postaviNa(i, "br."+ i);
        }
        snn.postaviNa(2, "Miki Maus");
        for(int i=snn.brojElemenata()-1; i>=0; i--)
            out.print(snn.uzmiSa(i)+ "|");


    }
}
