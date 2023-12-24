package rs.math.oop.g09.p30.dogadjaji;

public class NocnaFrajla implements SunceKretanjeDogadjajOsluskivac {
    @Override
    public void sunceSePomerilo(SunceKretanjeDogadjaj e) {
        if(e.jesteZaslo())
            System.out.println(e.getSource() + ": Nocna Frajla siri cvetove u " + e.uzmiDatumVreme());
        if(e.jesteIzaslo())
            System.out.println(e.getSource() + ": Nocna Frajla sakuplja cvetove u " + e.uzmiDatumVreme());

    }

    @Override
    public String toString()
    {
        return "Cvet Nocna Frajla";
    }
}
