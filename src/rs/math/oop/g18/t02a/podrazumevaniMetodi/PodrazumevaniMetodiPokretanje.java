package rs.math.oop.g18.t02a.podrazumevaniMetodi;

public class PodrazumevaniMetodiPokretanje{

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
        new PodrazumevaniMetodiPokretanje().useClasses();
    }
}
