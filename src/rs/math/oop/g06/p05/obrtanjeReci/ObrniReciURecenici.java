package rs.math.oop.g06.p05.obrtanjeReci;

public class ObrniReciURecenici {

	public static void main(String[] args) {
	
		java.util.Scanner ulaz = new java.util.Scanner(System.in);
		String recenica = ulaz.nextLine();
		String[] reci = recenica.split(" ");
		if(reci.length==0)
		{
			System.out.println("Нема шта да се обрне.");
			return;
		}
		// уклањање тачке са последње речи
		int kraj = reci.length-1;
		reci[kraj]=reci[kraj].replace(".", "");
		// смањивање великог слова у мало на првој речи 
		// (која ће постати сад последња)
		// могли смо да умањимо и слова из целе речи, 
		// али је овако демонстрирана и употреба substring метода
		reci[0] = reci[0].substring(0,1).toLowerCase()+reci[0].substring(1);
		// Слично и увећавање првог слова последње речи
		reci[kraj]= reci[kraj].substring(0,1).toUpperCase()+reci[kraj].substring(1);
		String novaRecenica = reci[kraj];
		// приметити да се сваки пут прави нова ниска 
		// и њена референца се уписује у променљиву novaRecenica
		for(int i=kraj-1; i>=0; i--)
			novaRecenica = novaRecenica.concat(" "+reci[i]); // concat или +
		novaRecenica+="."; // додајемо тачку за крај реченице
		System.out.println(novaRecenica);
	}
}
