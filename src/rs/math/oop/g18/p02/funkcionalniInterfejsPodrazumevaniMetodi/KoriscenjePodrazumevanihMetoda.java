package rs.math.oop.g18.p02.funkcionalniInterfejsPodrazumevaniMetodi;

public class KoriscenjePodrazumevanihMetoda {

    public void useClasses() {
        Hidroavion avion = new Hidroavion();
        avion.krstarenje();
        avion.poletanje();
        avion.setVisina(1000);
        avion.zaokretanje();
        avion.krstarenje();
        avion.sletanje();
    }

    public static void main(final String[] args) {
        new KoriscenjePodrazumevanihMetoda().useClasses();
    }
}
