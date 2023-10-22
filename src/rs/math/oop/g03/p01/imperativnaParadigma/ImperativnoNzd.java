package rs.math.oop.g03.p01.imperativnaParadigma;

class ImperativnoNzd {
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
        // одређивање НЗД за први и други број
        while (drugiBroj > 0) {
        	int ostatak = prviBroj % drugiBroj;
        	prviBroj = drugiBroj;
        	drugiBroj = ostatak;
        }
        // одређивање НЗД за НЗД прва два броја и трећи број
        while (treciBroj > 0) {
        	int ostatak = prviBroj % treciBroj;
        	prviBroj = treciBroj;
        	treciBroj = ostatak;
        }
        // приказ резултата
        System.out.println("НЗД ова три броја је " + prviBroj);
    }
}
