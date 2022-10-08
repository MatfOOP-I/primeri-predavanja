package rs.math.oop.g13.p06.genericiMinimalniElementNiza;

public class UredjeniParUporediv<S extends Comparable<S>, T extends Comparable<T>> 
    implements Comparable<UredjeniParUporediv<S, T>>{
    private T vrednost1;
    private S vrednost2;

    public UredjeniParUporediv(T vrednost1, S vrednost2) {
        this.vrednost1 = vrednost1;
        this.vrednost2 = vrednost2;
    }
    
    public T getVrednost1() {
        return vrednost1;
    }
    
    public S getVrednost2() {
        return vrednost2;
    }
    
    @Override
    public String toString() {
        return "("+vrednost1+", "+vrednost2+")";
    }

    @Override
    public int compareTo(UredjeniParUporediv<S, T> o) {
        int uredjenjeS = this.vrednost1.compareTo(o.vrednost1);
        if(uredjenjeS!=0)
            return uredjenjeS;
        return this.vrednost2.compareTo(o.vrednost2);
    }
}