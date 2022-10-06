package rs.math.oop.g02.p04.objektnoNzdNzs;

class ObjektnoNzdNzsPokretanje {
    // улазна тачка програма
    public static void main(String[] args) {
        // бројеви чији се НЗД тражи
        CeoBroj prvi = new CeoBroj(48);
        CeoBroj drugi = new CeoBroj(120);
        CeoBroj treci = new CeoBroj(56);
        // приказ бројева чији се НЗД и НЗС тражи
        System.out.print("Први број је ");
        prvi.prikazi();
        System.out.print("Други број је ");
        drugi.prikazi();
        System.out.print("Трећи број је ");
        treci.prikazi();
        // одређивање НЗД за ова три броја
        CeoBroj nzd = prvi.NZD(drugi).NZD(treci);
        // одређивање НЗС за ова три броја
        CeoBroj nzs = prvi.NZS(drugi).NZS(treci);
        // приказ резултата
        System.out.print("НЗД ова три броја је ");
        nzd.prikazi();
        System.out.print("НЗС ова три броја је ");
        nzs.prikazi();
    }
}
