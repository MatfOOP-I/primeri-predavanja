package rs.math.oop.g14.p10.bitovskiSkup;

import java.util.BitSet;

public class RadSaBitovskimSkupom {

	public static void main(String[] args) {
		BitSet bitSkup1 = new BitSet();
		System.out.println("Иницијална величина скупа 1 "
				+bitSkup1.size()); // иницијално 1 реч тј. 64 бита
		bitSkup1.set(56);
		bitSkup1.set(23);
		System.out.println(bitSkup1.get(56)); // true
		System.out.println(bitSkup1.get(13)); // false
		System.out.println(bitSkup1); // елементи скупа {23, 56}
		BitSet bitSkup2 = new BitSet();
		bitSkup2.set(56);
		bitSkup2.set(325); // изазива динамичко повећање низа речи
		System.out.println(bitSkup2.size()); // 6 речи, тј. 384 бита
		System.out.println(bitSkup2.cardinality()); // кардиналност 2
		// рачуна пресек и уписује га преко bitSkup1
		bitSkup1.and(bitSkup2);
		System.out.println(bitSkup1); // у пресеку је број 56
	}
}
