package rs.math.oop.g09.p19.dobarPrincipS;

public class ZaposleniBazaPodataka {

    public static int ucitaj(Zaposleni z){
        System.out.println("Реализује учитавање информација о примерку класе '"
                + z.getClass().getSimpleName() + "' у бази података.");
        // овде треба да буду наредбе за читање информација о објекту из базе
        return 0;
    }

    public static int sacuvaj(Zaposleni z){
        System.out.println("Реализује чување информација о примерку класе '"
                + z.getClass().getSimpleName() + "' у бази података.");
        System.out.println("Чувају се следећи подаци: " + z);
        // овде треба да буду наредбе за упис информација о објекту у базу
        return 0;
    }
}
