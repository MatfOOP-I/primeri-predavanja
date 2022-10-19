package rs.math.oop.g02.p04.objektnoNzdNzs;

class CeoBroj {
    // вредноcт датог целог броја
    int vrednost;

    // конcтруктор
    CeoBroj(int vrednostBroja) {
        vrednost = vrednostBroja;
    }

    // метод за приказ целог броја
    void prikazi() {
        System.out.print(vrednost);
        System.out.println();
    }
    // одређивање НЗД датог броја и другог целог броја
    CeoBroj NZD(CeoBroj drugi) {
        int prvaVrednost = vrednost;
        int drugaVrednost = drugi.vrednost;
        while (true)
            if (prvaVrednost > drugaVrednost) {
                // први је већи
                if (prvaVrednost % drugaVrednost == 0)
                    return new CeoBroj(drugaVrednost);
                prvaVrednost %= drugaVrednost;
            } else {
                // први је мањи или једнак
                if (drugaVrednost % prvaVrednost == 0)
                    return new CeoBroj(prvaVrednost);
                drugaVrednost %= prvaVrednost;
            }
    }

    // одређивање НЗС датог броја и другог целог броја
    CeoBroj NZS(CeoBroj drugi) {
        CeoBroj nzd = NZD(drugi);
        int nzs = (vrednost * drugi.vrednost) / nzd.vrednost;
        return new CeoBroj(nzs);
    }
}
