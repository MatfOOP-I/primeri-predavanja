package rs.math.oop.g12.p01.enumiDaniUNedelji;

public class JednakostDana {
	public static void main(String[] args) {
		// променљиве добијају већ унапред дефинисане вредности
		DanUNedelji d1 = DanUNedelji.CETVRTAK;
		DanUNedelji d2 = DanUNedelji.UTORAK;
		DanUNedelji d3 = DanUNedelji.CETVRTAK;
		//DanUNedelji d4 = new DanUNedelji(); // није могуће
		System.out.println(d1.name());
		// аутоматска додела целобројних вредности
		System.out.println(d1.ordinal()); 
		// различите вредности
		System.out.println(d1==d2); 
		// исте вредности - показују чак и на исту меморију
		System.out.println(d1==d3); 
	}

}
