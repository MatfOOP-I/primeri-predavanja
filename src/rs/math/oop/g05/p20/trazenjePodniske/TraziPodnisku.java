package rs.math.oop.g05.p20.trazenjePodniske;

public class TraziPodnisku {

    public static void main(String[] args) {
        String tekst = "Тражимо неку подниску у овој ниски. Максимална позиција за поравнавање ниске под испод";
        java.util.Scanner ulaz = new java.util.Scanner(System.in);
        String podniska = ulaz.next();
        int pozicija = -1;
        // максимална позиција за поравнавање подниске  испод
        // веће подниске "Тражимо некз подниску у овој ниски."
        int maks = tekst.length() - podniska.length();
        test:
        for (int i = 0; i <= maks; i++) {
            /* померамо позицију, нпр. у нултој итерацији је положај
              "Тражимо неку подониску у овој ниски."
              "под"
               у петој итерацији је
              "Тражимо неку подниску у овој ниски."
                   "под"
              итд.
             */
            int n = podniska.length();
            int j = i;
            int k = 0;
            // угњеждена петља проверава да ли с поравната "мала" ниска
            // поклапа са овом "већом" на свим позицијама (словима)
            while (n-- != 0) {
                if (tekst.charAt(j++) != podniska.charAt(k++)) {
                    // чим наиђемо на прво поклапање, 
                	// нема даље смисла гледати
                    // па прелазимо у наредну итерацију спољнег циклуса
                    continue test;
                }
            }
            // чим је пронађено прво поклапање, задовољни смо
            // те излазимо из спољнег циклуса
            // овде није било неопходно break test,
            // јер се овај break већ имплицитно односи на спољни циклус
            pozicija = i;
            break test;
        }
        System.out.println((pozicija>=0) ? "Пронађена " + pozicija : "Није пронађена");
    }
}


