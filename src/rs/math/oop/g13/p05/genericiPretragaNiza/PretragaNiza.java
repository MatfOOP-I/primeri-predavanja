package rs.math.oop.g13.p05.genericiPretragaNiza;

public class PretragaNiza {

    public static <T> int pretrazi(T[] niz, T element) {
        for(int i=0; i<niz.length; i++)
            if(niz[i].equals(element))
                return i;
        return -1;
    }
    
    public static void main(String[] args) {
        Integer[] nizCelih = new Integer[]{2, 43, 22, 11, 243, 253, 64};
        int element1 = 34;
        int element2 = 243;
        System.out.printf("Позиција елемента %d је %d.%n", element1,
                pretrazi(nizCelih, element1));
        System.out.printf("Позиција елемента %d је %d.%n", element2,
                pretrazi(nizCelih, element2));
        Double[] niz2 = {23.5, 12.4, 11.7};
        System.out.printf("Позиција елемента %f је %d.%n", 11.7, pretrazi(niz2, 11.7));
    }
}