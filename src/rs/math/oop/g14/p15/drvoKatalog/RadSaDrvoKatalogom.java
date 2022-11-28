package rs.math.oop.g14.p15.drvoKatalog;

import java.util.Map;
import java.util.TreeMap;

public class RadSaDrvoKatalogom {

	public static void main(String[] args) {
		String tekst = "Електрични аутомобили у свету нису више реткост "
				+ "већ редовна појава на улицама. Тај тренд би требало "
				+ "да расте, што показује и недавна најава великог Форда "
				+ "да ће у Европи сви његови аутомобили бити електрични "
				+ "до 2030. године, а сличне изјаве се могу чути и од "
				+ "осталих произвођача возила на батерије. "
				+ "Према резултатима прошлогодишње студије немачког "
				+ "Удружења аутомобилске индустрије, више од 80 одсто "
				+ "испитаних компанија полази од тога да ће се е-возила "
				+ "етаблирати као нови стандард. Исто толико фирми уверено "
				+ "је да је већ започео процес преласка на електричну "
				+ "мобилност. Ипак, 80 процената испитаника рачуна "
				+ "да ће се тек од 2030. године, или чак и касније, "
				+ "догодити потпуна замена, односно доминација е-мотора. "
				+ "Један део испитаних добављача очекује да би могли "
				+ "да се етаблирају и мотори с горивим ћелијама, "
				+ "на синтетичка горива.";
		char[] interpunkcija = new char[] { '.', ',', ';', ':', '?', '!' };
		for (char c : interpunkcija)
			tekst = tekst.replace(c, ' ');
		String[] reciNeprecisceno = tekst.toLowerCase().split(" ");
		Map<String, Integer> reciPojavljivanja = new TreeMap<>();
		for (String r : reciNeprecisceno)
			if (reciPojavljivanja.containsKey(r))
				reciPojavljivanja.put(r, reciPojavljivanja.get(r) + 1); 
			else
				reciPojavljivanja.put(r, 1); // прво појављивање
		// испис првих 10 лексикографски по речима
		int k = 1;
		for (String r : reciPojavljivanja.keySet())
			if (k > 10)
				break;
			else {
				System.out.println(k + ".\t" + r + "\t" 
									+ reciPojavljivanja.get(r));
				k++;
			}
	}
}
