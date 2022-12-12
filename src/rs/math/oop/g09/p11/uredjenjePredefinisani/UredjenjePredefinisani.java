package rs.math.oop.g09.p11.uredjenjePredefinisani;

import java.util.Arrays;

public class UredjenjePredefinisani {

    private static void prikazi(int[] niz) {
        for (int x : niz)
            System.out.print(x + " ");
        System.out.println();
    }

    private static void prikazi(double[] niz) {
        for (double x : niz)
            System.out.print(x + " ");
        System.out.println();
    }

    private static void prikazi(String[] niz) {
        for (String x : niz)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] celi = {12, 4, -3, 0, 17, 5};
        System.out.println("Пре сортирања");
        prikazi(celi);
        Arrays.sort(celi);
        System.out.println("Пoсле сортирања");
        prikazi(celi);

        double[] realni = {12.5, 4.7, -3.2e1, 0, +1.7e-1, 5};
        System.out.println("Пре сортирања");
        prikazi(realni);
        Arrays.sort(realni);
        System.out.println("Пoсле сортирања");
        prikazi(realni);

        String[] niske = {"12.5", "мики", "-3.2e1", "0", "+1.7e-1", "5", "паја"};
        System.out.println("Пре сортирања");
        prikazi(niske);
        Arrays.sort(niske);
        System.out.println("Пoсле сортирања");
        prikazi(niske);
    }
}
