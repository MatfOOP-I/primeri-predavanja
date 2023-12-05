package rs.math.oop.g09.p06.interfejsImplementacija;


public class Pitanja {

    public static void main(String[] arg)
    {
        Strucnjak p1 = new Strucnjak();
        p1.prikaziUpit();
        System.out.println(p1.tekstUpita());
        System.out.println(p1.prikaziUpit2());

        Radoznao p2 = p1;
        p2.prikaziUpit();
        System.out.println(p2.tekstUpita());
    }
}
