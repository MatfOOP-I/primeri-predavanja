package rs.math.oop.g09.p28.losOdnosJeste;

public class RadnikPrekoStudentskeZadruge extends  Zaposleni{
    private double satnica;

    public RadnikPrekoStudentskeZadruge(String ime, String prezime, String opisPosla, double satnica) {
        super(ime, prezime, opisPosla, -1);
        this.satnica = satnica;
    }

    public RadnikPrekoStudentskeZadruge(){
        this("","", "", 0);
    }

    public double uzmiSatnicu(){
        return satnica;
    }

    public void postaviSatnicu(double satnica) {
        this.satnica = satnica;
    }
    public void povecajSatnicu(double zaProcenat) {
        double iznosPovisice = satnica * zaProcenat / 100;
        this.satnica += iznosPovisice;
    }

    @Override
    public String toString() {
        return "[име: " + uzmiIme() + " " + uzmiPrezime()
                + ", посао: '" + uzmiOpisPosla()
                + "', сатница: " + satnica + "]";
    }
}
