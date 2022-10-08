package rs.math.oop.g13.p07.genericiUredjeniParUporedivSirov;

public class MinimalniElementNizaSirov {
    
    public static Comparable nadjiMinimum(Comparable[] niz) throws Exception{
        if(niz.length==0)
            throw new Exception("Низ је празан - минимум нема смисла.");
        Comparable minimum = niz[0];
        for(Comparable element: niz)
            if(element.compareTo(minimum)<0)
                minimum = element;
        return minimum;
    }
    
    public static void main(String[] args) {
        UredjeniParUporedivSirov[] parovi =new UredjeniParUporedivSirov[] 
            {
                new UredjeniParUporedivSirov(46, 21),
                new UredjeniParUporedivSirov(10, 21),
                new UredjeniParUporedivSirov(10, 19),
                new UredjeniParUporedivSirov(15, 21),
            };
        try {
            UredjeniParUporedivSirov minPar = 
                    (UredjeniParUporedivSirov) nadjiMinimum(parovi);
            System.out.println(minPar);
        } catch (Exception e) {
        	System.err.println(e.getMessage());
        }
    }
}