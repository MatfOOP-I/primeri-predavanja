package rs.math.oop.g09.p15.viseKriterijumaPredefinisani;

import java.util.Comparator;

public class BrojSamoglasnikaComparator implements Comparator {
	
	private int brojSamoglasnika(String s) {
		int ret = 0;
		for (char ch : s.toCharArray())
			if ("aeiouAEIOUаеиоуАЕИОУ".indexOf(ch) >= 0)
				ret++;
		return ret;
	}

	@Override
	public int compare(Object o1, Object o2) {
		if (!(o1 instanceof String))
			return 1;
		if (!(o2 instanceof String))
			return -1;
		String s1 = (String) o1;
		String s2 = (String) o2;
		int razlika = brojSamoglasnika(s2) - brojSamoglasnika(s1);
		if (razlika != 0)
			return razlika;
		razlika = s1.length() - s2.length();
		if (razlika != 0)
			return razlika;
		return s1.compareTo(s2);
	}
}
