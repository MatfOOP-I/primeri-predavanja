package rs.math.oop.g08.p15c.kopirajuciKonstruktor;

public class Poligon {
    Tacka[] tacke = new Tacka[10];
    
    public Poligon(Tacka...tacke) {
        if(tacke.length>this.tacke.length) {
            System.err.println("Прослеђени полигон има превише тачака.");
            System.exit(1);
        }
        for(int i=0; i<tacke.length; i++) {
            if (tacke[i] == null)
                break;
            this.tacke[i] = new Tacka(tacke[i]); // елим. реф. зависности
        }
    }
    
    // копирајући конструктор
    public Poligon(Poligon poligon) {
        this(poligon.tacke);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for(Tacka t: tacke) {
            if (t == null)
                break;
            sb.append(t + " "); // имплицитно се позива toString()
        }
        sb.append("]");
        return sb.toString();
    }
}