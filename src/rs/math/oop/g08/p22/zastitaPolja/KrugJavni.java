package rs.math.oop.g08.p22.zastitaPolja;

import static java.lang.Math.*;

//import static java.lang.Math.PI;
//import static java.lang.Math.pow;

public class KrugJavni {

	public double cx, cy, r, p, o;
	
	public KrugJavni(double cx, double cy, double r) {
		this.cx = cx;
		this.cy = cy;
		this.r = r;
		p = pow(r,2)*PI;
		o = 2*r*PI;
	}
	
	@Override
	public String toString() {
		return String.format("C=(%.2f, %.2f) r=%.2f P=%.2f O=%.2f",
				cx, cy, r, p, o);
	}
}
