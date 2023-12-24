/***
 * Excerpted from "Functional Programming in Java",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
 ***/
package rs.math.oop.g18.p01a.funkcionalniInterfejsCustomDefaultMethod;

public class FunkcionalniInterfejs {
    public interface Primer1 {
        boolean test(int input);
    }

    @FunctionalInterface
    public interface Primer2 {
        boolean test(int input);

        //int increment(int argument);
    }

    @FunctionalInterface
    public interface Primer3 {
        boolean test(int input);

        default int increment(int argument) {
            return (argument + 1);
        }
    }

    public static void main(final String[] args) {
        Primer1 primer1 = input -> true;
        System.out.println(primer1.test(42));

        Primer2 primer2 = input -> (input < 10);
        System.out.println(primer2.test(42));

        Primer3 primer3 = input -> (input > 10);
        System.out.println(primer3.test(42));
        System.out.println(primer3.increment(42));
    }
}
