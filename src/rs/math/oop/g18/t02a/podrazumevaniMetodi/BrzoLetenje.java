package rs.math.oop.g18.t02a.podrazumevaniMetodi;

public interface BrzoLetenje extends Letenje {
    default void poletanje() {
        System.out.println("BrzoLetenje::polece");
    }
}


