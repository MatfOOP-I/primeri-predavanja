package rs.math.oop.g09.p09.interfejsGeometrija;

public class Mere {

    public static void main(String[] args) {
        Tacka a = new Tacka("A", 14.5, 15);
        Tacka b = new Tacka("B", 10, 11.5);
        Tacka c = new Tacka("C", 10.45, 22);
        Tacka d = new Tacka("D", 22.3, 17.5);
        Tacka e = new Tacka("E", 25, 25.5);
        Mera[] elementi = {new Trougao("тBCD", b, c, d),
                new Cetvorougao("чBCDE", b, c, d, e),
                new Krug("кB18", b, 18),
                new Trougao("тCDE", c, d, e),
                new MikiMaus()
        };
        double ukupPovrs = 0;
        for (Mera el : elementi)
            ukupPovrs += el.povrsina();
        System.out.println(ukupPovrs);
    }

}
