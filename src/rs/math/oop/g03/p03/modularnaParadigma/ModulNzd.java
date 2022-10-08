package rs.math.oop.g03.p03.modularnaParadigma;

class ModulNzd {
    // одређивање НЗД за два броја
    static int nzd2(int prvi, int drugi) {
        while (true)
            if (prvi > drugi) {
                // први је већи
                if (prvi % drugi == 0)
                    return drugi;
                prvi %= drugi;
            } else {
                // први је мањи или једнак
                if (drugi % prvi == 0)
                    return prvi;
                drugi %= prvi;
            }
    }    
    // одређивање НЗД за три броја
    static int nzd3(int prvi, int drugi, int treci) {
        return nzd2(nzd2(prvi, drugi), treci);
    }
}
