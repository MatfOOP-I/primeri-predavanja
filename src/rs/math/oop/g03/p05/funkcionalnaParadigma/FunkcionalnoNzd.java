package rs.math.oop.g03.p05.funkcionalnaParadigma;

class FunkcionalnoNzd {
    // одређивање НЗД за два броја
    static java.util.function.BiFunction<Integer, Integer, Integer> nzd2;
    static {
        nzd2 = (prvi, drugi) -> (prvi.compareTo(drugi) == 0)
                ? prvi
                : ( (prvi.compareTo(drugi) < 0) 
                        ? nzd2.apply(drugi - prvi, prvi)
                        : nzd2.apply(prvi - drugi, drugi) );
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
        int nzd = nzd2.apply(nzd2.apply( prviBroj, drugiBroj), treciBroj);
        // приказ резултата
        System.out.println("НЗД ова три броја је " + nzd);
    }
}