package rs.math.oop.g13.p03.genericiUredjeniPar;

public class UredjeniPar<T, S>{
    private T komponenta1;
    private S komponenta2;

    public UredjeniPar(T komponenta1, S komponenta2) {
        this.komponenta1 = komponenta1;
        this.komponenta2 = komponenta2;
    }
    
    public T prvaKomponenta() {
        return komponenta1;
    }
    
    public S drugaKomponenta() {
        return komponenta2;
    }
    
    @Override
    public String toString() {
        return "("+ komponenta1 +", "+ komponenta2 +")";
    }
    
    public static void main(String[] args) {
        UredjeniPar<Integer, Integer> par1 = new UredjeniPar<Integer, Integer>(10, 20);
        UredjeniPar<Integer, String> par2 = new UredjeniPar<>(30, "Пример текст");
        // не пролази компилацију због неслагања очекиваног и прослеђеног тип
        //UredjeniPar<Double, Double> par3 = new UredjeniPar<>(30, 14.0);
        System.out.println(par1);
        System.out.println(par2);
    }
}