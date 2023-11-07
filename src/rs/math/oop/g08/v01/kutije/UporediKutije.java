package rs.math.oop.g08.v01.kutije;

public class UporediKutije {

    public static void main(String[] args) {
        Object o = new ObojenaKutija();
        ObojenaKutija ok = (ObojenaKutija) o; // ово је у реду
        Object o2 = new Kutija();
        ObojenaKutija ok2 = (ObojenaKutija) o2; // грешка приликом извршавања
        //Integer i1 = (Integer) ok2;
        Object o3 = new ObojenaKutija();
        Kutija k = (Kutija) o3; // ово је у реду
    }
}
