package rs.math.oop.g13.p05.genericiPretragaNiza;

import static rs.math.oop.g13.p05.genericiPretragaNiza.NizPomoc.*;

public class PokretanjePretraga {

    public static void main(String[] args) {
        Integer[] nizCelih = new Integer[]{2, 43, 22, 11, 43, 253, 64};
        prikazNaKonzoli(nizCelih);
        int element1 = 34;
        int element2 = 43;
        System.out.printf("Прва позиција елемента %d је %d.%n", element1,
                indexOf(nizCelih, element1));
        System.out.printf("Прва позиција елемента %d је %d.%n", element2,
                indexOf(nizCelih, element2));
        System.out.printf("Последња позиција елемента %d је %d.%n", element2,
                lastIndexOf(nizCelih, element2));
        Double[] niz2 = {23.5, 12.4, 11.7, 23e2};
        prikazNaKonzoli(niz2);
        System.out.printf("Позиција елемента %f је %d.%n", 11.7, indexOf(niz2, 11.7));
    }

}
