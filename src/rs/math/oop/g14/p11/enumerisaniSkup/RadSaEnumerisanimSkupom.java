package rs.math.oop.g14.p11.enumerisaniSkup;

import java.util.EnumSet;

public class RadSaEnumerisanimSkupom {

	public static void main(String[] args) {
		EnumSet<DanUNedelji> eSkup1 = EnumSet.of(DanUNedelji.CETVRTAK);
		eSkup1.add(DanUNedelji.CETVRTAK);
		eSkup1.add(DanUNedelji.PETAK);
		System.out.println(eSkup1.contains(DanUNedelji.PETAK));
		System.out.println(eSkup1);
		
		EnumSet<DanUNedelji> eSkup2 = EnumSet.of(DanUNedelji.UTORAK, 
				DanUNedelji.CETVRTAK, DanUNedelji.SREDA);
		System.out.println(eSkup2); 
		
		System.out.println(eSkup1.size()); // кардиналност је 2
		// eSkup1 постаје унија
		eSkup1.addAll(eSkup2);
		System.out.println(eSkup1);
	}
}
