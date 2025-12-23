package rs.math.oop.g08.p10.preopterecivanjeMetoda;

public class Pravougaonik {
	Tacka gl;
	Tacka dd;

	void podesi(int x1, int y1, int x2, int y2) {
		gl = new Tacka();
		gl.x = x1 <= x2 ? x1 : x2;
		gl.y = y1 >= y2 ? y1 : y2;
		dd = new Tacka();
		dd.x = x1 >= x2 ? x1 : x2;
		dd.y = y1 <= y2 ? y1 : y2;
		if(gl.x==dd.x || gl.y==dd.y) {
			System.err.println(
					"Грешка, висина и ширина морају бити позитивне.");
			System.exit(1);
		}
	}

	void podesi(Tacka gl, int s, int v) {
		if(s<=0 || v<=0) {
			System.err.println(
					"Грешка, висина и ширина морају бити позитивне.");
			System.exit(2);
		}
		// this.gl реферише на поље, док gl на локалну променљиву тј. аргумент
		this.gl = gl;
		// код испод не ради ништа корисно -- честа грешка
		gl = gl;
		dd = new Tacka();
		dd.x = gl.x + s;
		dd.y = gl.y - v;
	}

	void prikazi() {
		System.out.println("gl=(" + gl.x + ", " 
				+ gl.y + ") dd=(" + dd.x + ", " + dd.y + ")");
	}

	public static void main(String[] args) {
		Pravougaonik p1 = new Pravougaonik();
		p1.podesi(10,  20,  50, 30);
		p1.prikazi();
		Pravougaonik p2 = new Pravougaonik();
		Tacka t = new Tacka();
		t.x = 10;
		t.y = 30;
		p2.podesi(t, 40, 10);
		p2.prikazi();
		t.x = 100;
		p2.prikazi();
//		Pravougaonik p3 = new Pravougaonik();
//		p3.podesi(10, 100, 10, 20);
//		p3.prikazi();
	}
}
