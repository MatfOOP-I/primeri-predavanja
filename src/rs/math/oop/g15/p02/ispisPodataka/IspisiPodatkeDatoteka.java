package rs.math.oop.g15.p02.ispisPodataka;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IspisiPodatkeDatoteka {

	public static void main(String[] args) throws IOException {
		// уписујемо у датотеку
//		FileOutputStream fTokIzlaz = null;
//		DataOutputStream tokIzlaz = null;
//		try {
//			fTokIzlaz = new FileOutputStream("izlaz.txt");
//			tokIzlaz = new DataOutputStream(fTokIzlaz);
//			tokIzlaz.write(65);
//			tokIzlaz.writeDouble(3432.3);
//		} catch (FileNotFoundException e) {
//			System.err.println(e.getMessage());
//		} finally {
//			if (tokIzlaz != null)
//				tokIzlaz.close();
//			if (fTokIzlaz != null)
//				fTokIzlaz.close();
//		}
		// сада читамо садржај истим редоследом
		FileInputStream fTokUlaz = null;
		DataInputStream tokUlaz = null;
		try {
			fTokUlaz = new FileInputStream("izlaz.txt");
			tokUlaz = new DataInputStream(fTokUlaz);
			// tokUlaz = new DataInputStream(new FileInputStream("izlaz.txt"));
			int bajt = tokUlaz.read();
			System.out.println(bajt); // 65
			double broj = tokUlaz.readDouble();
			System.out.println(broj); // 3432.3
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} finally {
			if (tokUlaz != null)
				tokUlaz.close();
			if (fTokUlaz != null)
				fTokUlaz.close();
		}
		
	}
}