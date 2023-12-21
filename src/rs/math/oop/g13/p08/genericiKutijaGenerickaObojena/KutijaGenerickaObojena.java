package rs.math.oop.g13.p08.genericiKutijaGenerickaObojena;

import java.awt.Color;

public class KutijaGenerickaObojena<T> extends KutijaGenericka<T>{
    private Color boja;
    
    public KutijaGenerickaObojena(T vrednost, Color boja){
        super(vrednost);
        this.boja=boja;
    }
    
    public Color uzmiBoja() {

        return boja;
    }

    public void postaviBoja(Color boja){

        this.boja = boja;
    }

    @Override
    public String toString(){
        return "[" + uzmiVrednost().toString() + "(" + uzmiBoja() + ")]";
    }

    public static void main(String[] args) {
        KutijaGenerickaObojena<String> kutijaObojena = 
                new KutijaGenerickaObojena<String>("Текст", Color.red);
        System.out.println(kutijaObojena);
        // имплицитна конверзија у општији тип
        KutijaGenericka<String> kutija = kutijaObojena;
        System.out.println(kutija.uzmiVrednost());
    }
}