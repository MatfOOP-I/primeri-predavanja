package rs.math.oop.g13.p10.listaGenerickiUredjeniPar;

public class UredjeniPar<T, S>{
    private T komponenta1;
    private S komponenta2;

    public UredjeniPar(T komponenta1, S komponenta2) {
        this.komponenta1 = komponenta1;
        this.komponenta2 = komponenta2;
    }
    
    public T uzmiPrvaKomponenta() {
        return komponenta1;
    }
    
    public S uzmiDrugaKomponenta() {
        return komponenta2;
    }

    public void postaviPrvaKomponenta( T vrednost){
        komponenta1 = vrednost;
    }

    public void postaviDrugaKomponenta( S vrednost){
        komponenta2 = vrednost;
    }

    @Override
    public String toString() {
        return "("+ komponenta1 +", "+ komponenta2 +")";
    }
    

}