package rs.math.oop.g11.p07d.izuzeciPreporuke.alternativa3;

// OVAKO NE TREBA RADITI!
public class ProsekClanovaNiza {
    public static void main(String[] args) {
        int a[] = {45, 12, 1, 2, 3, 123, 4, 224, 65};
        try {
            sracunajProsek(a);
        } catch (ProsaoKrozCeoNizIzuzetak e) {
            double s = e.uzmiSuma();
            int i = e.uzmiIndeks();
            System.out.println("Prosek je " + (s / i));
        }
    }

    private static void sracunajProsek(int[] a) throws ProsaoKrozCeoNizIzuzetak {
        int i = 0;
        double s = 0;
        try {
            for (; ; ) {
                s += a[i++];
            }
        } catch (IndexOutOfBoundsException exp) {
            throw new ProsaoKrozCeoNizIzuzetak(s, i);
        }
    }

}
