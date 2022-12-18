package rs.math.oop.g13.p06.genericiMinimalniElementNiza;


public class PokretnanjeMinimumi {
    public static void main(String[] args) {
        String[] stringovi = new String[] {"Паја", "Ана", "Мика",
                "Марија", "Александар"};
        NizPomoc.prikazNaKonzoli(stringovi);
        try {
            String minString = NizPomoc.odrediMinimum(stringovi);
            System.out.println(minString);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        // не може се користити оператор new за креирање низа генеричких типова
        // па вршимо експлицитну конверзију и наговештавамо компајлеру
        // да не треба да исписује упозорење због тога
        @SuppressWarnings("unchecked")
        UredjeniParUporediv<Integer, Integer>[] parovi =
            (UredjeniParUporediv<Integer, Integer>[]) new UredjeniParUporediv[]
            {
                new UredjeniParUporediv<Integer, Integer>(46, 21),
                new UredjeniParUporediv<Integer, Integer>(10, 21),
                new UredjeniParUporediv<Integer, Integer>(10, 19),
                new UredjeniParUporediv<Integer, Integer>(15, 21),
            };
        NizPomoc.prikazNaKonzoli(parovi);
        try {
            UredjeniParUporediv<Integer, Integer> minPar =
                    NizPomoc.odrediMinimum(parovi);
            System.out.println(minPar);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
