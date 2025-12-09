package rs.math.oop.g06.p08.prosledjivanjeOmotacTipa;

public class Kvadriranja {

	static void kvadrirajPrimitivni(float x) {
		x*=x;
		return;
	}
	
	static void kvadrirajUgradjeniOmotac(Float x) {
		x*=x;
		return;
	}
	
	static void kvadrirajMutabilniOmotac(MutabilniFloat x) {
		x.v*=x.v;
		//x = new MutabilniFloat(x.v*x.v);
	}
	
	public static void main(String[] args) {
		float x = 11;
		kvadrirajPrimitivni(x);
		System.out.println(x);
	
		Float xOmotac = x;
		kvadrirajUgradjeniOmotac(4.2f);
		System.out.println(xOmotac);
	
		MutabilniFloat xMutabilniOmotac = new MutabilniFloat(x);
		kvadrirajMutabilniOmotac(xMutabilniOmotac);
		System.out.println(xMutabilniOmotac.getValue());
	}
}
