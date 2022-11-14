package rs.math.oop.g08.p13.prevazilazenje;

public class Tacka {
	int x, y;

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Tacka))
			return false;
		Tacka tObj = (Tacka) obj;
		if(this == tObj)
			return true; // исте референце => исти садржај
		return x == tObj.x && y == tObj.y;
	}

	@Override
	public int hashCode() {
		int h = x;
		h = 31 * h + y;
		return h;
		//return java.util.Objects.hash(x, y); 
		// алтернативно постоји и услужни метод hash() у класи Objects
	}
}
