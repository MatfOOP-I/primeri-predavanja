package rs.math.oop.g03.p03.modularnaParadigma;

class ModulNzdNzsTriBroja {
    // улазна тачка програма
    public static void main(String[] args) {
        // бројеви чији се НЗД и НЗС тражи
        int prviBroj = 48;
        int drugiBroj = 120;
        int treciBroj = 56;
        // приказ бројева чији се НЗД и НЗС тражи
        System.out.println("Први број је " + prviBroj);
        System.out.println("Други број је " + drugiBroj);
        System.out.println("Трећи број је " + treciBroj);
        // одређивање НЗД за ова три броја и приказ резултата
        int nzd = ModulNzd.nzd3(prviBroj, drugiBroj, treciBroj);
        System.out.println("НЗД ова три броја је " + nzd);
        // одређивање НЗС за ова три броја и приказ резултата
        int nzs = ModulNzs.nzs3(prviBroj, drugiBroj, treciBroj);
        System.out.println("НЗС ова три броја је " + nzs);
    }
}
