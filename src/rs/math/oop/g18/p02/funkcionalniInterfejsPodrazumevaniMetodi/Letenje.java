package rs.math.oop.g18.p02.funkcionalniInterfejsPodrazumevaniMetodi;

public interface Letenje {
    default void poletanje() {
        System.out.println("Letenje::poletanje");
    }

    default void sletanje() {
        System.out.println("Letenje::sletanje");
    }

    default void zaokretanje() {
        System.out.println("Letenje::zaokretanje");
    }

    default void krstarenje() {
        System.out.println("Letenje::krstarenje");
    }
}
