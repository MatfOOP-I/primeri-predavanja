package rs.math.oop.g09.p07.interfejsVise;

public class TeorijskiNaucnik extends Naucnik {
    private String teorijskiDomen;

    public TeorijskiNaucnik(String ime, String domen){
        super(ime);
        teorijskiDomen = domen;
    }

    @Override
    public void definisiHipotezu() {

        System.out.println( "Научник '"+ uzmiIme() + "' дефинише хипотезу у домену '"
                + teorijskiDomen + "'");
    }
}
