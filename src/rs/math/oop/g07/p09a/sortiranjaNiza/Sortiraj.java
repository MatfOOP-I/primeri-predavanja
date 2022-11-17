package rs.math.oop.g07.p09a.sortiranjaNiza;

public class Sortiraj {
    public static void main(String[] argumenti){
        int x = 7;
        int[] niz1 = {2,-3, -(x-4), new Integer(x+3), 11, -5, 7 };
        prikazi(niz1);
        java.util.Arrays.sort(niz1);
        prikazi(niz1);

        double[] niz2 = inicijalizuj();
        prikazi(niz2);
        java.util.Arrays.sort(niz2);
        prikazi(niz2);

        String[] niz3 = {"ko", "to", "tamo", "peva"};
        prikazi(niz3);
        java.util.Arrays.sort(niz3);
        prikazi(niz3);
    }

    static double[] inicijalizuj() {
        double[] niz2 = new double[100];
        for(int i=0; i<niz2.length; i++)
            niz2[i] = Math.random();
        return niz2;
    }

    static void prikazi(int[] niz) {
        for (int e: niz)
            System.out.printf("%d ", e);
        System.out.println();
    }

    static void prikazi(double[] niz) {
        for (double e: niz)
            System.out.printf("%f ", e);
        System.out.println();
    }

    static void prikazi(String[] niz) {
        for (String e: niz)
            System.out.print(e + " ");
        System.out.println();
    }
}
