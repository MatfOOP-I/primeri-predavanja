package rs.math.oop.g15.p04.ispisPodatakaKarakteri;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class IspisNiskiUDatoteku {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Аргумент командне линије " 
					+ "мора садржати путању до датотеке.");
			System.exit(1);
		}
		String putanja = args[0];
		
		String[] niske = new String[] {
				"Низ од", "неколико ниски", 
				"свака", "записана у", "засебном реду", 
				"излазне", "датотеке."
		};
		
		PrintWriter pisac = null;
		try {
			// за испис на конзоли овде бисмо уместо putanja
			// написали System.out (комбиновање тока и писача)
			pisac = new PrintWriter(putanja);
			for(String niska: niske)
				pisac.println(niska);
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}finally {
			if(pisac!=null)
				pisac.close();
		}
	}
}
