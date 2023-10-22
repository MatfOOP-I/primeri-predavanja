package rs.math.oop.g09.p07.interfejsVise;


public class PitanjaRazmisljanja {

    public static void main(String[] arg)
    {
        Naucnik n = new Naucnik("Марковић");

        Radoznao rd = n;
        rd.prikaziUpit();
        System.out.println(rd.tekstUpita());

        Razuman rz = n;
        rz.razmotriCinjenice();
        rz.definisiHipotezu();
    }
}
