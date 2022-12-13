package rs.math.oop.g12.p06.enumiImplementacija;

public enum AditivnaOperacija implements Nesto {
    PLUS("+") {
        public double izracunaj(double x, double y) {
            return x + y;
        }

        @Override
        public void nekiMetod() {
            // druga implementacija
        }
    },
    MINUS("-") {
        public double izracunaj(double x, double y) {
            return x - y;
        }
    };

    private final String oznaka;

    AditivnaOperacija(String oznaka) {
        this.oznaka = oznaka;
    }

    @Override
    public String toString() {
        return oznaka;
    }

    /* апстрактна метода коју свака конкретна набројива вредност 
     мора да реализује одмах при декларацији (слично анонимним класама) */
    public abstract double izracunaj(double x, double y);

    @Override
    public void nekiMetod() {
        // prva implementacija
    }
}