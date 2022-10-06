package rs.math.oop.g15.p02.ispisPodataka;

import java.io.DataOutputStream;
import java.io.IOException;

public class IspisiPodatkeKonzola {

	public static void main(String[] args) throws IOException {
		// основни ток је стандардни излаз тј. конзола
		// и он се прослеђује над-току као аргумент конструктора
		DataOutputStream tok = new DataOutputStream(System.out);
		try {
			// да смо писали само један бајт (карактер А)
			// бафер се не би напунио па би користили flush
			// да форсирамо писање и пре пуњења бафера
			tok.write(65);
			tok.flush();
			// flush очисти бафер тако да се карактер А
			// неће исписати два пута
			tok.writeChars(System.lineSeparator());
			// бинарна репрезентација реалног броја
			// неће имати текстуално смислен запис
			tok.writeDouble(3432.3);
			tok.writeChars(System.lineSeparator());
			tok.writeUTF("Ovo je UTF8 текст са različitim писмима.");
			tok.writeChars(System.lineSeparator());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} finally {
			tok.close();
		}
	}
}