package rs.math.oop.g06.p12b.grafickiPrikazMeseca;

public class PrikaziMesec {

    public static void main(String[] args) {
        java.util.Scanner skener = new java.util.Scanner(System.in);
        System.out.println("Унесите годину ");
        int godina = skener.nextInt();
        System.out.println("Унесите редни број месеца");
        int mesec = skener.nextInt();
        if (mesec < 1 || mesec > 12) {
            System.err.println("Редни број месеца је између 1 и 12.");
            System.exit(1);
        }
        // заглавље
        System.out.println("Пон.\tУто.\tСре.\tЧет.\tПет.\tСуб.\tНед.");
        java.time.LocalDate dan = java.time.LocalDate.of(godina, mesec, 1);
        // испис иницијалних празнина зато што не мора бити понедељак
        // getDayOfWeek() враћа објекат који представља дан у недељи
        // а getValue() само његов редни број 1-7
        int danUNedeljiRbr = dan.getDayOfWeek().getValue();
        for (int i = 1; i < danUNedeljiRbr; i++)
            System.out.print("\t\t");
        // главна петља
        do {
            System.out.print(dan.getDayOfMonth() + "\t\t");
            // прелазимо на наредни дан
            dan = dan.plusDays(1);
            danUNedeljiRbr = dan.getDayOfWeek().getValue();
            if (danUNedeljiRbr == 1) // идемо у наредни ред
                System.out.println();
        } while (dan.getDayOfMonth() != 1);
        skener.close();
    }
}
