package rs.math.oop.g08.p15c.kopirajuciKonstruktor;

public class Tacka {
    int x;
    int y;
    
    public Tacka(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // копирајући конструктор
    public Tacka(Tacka t) {
        this.x = t.x;
        this.y = t.y;
    }
    
    @Override
    public String toString() {
        return "("+x+", "+y+")";
    }
}