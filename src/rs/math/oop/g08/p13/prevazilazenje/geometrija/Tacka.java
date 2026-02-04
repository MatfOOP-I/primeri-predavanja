package rs.math.oop.g08.p13.prevazilazenje.geometrija;

public class Tacka {
	int x;
	int y;

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if (!(obj instanceof Tacka))
			return false;
		Tacka tObj = (Tacka) obj;
		if(this == tObj)
			return true; // исте референце => исти садржај
		return x == tObj.x && y == tObj.y;
	}

	@Override
	public int hashCode() {
		int h = 31 * x + 17 * y;
		return h;
		//алтернативно постоји и услужни метод hash() у класи Objects
		//return java.util.Objects.hash(x, y);
	}
}
