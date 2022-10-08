package rs.math.oop.g05.p05.daniUMesecu;

public class BrojDanaUMesecu {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int m;
		System.out.println("Унеcи редни број месеца [1-12]");
		m = sc.nextInt();
		switch (m) {
		case 2:
			System.out.println("Број дана је 28.");
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
