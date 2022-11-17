package rs.math.oop.g08.p05.poredjenjeOperatoromJednako;

public class UporediPromenljive {

    public static void main(String[] args) {

        Kutija kutija1 = new Kutija();
        kutija1.dubina = 10;
        kutija1.sirina = 2;
        kutija1.visina = 4;
        Kutija kutija2 = new Kutija();
        kutija2.dubina = 10;
        kutija2.sirina = 2;
        kutija2.visina = 4;
        System.out.println(kutija1 == kutija2);
        System.out.println(kutija1.equals(kutija2));
        System.out.println(kutija2.equals(kutija1));
    }
}
