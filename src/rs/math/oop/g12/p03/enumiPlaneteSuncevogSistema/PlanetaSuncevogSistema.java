package rs.math.oop.g12.p03.enumiPlaneteSuncevogSistema;

public enum PlanetaSuncevogSistema {
    MERKUR (3.303e+23, 2.4397e6),
    VENERA   (4.869e+24, 6.0518e6),
    ZEMLJA   (5.976e+24, 6.37814e6),
    MARS    (6.421e+23, 3.3972e6),
    JUPITER (1.9e+27,   7.1492e7),
    SATURN  (5.688e+26, 6.0268e7),
    URAN  (8.686e+25, 2.5559e7),
    NEPTUN (1.024e+26, 2.4746e7);

    private final double masa;   // kg
    private final double precnik; // m
    
    PlanetaSuncevogSistema(double masa, double precnik) {
        this.masa = masa;
        this.precnik = precnik;
    }
    
    double masa() { return masa; }
    double precnik() { return precnik; }

    // универзална гравитациона константа (m3 kg-1 s-2)
    public static final double G = 6.67300E-11;

    double gravitacijaNaPovrsini() {
        return G * masa / (precnik * precnik);
    }
    
    double tezinaTelaNaPovrsini(double masaTela) {
        return masaTela * gravitacijaNaPovrsini();
    }
    
    @Override
    public String toString() {
        return String.format("%d %s %g %g",ordinal(), name(), masa, precnik);
    }
    
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Употреба: java <маса тела (kg)>");
            System.exit(-1);
        }
        double masaTela = Double.parseDouble(args[0]);
        // метода values() враћа списак свих вредности за дати набројиви тип
        System.out.println(
              "Карактеристике планета: редни број, име, маса и пречник:");
        for (PlanetaSuncevogSistema p : PlanetaSuncevogSistema.values())
            System.out.println(p);
        System.out.printf(System.lineSeparator()
                +"Тежина тела масе %.2f на различитим планетама су%n",masaTela);
        for (PlanetaSuncevogSistema p : PlanetaSuncevogSistema.values())
           System.out.printf("%s %.2f N%n",
                             p.name(), p.tezinaTelaNaPovrsini(masaTela));
    }
}