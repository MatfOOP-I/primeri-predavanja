package rs.math.oop.g12.p06.enumiImplementacija;

public class Pokretanje {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        for (AditivnaOperacija op : AditivnaOperacija.values())
            System.out.printf("%f %s %f = %f%n", x, op, y,
                    op.izracunaj(x, y));
    }


}
