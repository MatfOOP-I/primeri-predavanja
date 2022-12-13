package rs.math.oop.g13.p03.genericiUredjeniPar;

public class UredjenaCetvorka <T1, T2, T3, T4>{
    private UredjeniPar<UredjeniPar<T1, T2>, UredjeniPar<T3, T4>> elementi;

    public UredjenaCetvorka(T1 komponenta1, T2 komponenta2, T3 komponenta3, T4 komponenta4) {
        UredjeniPar<T1,T2> prvaDva = new UredjeniPar<T1, T2>(komponenta1, komponenta2);
        UredjeniPar<T3,T4> poslednjaDva = new UredjeniPar<T3, T4>(komponenta3, komponenta4);
        elementi = new UredjeniPar<UredjeniPar<T1, T2>, UredjeniPar<T3,T4>>(prvaDva, poslednjaDva);
    }

    public T1 komponenta1() {
        return elementi.prvaKomponenta().prvaKomponenta();
    }

    public T2 komponenta2() {
        return elementi.prvaKomponenta().drugaKomponenta();
    }

    public T3 komponenta3() {
        return elementi.drugaKomponenta().prvaKomponenta();
    }

    public T4 komponenta4() {
        return elementi.drugaKomponenta().drugaKomponenta();
    }

    @Override
    public String toString() {
        return "("+ komponenta1() +", "+ komponenta2()+", "+ komponenta3()+", "+ komponenta4() +")";
    }

    public static void main(String[] args) {
        UredjenaCetvorka<Integer, Float, UredjeniPar<Integer,String>, String> c1 =
                new UredjenaCetvorka<>(10, 20.3f, new UredjeniPar<>(-42, "Cudan broj"), "42");
        System.out.println(c1);
    }
}
