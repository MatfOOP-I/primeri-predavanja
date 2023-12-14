package rs.math.oop.g12.p03.enumiPlaneteSuncevogSistema;

public class TestirajPlanete {
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
