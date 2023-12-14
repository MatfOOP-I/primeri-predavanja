package rs.math.oop.g09.p30a.dogadjaji;

public class Suncokret implements SunceKretanjeDogadjajOsluskivac {
    @Override
    public void sunceSePomerilo(SunceKretanjeDogadjaj e) {
        if(e.jesteIzaslo())
            System.out.println("Suncokret siri cvetove u " + e.uzmiDatumVreme());
        if(e.jesteZaslo())
            System.out.println("Suncokret sakuplja cvetove u " + e.uzmiDatumVreme());

    }

    @Override
    public String toString()
    {
        return "Suncokret";
    }
}
