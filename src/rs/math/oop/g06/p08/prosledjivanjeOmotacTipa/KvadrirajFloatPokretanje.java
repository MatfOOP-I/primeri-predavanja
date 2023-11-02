package rs.math.oop.g06.p08.prosledjivanjeOmotacTipa;

public class KvadrirajFloatPokretanje {

	static void kvadrirajPrimitivni(float x) {
		x*=x;
		return;
	}
	
	static void kvadrirajUgradjeniOmotac(Float x) {
		x*=x;
		return;
	}
	
	static void kvadrirajMutabilniOmotac(MutabilniFloat x) {
		//x.v*=x.v;
		x = new MutabilniFloat(x.v*x.v);
	}
	
	public static void main(String[] args) {
		float x = 11;
		Float xOmotac = x;
		MutabilniFloat xMutabilniOmotac = new MutabilniFloat(x);
		
		kvadrirajPrimitivni(x);
		System.out.println(x);
		
		kvadrirajUgradjeniOmotac(xOmotac);
		System.out.println(xOmotac);
		
		kvadrirajMutabilniOmotac(xMutabilniOmotac);
		System.out.println(xMutabilniOmotac.v);
	}
}
