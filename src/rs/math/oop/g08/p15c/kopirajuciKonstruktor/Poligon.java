package rs.math.oop.g08.p15c.kopirajuciKonstruktor;

public class Poligon {
    Tacka[] tacke = new Tacka[10];
    
    public Poligon(Tacka...tacke) {
        if(tacke.length>this.tacke.length) {
            System.err.println("Полигон има више од 10 тачака.");
            System.exit(1);
        }
        for(int i=0; i<tacke.length; i++)
            if(tacke[i]==null)
                break;
            else
                this.tacke[i]=new Tacka(tacke[i]); // елим. реф. зависности
    }
    
    // копирајући конструктор
    public Poligon(Poligon poligon) {
        this(poligon.tacke);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for(Tacka t: tacke)
            if(t==null)
                break;
            else
                sb.append(t+" "); // имплицитно се позива toString()
        sb.append("]");
        return sb.toString();
    }
}