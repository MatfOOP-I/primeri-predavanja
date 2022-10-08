package rs.math.oop.g13.p04.generickiStek;

public class StekPrekoNiza<T> implements StekInterfejs<T> {
    private T[] stekNiz;
    private int stekIndeks; // показује на врх стека
    private int kapacitet;

    public StekPrekoNiza() {
        kapacitet = 5;
        stekIndeks = -1;
        stekNiz = alocirajStekNiz();
    }

    /*
     * ова наредба (тзв. анотација) елиминише упозорење компајлера због експлицитне
     * конверзије низа објеката у низ Т елемената
     */
    @SuppressWarnings("unchecked")
    private T[] alocirajStekNiz() {
        System.out.println("Повећавам капацитет стека на "+kapacitet);
        /*
         * будући да ће сва интеракција између низа T[] и "остатка света" 
         * ићи преко метода dodaj и ukloni који гарантују поштовање 
         * генеричког типа овде свесно вршимо експлицитну конверзију 
         * јер креирање низа генеричких типова није подржано
         */
        return (T[]) new Object[kapacitet];
    }

    @Override
    public boolean jePrazan() {
        return stekIndeks == -1;
    }

    @Override
    public int velicina() {
        return stekIndeks + 1;
    }

    @Override
    public void dodaj(T element) {
        System.out.println("Додајем "+element);
        if (stekIndeks + 1 == kapacitet) {
            // нема више места па дуплирамо капацитет
            kapacitet *= 2;
            T[] noviStekNiz = alocirajStekNiz();
            // преписујемо податке у новокреирани стек низ
            for (int i = 0; i <= stekIndeks; i++)
                noviStekNiz[i] = stekNiz[i];
            stekNiz = noviStekNiz;
        }
        stekNiz[++stekIndeks] = element;
    }


       @Override
    public T vrh() {
        if(!jePrazan())
            return stekNiz[stekIndeks];
        else {
            // овде ћемо уместо изузетка вратити null, 
            // али има смисла и да се избаци изузетак
            System.out.println("Стек је празан па нема смисла гледање врха.");
            return null;
        }
    }

    @Override
    public void ukloni() {
        if(!jePrazan()) {
            System.out.println("Уклањам "+stekNiz[stekIndeks]);
            // бришемо референцу да би GC могао да почисти меморију
            stekNiz[stekIndeks]=null;
            stekIndeks--;
        }else {
            // овде нећемо ништа урадити, 
            // али има смисла и да се избаци изузетак
            System.out.println("Стек је празан па нема смисла уклањање.");
        }
    }

    public static void main(String[] args) {
        StekPrekoNiza<Integer> stek = new StekPrekoNiza<>();
        System.out.println("Врх: "+stek.vrh());
        stek.dodaj(34);
        stek.dodaj(23);
        stek.dodaj(11);
        System.out.println("Врх: "+stek.vrh());
        stek.ukloni();
        System.out.println("Врх: "+stek.vrh());
        stek.dodaj(112);
        stek.dodaj(-134);
        stek.dodaj(111);
        stek.dodaj(345);
        System.out.println("Величина: "+stek.velicina());
        stek.ukloni();
        stek.ukloni();
        stek.ukloni();
        stek.ukloni();
        stek.ukloni();
        stek.ukloni();
        stek.ukloni();
    }
}

