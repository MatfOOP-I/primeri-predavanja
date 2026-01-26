package rs.math.oop.g12.p05.enumBrojDanaUMesecu;

public enum MesecKalendarski {
    JANUAR {
        @Override
        public int brojDana(int godina) {
            return 31;
        }
    }, 
    FEBRUAR {
        @Override
        public int brojDana(int godina) {
            if (((godina % 4 == 0 && godina % 100 != 0)
                    || (godina % 400 == 0)) && godina > 1582)
                return 29;
            return 28;
        }
    }, 
    MART {
        @Override
        public int brojDana(int godina) {
            return 31;
        }
    }, 
    APRIL {
        @Override
        public int brojDana(int godina) {
            return 30;
        }
    }, 
    MAJ {
        @Override
        public int brojDana(int godina) {
            return 31;
        }
    }, 
    JUN {
        @Override
        public int brojDana(int godina) {
            return 30;
        }
    }, 
    JUL {
        @Override
        public int brojDana(int godina) {
            return 31;
        }
    }, 
    AVGUST {
        @Override
        public int brojDana(int godina) {
            return 31;
        }
    }, 
    SEPTEMBAR {
        @Override
        public int brojDana(int godina) {
            return 30;
        }
    }, 
    OKTOBAR {
        @Override
        public int brojDana(int godina) {
            return 31;
        }
    }, 
    NOVEMBAR {
        @Override
        public int brojDana(int godina) {
            return 30;
        }
    }, 
    DECEMBAR {
        @Override
        public int brojDana(int godina) {
            return 31;
        }
    };

    public abstract int brojDana(int godina);
}