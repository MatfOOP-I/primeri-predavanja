package rs.math.oop.g08.p22.zastitaPolja;

public class KrugJavni {

	public double cx, cy, r, p, o;
	
	public KrugJavni(double cx, double cy, double r) {
		this.cx = cx;
		this.cy = cy;
		this.r = r;
		p = r*r*Math.PI;
		o = 2*r*Math.PI;
	}
	
	@Override
	public String toString() {
		return String.format("C=(%.2f, %.2f) r=%.2f P=%.2f O=%.2f",
				cx, cy, r, p, o);
	}
}
