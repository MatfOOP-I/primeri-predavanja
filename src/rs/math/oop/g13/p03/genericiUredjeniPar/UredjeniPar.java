package rs.math.oop.g13.p03.genericiUredjeniPar;

import rs.math.oop.g13.p02a.KutijaGenericka;

public class UredjeniPar<S, T>{
    private S vrednost1;
    private T vrednost2;

    public UredjeniPar(S vrednost1, T vrednost2) {
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
    
    public static void main(String[] args) {
        UredjeniPar<Integer, Integer> par1 = new UredjeniPar<Integer, Integer>(10, 20);
        System.out.println(par1);
        UredjeniPar<Integer, String> par2 = new UredjeniPar<>(30, "Пример текст");
        System.out.println(par2);
        // не пролази компилацију због неслагања очекиваног и прослеђеног типа
        //UredjeniPar<Integer, Integer> par3 = new UredjeniPar<>(30, 14.0);
        UredjeniPar<UredjeniPar<Integer, String>, KutijaGenericka<UredjeniPar<String, String>>> par3 =
                new UredjeniPar<>(new UredjeniPar<>(12, "a"),
                        new KutijaGenericka<>(new UredjeniPar<>("b", "c")) );
        System.out.println(par3);
    }
}