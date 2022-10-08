package rs.math.oop.g13.p06.genericiMinimalniElementNiza;

public class MinimalniElementNiza {

    public static <T extends Comparable<T>> T nadjiMinimum(T[] niz) 
    		throws Exception{
        if(niz.length==0)
            throw new Exception("Низ је празан - минимум нема смисла.");
        T minimum = niz[0];
        for(T element: niz)
            if(element.compareTo(minimum)<0)
                minimum = element;
        return minimum;
    }
    
    public static void main(String[] args) {
        String[] stringovi = new String[] {"Паја", "Ана", "Мика", 
                "Марија", "Пера"};
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
        // уређени пар чија координата није упоредива
        // се не може креирати због ограничења на тип по обе координате 
        // у дефиницији упоредивог уређеног пара
        // UredjeniParUporediv<Color, Integer> par; // не компајлира се
        try {
            String minString = nadjiMinimum(stringovi);
            System.out.println(minString);
            UredjeniParUporediv<Integer, Integer> minPar = 
                    nadjiMinimum(parovi);
            System.out.println(minPar);
        } catch (Exception e) {
        	System.err.println(e.getMessage());
        }
    }

}