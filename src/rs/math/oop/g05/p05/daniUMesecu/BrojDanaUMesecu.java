package rs.math.oop.g05.p05.daniUMesecu;

public class BrojDanaUMesecu {

	public static void main(String[] args) {
		int g, m;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Унеcи годину");
		g = sc.nextInt();
		if (g < 1)
			System.out.println("Неисправан унос " + g);
		System.out.println("Унеcи редни број месеца [1-12]");
		m = sc.nextInt();
		switch (m) {
		case 2:
			if (g % 400 == 0 || (g % 4 == 0 && g % 100 != 0))
				System.out.println("Број дана је 28.");
			else
				System.out.println("Број дана је 29.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Број дана је 30.");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Број дана је 31.");
			break;
		default:
			System.out.println("Неисправан унос " + m);
		}
	}

}
