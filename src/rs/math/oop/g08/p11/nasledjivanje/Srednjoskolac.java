package rs.math.oop.g08.p11.nasledjivanje;

public class Srednjoskolac extends Ucenik {
    String vrstaSkole;
    
    String uzmiVrstuSkole() {
        return vrstaSkole;
    }
    
    void proveriRazred() {
        if(razred>4 || razred<1)
            System.out.println("Разред "+razred+" није могућ у средњој школи.");
        else
            System.out.println("Разред "+razred+" је у реду.");
    }
    
    public static void main(String[] args) {
        Srednjoskolac sred = new Srednjoskolac();
        sred.imePrezime="Марко Родић";
        sred.razred=2;
        sred.vrstaSkole="Техничка школа";
        sred.prikaziInformacije();
        System.out.println(sred.vrstaSkole);
        System.out.println(sred.uzmiVrstuSkole());
        sred.proveriRazred();
        sred.razred=5;
        sred.proveriRazred();
    }
}