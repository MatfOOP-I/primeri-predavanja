package rs.math.oop.g08.p23.samorastuciNiz;

import static java.lang.System.out;

import java.util.Scanner;

public class Pokreni {

    public static void main(String... arg){
        Scanner ulaz = new Scanner(System.in);
        out.print("Unesite broj elemenata: ");
        int n = ulaz.nextInt();
        ulaz.close();
        SamorastuciNizNiski snn = new SamorastuciNizNiski();
        for(int i=0; i<=n; i++){
            snn.postaviNa(i, "br."+ i);
        }
        snn.postaviNa(95, "Miki Maus");
        for(int i=snn.brojElemenata()-1; i>=0; i--)
            out.print(snn.uzmiSa(i)+ "|");


    }
}
