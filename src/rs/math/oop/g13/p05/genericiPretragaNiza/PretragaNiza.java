package rs.math.oop.g13.p05.genericiPretragaNiza;

public class PretragaNiza {
    
    public static <T> void prikazi(T[] niz){
        for( T x: niz){
            System.out.print(x+ " ");
        }
        System.out.println();
    }
    
    public static <T> int pretrazi(T[] niz, T element) {
        for(int i=0; i<niz.length; i++)
            if(niz[i].equals(element))
                return i;
        return -1;
    }
    
    public static void main(String[] args) {
        Integer[] nizCelih = new Integer[] {2,43,22,11,243,253,64};
        prikazi(nizCelih);
        int element1 = 34;
        System.out.printf("Позиција елемента %d је %d.%n", element1,
                pretrazi(nizCelih, element1));
        int element2 = 243;
        System.out.printf("Позиција елемента %d је %d.%n", element2,
                pretrazi(nizCelih, element2));
        String[] niz2 = {"Мики", "Маус", "Паја", "Патак", "Хроми", "Даба"};
        prikazi(niz2);
        String s1 = "Мини";
        System.out.printf("Позиција елемента %s је %d.%n", s1, pretrazi(niz2, s1));
        String s2 = "Патак";
        System.out.printf("Позиција елемента %s је %d.%n", s2, pretrazi(niz2, s2));
    }
}