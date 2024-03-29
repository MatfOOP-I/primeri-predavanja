package rs.math.oop.g09.p30.dogadjaji;

public class Suncokret implements SunceKretanjeDogadjajOsluskivac {
    @Override
    public void sunceSePomerilo(SunceKretanjeDogadjaj e) {
        if(e.jesteIzaslo())
            System.out.println(e.getSource() + ": Suncokret siri cvetove u " + e.uzmiDatumVreme());
        if(e.jesteZaslo())
            System.out.println(e.getSource() + "Suncokret sakuplja cvetove u " + e.uzmiDatumVreme());

    }

    @Override
    public String toString()
    {
        return "Suncokret";
    }
}
