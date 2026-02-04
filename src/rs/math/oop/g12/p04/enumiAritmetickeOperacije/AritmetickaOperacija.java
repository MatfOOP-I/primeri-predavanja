package rs.math.oop.g12.p04.enumiAritmetickeOperacije;

public enum AritmetickaOperacija {
    PLUS("+") {
        public double izracunaj(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        public double izracunaj(double x, double y) {
            return x - y;
        }
    },
    PUTA("*") {
        public double izracunaj(double x, double y) {
            return x * y;
        }
    },
    PODELJENO("/") {
        public double izracunaj(double x, double y) {
            return x / y;
        }
    };

    private final String oznaka;

    AritmetickaOperacija(String oznaka) {
        this.oznaka = oznaka;
    }

    @Override
    public String toString() {
        return oznaka;
    }

    /* апстрактна метода коју свака конкретна набројива вредност 
     мора да реализује одмах при декларацији (слично анонимним класама) */
    public abstract double izracunaj(double x, double y);

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        String op = args[2];
        AritmetickaOperacija operacija = AritmetickaOperacija.valueOf(op);
        System.out.printf("%f %s %f = %f%n", x, operacija, y,
                          operacija.izracunaj(x, y));
        // for (AritmetickaOperacija op : AritmetickaOperacija.values())
        //     System.out.printf("%f %s %f = %f%n", x, op, y, 
        //                  op.izracunaj(x, y));
    }
}