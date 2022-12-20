package rs.math.oop.g14.p01.kolekcijeRed;

public class PokretanjeRed {
    public static void main(String[] args) {
        Red<Integer> red = new RedPrekoKruznogNiza<>();
        //Red<Integer> red = new RedPrekoPovezaneListe<>();
        red.dodaj(34);
        red.dodaj(23);
        red.dodaj(11);
        System.out.println("Величина: " + red.velicina());
        red.ukloni();
        System.out.println("Величина: " + red.velicina());
        red.dodaj(112);
        System.out.println("Величина: " + red.velicina());
        red.dodaj(-134);
        System.out.println("Величина: " + red.velicina());
        red.dodaj(111);
        System.out.println("Величина: " + red.velicina());
        red.dodaj(345);
        System.out.println("Величина: " + red.velicina());
        red.ukloni();
        red.ukloni();
        red.ukloni();
        red.ukloni();
        red.ukloni();
        red.ukloni();
        red.ukloni();
        System.out.println("Величина: " + red.velicina());
    }
}
