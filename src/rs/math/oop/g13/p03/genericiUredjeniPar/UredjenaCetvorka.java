package rs.math.oop.g13.p03.genericiUredjeniPar;

public class UredjenaCetvorka <T1, T2, T3, T4>{
    private UredjeniPar<UredjeniPar<T1, T2>, UredjeniPar<T3, T4>> elementi;

    public UredjenaCetvorka(T1 vrednost1, T2 vrednost2, T3 vrednost3, T4 vrednost4) {
        elementi = new UredjeniPar<UredjeniPar<T1, T2>, UredjeniPar<T3,T4>>(
                            new UredjeniPar<T1, T2>(vrednost1, vrednost2),
                            new UredjeniPar<T3, T4>(vrednost3, vrednost4)
        );
    }

    public T1 uzmiVrednost1() {
        return elementi.uzmiVrednost1().uzmiVrednost1();
    }

    public T2 uzmiVrednost2() {
        return elementi.uzmiVrednost1().uzmiVrednost2();
    }

}
