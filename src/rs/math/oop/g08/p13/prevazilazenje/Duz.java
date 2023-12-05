package rs.math.oop.g08.p13.prevazilazenje;

import java.util.Objects;

public class Duz {
	Tacka a;
	Tacka b;

	@Override
	public String toString() {
		return "{" + a + ", " + b + "}";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Duz))
			return false;
		Duz dObj = (Duz) obj; // експлицитна конверзија
		if(this == dObj)
			return true; // исте референце => исти садржај
		// крајње тачке могу бити у било ком редоследу наведене
		return (a.equals(dObj.a) && b.equals(dObj.b)) 
				|| (a.equals(dObj.b) && b.equals(dObj.a));
	}

	@Override
	public int hashCode() {
		// ако equals враћа true
		// објекти морају имати исте хеш-кодове
		// зато увек комбинујемо хеш-кодове тачака у јединственом редоследу
		if(a.hashCode()<b.hashCode())
			return Objects.hash(a, b);
		else
			return Objects.hash(b, a);
	}

	public static void main(String[] args) {
		Tacka t1 = new Tacka();
		t1.x = 10;
		t1.y = 20;
		Tacka t2 = new Tacka();
		t2.x = -40;
		t2.y = 60;
		Tacka t3 = new Tacka();
		t3.x = 10;
		t3.y = 20;
		System.out.println(t1.equals(t2)); // false
		System.out.println(t1.equals(t3)); // true
		Duz d1 = new Duz();
		d1.a = t1;
		d1.b = t2;
		Duz d2 = new Duz();
		d2.a = t2;
		d2.b = t1;
		Duz d3 = new Duz();
		d3.a = t1;
		d3.b = t3;
		System.out.println(t1.equals(d1)); // false
		System.out.println(d1.equals(d2)); // true (редослед другачији)
		System.out.println(d1.equals(d3)); // false
		System.out.println(t1 +" "+ t1.hashCode());
		System.out.println(t2 +" "+ t2.hashCode());
		System.out.println(t3 +" "+ t3.hashCode());
		System.out.println(d1 + " "+ d1.hashCode());
		System.out.println(d2 + " "+ d2.hashCode());
		System.out.println(d3 + " "+ d3.hashCode());
	}
}
