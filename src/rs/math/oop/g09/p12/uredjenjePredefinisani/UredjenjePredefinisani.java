package rs.math.oop.g09.p12.uredjenjePredefinisani;

import java.util.Arrays;

public class UredjenjePredefinisani {

    private static void prikaziCele(int[] celi) {
        for (int x : celi)
            System.out.printf("%d ", x);
        System.out.println();
    }

    private static void prikaziRealne(double[] realni) {
        for (double x : realni)
            System.out.printf("%f ", x);
        System.out.println();
    }

    private static void prikaziNiske(String[] niske) {
        for (String x : niske)
            System.out.printf("%s ", x);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] celi = {12, 4, -3, 0, 17, 5};
        System.out.println("Пре сортирања");
        prikaziCele(celi);
        Arrays.sort(celi);
        System.out.println("Пoсле сортирања");
        prikaziCele(celi);

        double[] realni = {12.5, 4.7, -3.2e1, 0, +1.7e-1, 5};
        System.out.println("Пре сортирања");
        prikaziRealne(realni);
        Arrays.sort(realni);
        System.out.println("Пoсле сортирања");
        prikaziRealne(realni);

        String[] niske = {"12.5", "мики", "-3.2e1", "0", "+1.7e-1", "5", "паја"};
        System.out.println("Пре сортирања");
        prikaziNiske(niske);
        Arrays.sort(niske);
        System.out.println("Пoсле сортирања");
        prikaziNiske(niske);
    }
}
