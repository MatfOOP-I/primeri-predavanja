package rs.math.oop.g09.p20.dobarPrincipS;

public class DobarPrincipS {

    public static void main(String[] args) throws CloneNotSupportedException{
        Zaposleni z = new Zaposleni("Јован", "Петровић", "приправник", 30_000);
        System.out.println("Запослени: " + z);
        z.postaviPlatu(z.uzmiPlatu() * 1.2);
        int uspeh = ZaposleniBazaPodataka.sacuvaj(z);
        if(uspeh == 0)
            System.out.println("Информације су успешно сачуване у бази података.");
        else
            System.out.println("Информације нису успешно сачуване у бази података.");
    }
}