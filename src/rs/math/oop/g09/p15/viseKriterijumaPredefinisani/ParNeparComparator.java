package rs.math.oop.g09.p15.viseKriterijumaPredefinisani;

import java.util.Comparator;

class ParNeparComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (!(o1 instanceof Integer))
            return 1;
        if (!(o2 instanceof Integer))
            return -1;
        int i1 = ((Integer) o1).intValue();
        int i2 = (Integer) o2;
        if (i1 % 2 == 0) {
            if (i2 % 2 == 0)
                return i1 - i2;
            else
                return -1;
        } else {
            if (i2 % 2 == 0)
                return 1;
            else
                return i2 - i1;
        }
    }

}
