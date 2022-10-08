package rs.math.oop.g14.p09.povezaniHesSkup;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RadSaPovezanimHesSkupom {

	public static void main(String[] args) {
		String[] elementi = new String[]{
				"Ово", "је", "тачан", "редослед", "убацивања"};
		Set<String> hesSkup = new HashSet<>();
		Set<String> povezaniHesSkup = new LinkedHashSet<>();
		for(String element: elementi) {
			hesSkup.add(element);
			povezaniHesSkup.add(element);
		}
		System.out.println("Обичан хеш-скуп: "+hesSkup);
		System.out.println("Повезани хеш-скуп: "+povezaniHesSkup);
	}
}
