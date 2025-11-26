package rs.math.oop.g02.p04.objektnoNzdNzs;

class NzdNzsObjektno {
    // улазна тачка програма
    public static void main(String[] args) {
        // бројеви чији се НЗД тражи
        CeoBroj prvi = new CeoBroj(48);
        CeoBroj drugi = new CeoBroj(120);
        CeoBroj treci = new CeoBroj(56);
        CeoBroj cetvrti = new CeoBroj(480);
        // приказ бројева чији се НЗД и НЗС тражи
        System.out.print("Први број је ");
        prvi.prikazi();
        System.out.print("Други број је ");
        drugi.prikazi();
        System.out.print("Трећи број је ");
        treci.prikazi();
        System.out.print("Четврти број је ");
        cetvrti.prikazi();
        // одређивање НЗД за ова четири броја
        CeoBroj nzd = prvi.NZD(drugi).NZD(treci).NZD(cetvrti);
        // одређивање НЗС за ова четири броја
        CeoBroj nzs = prvi.NZS(drugi).NZS(treci).NZS(cetvrti);
        // приказ резултата 
        System.out.print("НЗД ова четири броја је ");
        nzd.prikazi();
        System.out.print("НЗС ова четири броја је ");
        nzs.prikazi();
    }
}
