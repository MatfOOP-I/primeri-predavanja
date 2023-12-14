package rs.math.oop.g18.p10.podrazumevaniMetodi;

public interface Plovidba {
    default void krstarenje() {
        System.out.println("Plovidba::krstarenje");
    }

    default void zaokretanje() {
        System.out.println("Plovidba::zaokretanje");
    }
}
