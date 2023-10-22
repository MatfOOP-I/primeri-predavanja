package rs.math.oop.g09.p19.losPrincipS;

public class LosPrincipS {

    public static void main(String[] args) throws CloneNotSupportedException{
        Zaposleni z = new Zaposleni("Јован", "Петровић", "приправник", 30_000);
        System.out.println("Запослени: " + z);
        z.postaviPlatu(z.uzmiPlatu() * 1.2);
        int uspeh = z.sacuvajBazaPodataka();
        if(uspeh == 0)
            System.out.println("Информације су успешно сачуване у бази података.");
        else
            System.out.println("Информације нису успешно сачуване у бази података.");
    }
}