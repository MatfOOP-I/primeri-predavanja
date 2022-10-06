package rs.math.oop.g03.p02.strukturnaParadigma;

public class StrukturnoNzd {
    // одређивање НЗД за два броја
    public static int nzd2(int prvi, int drugi) {
        while (true)
            if (prvi > drugi) {
                // први је већи
                if (prvi % drugi == 0)
                    return drugi;
                prvi %= drugi;
            } else {
                // први је мањи или једнак
                if (drugi % prvi == 0)
                    return prvi;
                drugi %= prvi;
            }
    }
    // одређивање НЗД за три броја
    public static int nzd3(int prvi, int drugi, int treci) {
        return nzd2(nzd2(prvi, drugi), treci);
    }
    // улазна тачка програма
    public static void main(String[] args) {
        // бројеви чији се НЗД тражи
        int prviBroj = 48;
        int drugiBroj = 120;
        int treciBroj = 56;
        // приказ бројева чији се НЗД тражи
        System.out.println("Први број је " + prviBroj);
        System.out.println("Други број је " + drugiBroj);
        System.out.println("Трећи број је " + treciBroj);
        // одређивање НЗД за ова три броја
        int nzd = nzd3(prviBroj, drugiBroj, treciBroj);
        // приказ резултата
        System.out.println("НЗД ова три броја је " + nzd);
    }
}
