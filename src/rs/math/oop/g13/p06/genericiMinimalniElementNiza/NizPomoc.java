package rs.math.oop.g13.p06.genericiMinimalniElementNiza;

public class NizPomoc {

    public static <T extends Comparable<T>> T odrediMinimum(T[] niz) throws Exception{
        if(niz.length==0)
            throw new Exception("Низ је празан - минимум нема смисла.");
        T minimum = niz[0];
        for(T element: niz)
            if(element.compareTo(minimum)<0)
                minimum = element;
        return minimum;
    }

    public static <T> void prikazNaKonzoli(T[] niz){
        for( T elem : niz)
            System.out.print( elem + " ");
        System.out.println();
    }

    public static <T> int indexOf(T[] niz, T element) {
        for(int i=0; i<niz.length; i++)
            if(niz[i].equals(element))
                return i;
        return -1;
    }
    public static <T> int lastIndexOf(T[] niz, T element) {
        for(int i=niz.length-1; i>= 0;  i--)
            if(niz[i].equals(element))
                return i;
        return -1;
    }
}