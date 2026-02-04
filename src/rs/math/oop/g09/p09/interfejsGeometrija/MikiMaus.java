package rs.math.oop.g09.p09.interfejsGeometrija;

public class MikiMaus extends GeometrijskiObjekat implements Mera{

    public MikiMaus() {
        super("Мики Маус");
    }   

    @Override
    public double obim() {
        return 42;
    }

    @Override
    public double povrsina() {
        return 42;
    }

    @Override
    public String toString() {
        return uzmiOznaku();
    }
}
