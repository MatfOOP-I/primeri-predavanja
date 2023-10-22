package rs.math.oop.g07.p07.odabirOperacijeArgumentiKomandneLinije;

public class OdaberiOperaciju {

	public static void main(String[] args) {
		if (args.length != 3) {
			System.err.println("Очекују се три улазна аргумента.");
			System.exit(1);
		}
		// за разлику од C, на нултом месту није назив програма
		// већ се одмах почиње са правим аргументима
		String op = args[0];
		// не проверавамо за сад да ли су последња два аргумента стварно бројеви
		// у перспективи ће и то бити проверавано кроз систем тзв. изузетака
		double op1 = Double.parseDouble(args[1]);
		double op2 = Double.parseDouble(args[2]);
		double rez = 0;
		switch (op) {
		case "+":
			rez = op1 + op2;
			break;
		case "-":
			rez = op1 - op2;
			break;
		case "*":
			rez = op1 * op2;
			break;
		case "/":
			if (op2 == 0) {
				System.err.println("Дељење нулом.");
				System.exit(1);
			}
			rez = op1 / op2;
			break;
		default:
			System.err.println("Неочекивана операција " + op);
			System.exit(1);
		}
		System.out.println("(" + op1 + ") " + op + " (" + op2 + ") = " + rez);
	}
}
