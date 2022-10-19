package rs.math.oop.g03.p03.modularnaParadigma;

class ModulNzdPokretanje {
    // улазна тачка програма
    public static void main(String[] args) {
        // бројеви чији се НЗД тражи
        int prviBroj = 148;
        int drugiBroj = 220;
        int treciBroj = 356;
        // приказ бројева чији се НЗД тражи
        System.out.println("Први број је " + prviBroj);
        System.out.println("Други број је " + drugiBroj);
        System.out.println("Трећи број је " + treciBroj);
        // одређивање НЗД за ова три броја
        int nzd = ModulNzd.nzd3(prviBroj, drugiBroj, treciBroj);
        // приказ резултата
        System.out.println("НЗД ова три броја је " + nzd);
    }
}
