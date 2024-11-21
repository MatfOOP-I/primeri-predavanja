package rs.math.oop.g08.p13.prevazilazenje.ucenik;

public class Srednjeskolac extends Ucenik{
    String vrstaSkole;

    @Override
    public String toString() {
        return super.toString() + " " + vrstaSkole;
    }

    public static void main(String... args){
        Ucenik u = new Ucenik();
        u.imePrezime = "Marko";
        u.razred = 3;
        Srednjeskolac s = new Srednjeskolac();
        s.imePrezime = "Janko";
        s.razred = 1;
        s.vrstaSkole = "gradj.";
        Ucenik[] svi = {u,s};
        for( Ucenik uc: svi)
            System.out.println(uc);
    }
}

