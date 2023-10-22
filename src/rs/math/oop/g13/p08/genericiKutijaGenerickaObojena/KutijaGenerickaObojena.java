package rs.math.oop.g13.p08.genericiKutijaGenerickaObojena;

import java.awt.Color;

public class KutijaGenerickaObojena<T> extends KutijaGenericka<T>{
    private Color boja;
    
    public KutijaGenerickaObojena(Color boja){
        super();
        this.boja=boja;
    }
    
    public Color uzmiBoja() {
        return boja;
    }

    public static void main(String[] args) {
        KutijaGenerickaObojena<String> kutijaObojena = 
                new KutijaGenerickaObojena<String>(Color.red);
        kutijaObojena.postaviVrednost("Текст");
        // имплицитна конверзија у општији тип
        KutijaGenericka<String> kutija = kutijaObojena;
        System.out.println(kutija.uzmiVrednost());
    }
}