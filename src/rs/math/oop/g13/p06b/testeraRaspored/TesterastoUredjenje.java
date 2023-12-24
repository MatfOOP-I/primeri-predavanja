package rs.math.oop.g13.p06b.testeraRaspored;

import java.util.Arrays;

public class TesterastoUredjenje {

    public static <T> void prikazi(T[] niz){
        for( T x: niz){
            System.out.print(x+ " ");
        }
        System.out.println();
    }

    public static <E extends Comparable<E>> void testeraRaspored(E[] niz){
        for(int i=0; i<niz.length-1; i+=2){
            if( niz[i].compareTo(niz[i+1])<0) {
                E pomocni = niz[i];
                niz[i] = niz[i + 1];
                niz[i + 1] = pomocni;
            }
        }
    }

    public static void main(String... argumenti){
        String[] niz = {"Мики", "Маус", "Паја", "Патак", "Хроми", "Даба"};
        prikazi(niz);
        Arrays.sort(niz);
        prikazi(niz);
        testeraRaspored(niz);
        prikazi(niz);
    }
}
