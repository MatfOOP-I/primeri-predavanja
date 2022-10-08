package rs.math.oop.g15.p05.ulancavanjeTokova;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ProcitajDatotekuKaraktera {

	public static void main(String[] args) throws IOException {
		if (args.length != 1) {
			System.err.println("Аргумент командне линије " 
					+ "мора садржати путању до датотеке.");
			System.exit(1);
		}
		String putanja = args[0];
		
		// ток података који испоручује бајтове (не ради са карактерима)
		InputStream fTok = null;
		Reader citac = null;
		Reader bCitac = null;
		try {
			fTok = new FileInputStream(putanja);
			// користи ток бајтова основног тока и производи карактере
			citac = new InputStreamReader(fTok);
			// унапређено читање применом бафера
			bCitac = new BufferedReader(citac);
			int c;
			do {
				c = bCitac.read();
				System.out.print((char) c);
			} while (c != -1);
			System.out.println();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			if (fTok != null)
				fTok.close();
			if (citac != null)
				citac.close();
			if (bCitac != null)
				bCitac.close();
		}
	}
}
