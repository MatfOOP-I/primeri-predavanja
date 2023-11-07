package rs.math.oop.g08.poredjenjeOperatoromJednako;

public class UporediPromenljive {

    public static void main(String[] args) {
        int x = 123, y = 123;
        System.out.println(x == y);

        Kutija kutija1 = new Kutija();
        kutija1.dubina = 10;
        kutija1.sirina = 2;
        kutija1.visina = 4;
        Kutija kutija2 = new Kutija();
        kutija2.dubina = 10;
        kutija2.sirina = 2;
        kutija2.visina = 4;
        System.out.println(kutija1 == kutija2);
    }
}
