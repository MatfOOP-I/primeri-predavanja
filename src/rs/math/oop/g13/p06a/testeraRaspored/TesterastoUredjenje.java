package rs.math.oop.g13.p06a.testeraRaspored;

import java.util.Arrays;

public class TesterastoUredjenje {

    public static <T> void prikazi(T[] niz) {
        for (T x : niz) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static <E extends Comparable<E>> void testeraRaspored(E[] niz) {
        for (int i = 0; i < niz.length - 1; i++) {
            if (i % 2 == 0) {
                if (niz[i].compareTo(niz[i + 1]) < 0) {
                    E pomocni = niz[i];
                    niz[i] = niz[i + 1];
                    niz[i + 1] = pomocni;
                }
            } else {
                if (niz[i].compareTo(niz[i + 1]) > 0) {
                    E pomocni = niz[i];
                    niz[i] = niz[i + 1];
                    niz[i + 1] = pomocni;
                }
            }
        }
    }

    public static void main(String... argumenti) {
        String[] niz = {"Маус", "Мики", "Паја", "Патак", "Хроми", "Даба"};
        prikazi(niz);
        //Arrays.sort(niz);
        //prikazi(niz);
        testeraRaspored(niz);
        prikazi(niz);

        System.out.println();
        Integer[] niz2 = {12, 43, 122, 111, 243, 253, 64};
        prikazi(niz2);
        testeraRaspored(niz2);
        prikazi(niz2);
    }
}
