package rs.math.oop.g13.p07.genericiUredjeniParUporedivNegenericki;

public class MinimalniElementNizaNegenericki {
    
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
        UredjeniParUporedivNegenericki[] parovi =new UredjeniParUporedivNegenericki[] 
            {
                new UredjeniParUporedivNegenericki(46, 21),
                new UredjeniParUporedivNegenericki(10, 21),
                new UredjeniParUporedivNegenericki(10, 19),
                new UredjeniParUporedivNegenericki(15, 21),
            };
        try {
            UredjeniParUporedivNegenericki minPar = 
                    (UredjeniParUporedivNegenericki) nadjiMinimum(parovi);
            System.out.println(minPar);
        } catch (Exception e) {
        	System.err.println(e.getMessage());
        }
    }
}