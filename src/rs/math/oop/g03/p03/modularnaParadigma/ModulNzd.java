package rs.math.oop.g03.p03.modularnaParadigma;

class ModulNzd {
    // одређивање НЗД за два броја
    static int nzd2(int prvi, int drugi) {
        while (drugi > 0) {
        	int ostatak = prvi % drugi;
        	prvi = drugi;
        	drugi = ostatak;
        }
        return prvi;
    }    
    // одређивање НЗД за три броја
    static int nzd3(int prvi, int drugi, int treci) {
        return nzd2(nzd2(prvi, drugi), treci);
    }
}
