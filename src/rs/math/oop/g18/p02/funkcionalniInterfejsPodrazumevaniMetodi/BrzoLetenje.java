package rs.math.oop.g18.p02.funkcionalniInterfejsPodrazumevaniMetodi;

public interface BrzoLetenje extends Letenje {
    default void poletanje() {
        System.out.println("BrzoLetenje::polece");
    }
}


