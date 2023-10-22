package rs.math.oop.g08.p16.kopirajuciKonstruktor;

public class Crtez {
    Poligon[] poligoni;
    int brojPoligona;
    
    public Crtez() {
        poligoni = new Poligon[10];
        brojPoligona = 0;
    }
    
    public Crtez(Crtez crtez) {
        this(); // иницијализујемо празан цртеж најпре
        for(Poligon p: crtez.poligoni)
            if(p==null)
                break;
            else
                dodajPoligon(p); // додајемо исте полигоне прављењем копија
    }
    
    void dodajPoligon(Poligon p) {
        if(brojPoligona>=poligoni.length) {
            System.err.println("Нема више места за нови полигон.");
            System.exit(1);
        }
        poligoni[brojPoligona++]= new Poligon(p); // елиминација реф. зависности
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Poligon p:poligoni)
            if(p==null)
                break;
            else
                sb.append(p+System.lineSeparator());
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Tacka t1 = new Tacka(10, 20);
        Poligon p1 = new Poligon(t1, new Tacka(20, 30), new Tacka(100, 200));
        Poligon p2 = new Poligon(new Tacka(100, 50), t1, new Tacka(50, 50));
        Crtez c1 = new Crtez();
        c1.dodajPoligon(p1);
        c1.dodajPoligon(p2);
        System.out.println("c1 пре измене спољашње тачке.");
        System.out.println(c1);
        t1.x = 2000;
        System.out.println("c1 након измене спољашње тачке.");
        System.out.println(c1);
        Crtez c2 = new Crtez(c1);
        c2.poligoni[0].tacke[0].x = 5000;
        System.out.println("c2 као копија c1 са измењеном унутрашњом тачком.");
        System.out.println(c2);
        System.out.println("c1 након што се c2 изменио.");
        System.out.println(c1);
    }
}