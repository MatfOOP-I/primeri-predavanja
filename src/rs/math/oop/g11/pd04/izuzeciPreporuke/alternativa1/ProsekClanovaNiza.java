package rs.math.oop.g11.pd04.izuzeciPreporuke.alternativa1;

public class ProsekClanovaNiza {

    public static void main(String[] args) {
        int a[] = {45, 12, 1, 2, 3, 123, 4, 224, 65};
        long pocetak = System.nanoTime();
        // OVAKO TREBA RADITI!
        double s = 0;
        for (int x : a)
            s += x;
        s /= a.length;
        long trajanje = System.nanoTime() - pocetak;
        System.out.println("Prosek je " + s
                + ", a trajanje: " + trajanje / 1_000_000.0 + "ms.");
    }

}
