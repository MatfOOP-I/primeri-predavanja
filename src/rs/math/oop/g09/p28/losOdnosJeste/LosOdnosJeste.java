package rs.math.oop.g09.p28.losOdnosJeste;

public class LosOdnosJeste {

    public static void main(String[] argumenti){
        RadnikPrekoStudentskeZadruge mm = new RadnikPrekoStudentskeZadruge("Марко", "Марковић", "sekretar", 1000);
        System.out.println("По креирању радника:");
        System.out.println("Радник: " + mm + " - плата: " + mm.uzmiPlatu());
        mm.povecajSatnicu(10);
        System.out.println("По повећању сатнице за 10%:");
        System.out.println("Радник: " + mm + " - плата: " + mm.uzmiPlatu());
        mm.povecajPlatu(10);
        System.out.println("По повећању плате za 10%:");
        System.out.println("Радник: " + mm + " - плата: " + mm.uzmiPlatu());

    }
}
