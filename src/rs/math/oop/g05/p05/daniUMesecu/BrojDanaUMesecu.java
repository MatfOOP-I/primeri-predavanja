package rs.math.oop.g05.p05.daniUMesecu;

public class BrojDanaUMesecu {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String m;
		System.out.println("Унеcи ознаку месеца [m1-m12]");
		m = sc.next();
		switch (m) {
		case "m2":
			System.out.println("Број дана је 28.");
			break;
		case "m4":
		case "m6":
		case "m9":
		case "m11":
			System.out.println("Број дана је 30.");
			break;
		case "m1":
		case "m3":
		case "m5":
		case "m7":
		case "m8":
		case "m10":
		case "m12":
			System.out.println("Број дана је 31.");
			break;
		default:
			System.out.println("Неисправан унос " + m);
		}
	}

}
