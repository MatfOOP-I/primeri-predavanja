package rs.math.oop.g18.p10.podrazumevaniMetodi;

public interface BrzoLetenje extends Letenje {
    default void poletanje() {
        System.out.println("BrzoLetenje::polece");
    }
}


