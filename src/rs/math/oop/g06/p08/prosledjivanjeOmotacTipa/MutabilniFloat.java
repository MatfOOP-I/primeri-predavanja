package rs.math.oop.g06.p08.prosledjivanjeOmotacTipa;

public class MutabilniFloat {
	
	float v;
	public MutabilniFloat(float v) {
		this.v=v;
	}

	static void kvadrirajPrimitvni(float x) {
		x*=x;
	}
	
	static void kvadrirajUgradjeniOmotac(Float x) {
		// пошто је x имутабилан његовим квадрирањем настаје нови објекат
		// и његова референца се додељује променљивој x
		// тако да од овог момента x више не реферише на исти објекат 
		x*=x;
	}
	
	static void kvadrirajMutabilniOmotac(MutabilniFloat x) {
		x.v*=x.v;
	}
	
	public static void main(String[] args) {
		float x = 11;
		Float xOmotac = x;
		MutabilniFloat xMutabilniOmotac = new MutabilniFloat(x);
		
		kvadrirajPrimitvni(x);
		System.out.println(x);
		
		kvadrirajUgradjeniOmotac(xOmotac);
		System.out.println(xOmotac);
		
		kvadrirajMutabilniOmotac(xMutabilniOmotac);
		System.out.println(xMutabilniOmotac.v);
	}
}
