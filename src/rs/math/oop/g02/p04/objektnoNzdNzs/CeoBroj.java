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
        while (prvaVrednost != drugaVrednost) {
            if(prvaVrednost > drugaVrednost)
                prvaVrednost -= drugaVrednost;
            else
                drugaVrednost -= prvaVrednost;
        }
        return new CeoBroj(prvaVrednost);
    }
    // одређивање НЗС датог броја и другог целог броја
    CeoBroj NZS(CeoBroj drugi) {
        CeoBroj nzd = this.NZD(drugi);
        int nzs = vrednost / nzd.vrednost * drugi.vrednost;
        return new CeoBroj(nzs);
    }
}
