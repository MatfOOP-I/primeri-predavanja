package rs.math.oop.g08.p05b.kutije;

public class UporediObojeneKutije {

    private static void ispitajInformisi(Object o) {
        if(o instanceof Kutija)
            System.out.println(o + " je kutija");
        else
            System.out.println(o +" nije kutija");
        if(o instanceof ObojenaKutija)
            System.out.println(o + " je obojena kutija");
        else
            System.out.println(o + " nije obojena kutija");
    }

    public static void main(String[] args) {
 
        Object o = new ObojenaKutija();
        ispitajInformisi(o);
        //int ii = o.sirina;
        ObojenaKutija ok = (ObojenaKutija) o; // ово је у реду
        ispitajInformisi(ok);
        int i = ok.sirina;
        String s = ok.boja;

        Object o2 = new Kutija();
        ispitajInformisi(o2);
        Kutija k2 = (Kutija) o2;
        ispitajInformisi(k2);
        ObojenaKutija ok2 = (ObojenaKutija) o2; // грешка приликом извршавања 
        ok2.boja = "црвена"; 

        //Kutija k3 = (Kutija) "miki maus";
        ispitajInformisi("miki maus");
    }

}
