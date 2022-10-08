package rs.math.oop.g06.p11.matematickeFunkcije;

public class MonteKarloIntegracija {

	static void greska(String poruka) {
		System.err.println(poruka);
		System.exit(1);
	}

	// корисна метода да не морамо сваки пут да правимо гранање у главном коду
	static double primeniFunkciju(String funkcija, double x) {
		if (funkcija.equals("sqrt"))
			return Math.sqrt(x);
		else if (funkcija.equals("log"))
			return Math.log(x);
		else
			return Math.exp(x);
	}

	public static void main(String[] args) {
		String funkcija;
		double a, b;
		int N;

		java.util.Scanner skener = new java.util.Scanner(System.in);
		// учитавање улазних параметара
		System.out.println("Одаберите функцију sqrt, log или exp:");
		funkcija = skener.next();
		if (!funkcija.equals("sqrt") && !funkcija.equals("log") && !funkcija.equals("exp"))
			greska("Некоректна функција.");
		System.out.println("Унесите a:");
		if (!skener.hasNextDouble())
			greska("a треба да буде број.");
		a = skener.nextDouble();
		if (a < 1)
			greska("a треба да буде >= 1.");
		System.out.println("Унесите b:");
		if (!skener.hasNextDouble())
			greska("b треба да буде број.");
		b = skener.nextDouble();
		if (b < a)
			greska("b треба да буде >= a.");
		System.out.println("Унесите N:");
		if (!skener.hasNextInt())
			greska("N треба да буде цео број.");
		N = skener.nextInt();
		if (N < 1)
			greska("N треба да буде > 0.");
		// Монте Карло интеграција
		// најпре одређујемо правоугаоник
		// са леве и десне стране су a и b
		// са доње стране је за све наведене функције 0
		double donja = 0;
		// са горње стране зависи од функције,
		// пошто су све монотоно растуће узимамо вредност у тачки b
		double gornja = primeniFunkciju(funkcija, b);
		// главни део, генеришемо N псеудослучајних (x, y) променљивих
		int yUnutra = 0;
		for (int i = 0; i < N; i++) {
			// пошто Math.random() враћа из [0,1] овако скалирамо на [a,b]
			double x = Math.random() * (b - a) + a;
			double y = Math.random() * (gornja - donja) + donja;
			double vred = primeniFunkciju(funkcija, x);
			if (y < vred)
				yUnutra++;
		}
		// коначно апроксимирани интеграл заузима површину која одговара
		// уделу yUnutra/N површине правоугаоника
		double integral = (b - a) * (gornja - donja) * yUnutra / N;
		System.out.println("Апроксимација интеграла је " + integral);
		skener.close();
	}
}