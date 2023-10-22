package rs.math.oop.g03.p03.modularnaParadigma;

class ModulNzs {
    // одређивање НЗС за два броја
    static int nzs2(int prvi, int drugi) {
        return prvi  / ModulNzd.nzd2(prvi, drugi) * drugi;
    }
    // одређивање НЗС за три броја
    static int nzs3(int prvi, int drugi, int treci) {
        return nzs2(nzs2(prvi, drugi), treci);
    }
}