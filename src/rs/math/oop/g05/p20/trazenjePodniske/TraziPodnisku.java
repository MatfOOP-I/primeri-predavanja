package rs.math.oop.g05.p20.trazenjePodniske;

public class TraziPodnisku {

    public static void main(String[] args) {
        String tekst = "Тражимо неку подниску у овој ниски. Максимална позиција за поравнавање ниске под испод";
        java.util.Scanner ulaz = new java.util.Scanner(System.in);
        String podniska = ulaz.next();
        int sirinaProzora = podniska.length();
        int rezultat = -1;
        int brojPomeranjaProzora = tekst.length() - podniska.length();
        test:
        for (int pocetakProzora = 0; pocetakProzora <= brojPomeranjaProzora; pocetakProzora++) {
            int j = pocetakProzora;
            int k = 0;
            while (k<sirinaProzora) {
                if (tekst.charAt(j++) != podniska.charAt(k++)) {
                    continue test;
                }
            }
            rezultat = pocetakProzora;
            break;
        }
        System.out.println((rezultat>=0) ? "Пронађена " + rezultat : "Није пронађена");
    }
}


