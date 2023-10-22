package rs.math.oop.g15.p01.ulazniTokDatoteka;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ProcitajDatoteku {

	public static void main(String[] args) throws IOException {
		if (args.length != 1) {
			System.err.println("Аргумент командне линије " 
		+ "мора садржати путању до датотеке.");
			System.exit(1);
		}
		String putanja = args[0];
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(putanja);
			int i = 0;
			while ((i = fin.read()) != -1)
				System.out.print((char) i);
		} catch (FileNotFoundException e) {
			// FileNotFoundException
			System.err.println(e.getMessage());
		} finally {
			// не заборавити затварање тока
			// у finally блоку је препоручено
			fin.close();
		}
	}
}
