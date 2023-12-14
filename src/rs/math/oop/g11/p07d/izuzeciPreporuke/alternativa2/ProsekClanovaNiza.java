package rs.math.oop.g11.p07d.izuzeciPreporuke.alternativa2;

public class ProsekClanovaNiza {

    public static void main(String[] args) {
        int a[] = {45, 12, 1, 2, 3, 123, 4, 224, 65};
        // OVAKO NE TREBA RADITI!
        long pocetak = System.nanoTime();
        long trajanje;
        double s = 0;
        int i = 0;
        try {
            for (; ; )
                s += a[i++];
        } catch (IndexOutOfBoundsException exp) {
            trajanje = System.nanoTime() - pocetak;
            System.out.println("Prosek je " + ((s / (i - 1))) +
                    ", a trajanje: " + trajanje / 1_000_000.0 + "ms.");
        }
    }

}
