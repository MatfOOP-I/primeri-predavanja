package rs.math.oop.g13.p06.genericiMinimalniElementNiza;

public class UredjeniParUporediv<S extends Comparable<S>, T extends Comparable<T>> 
    implements Comparable<UredjeniParUporediv<S, T>>{
    private S vrednost1;
    private T vrednost2;

    public UredjeniParUporediv(S vrednost1, T vrednost2) {
        this.vrednost1 = vrednost1;
        this.vrednost2 = vrednost2;
    }
    
    public S uzmiVrednost1() {
        return vrednost1;
    }
    
    public T uzmiVrednost2() {
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