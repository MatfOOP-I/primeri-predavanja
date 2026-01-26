package rs.math.oop.g15.p03.citacNiske;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class CitajReci {

	public static void main(String[] args) throws IOException {
		String niska = "Пример неког кратког текста.";
		int N = 3;
		Reader citac = new StringReader(niska);
		try {
			while (true) {
				int c = citac.read();
				// крај текста
				if (c == -1)
					break;
				// проверавамо да ли је неки од n наредних празан простор
				citac.mark(N);
				boolean prazan = false;
				for (int i = 0; i < N; i++) {
					char a = (char) citac.read();
					if (a == -1)
						break;
					if (a == ' ') {
						prazan = true;
						break;
					}
				}
				// враћамо се назад на активну позицију
				citac.reset();
				// ако нема празног простора, исписујемо карактер
				if (!prazan)
					System.out.print((char)c);
			}
			System.out.println();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} finally {
			citac.close();
		}
	}
}
