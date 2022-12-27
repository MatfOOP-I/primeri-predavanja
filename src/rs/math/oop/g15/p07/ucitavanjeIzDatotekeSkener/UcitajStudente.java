package rs.math.oop.g15.p07.ucitavanjeIzDatotekeSkener;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import rs.math.oop.g14.p17.dzokerTipDonjeGranice.Student;

public class UcitajStudente {

	public static void main(String[] args) {
		Scanner skener = null;
		try {
			List<Student> studenti = new ArrayList<>();
			skener = new Scanner(new File("ostalo/studenti.txt"), "UTF-8");
			while (skener.hasNext()) {
				String JMBG = skener.next();
				String ime = skener.next();
				String prezime = skener.next();
				int godinaRodjenja = skener.nextInt();
				String indeks = skener.next();
				double prosecnaOcena = skener.nextDouble();
				Student student = new Student(JMBG, ime, prezime, 
						godinaRodjenja, indeks, prosecnaOcena);
				studenti.add(student);
			}
			for (Student student : studenti)
				System.out.println(student);
			Collections.sort(studenti, new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					return o1.uzmiPrezime().compareTo(o2.uzmiPrezime());
				}
			});
			Collections.sort(studenti, (o1, o2) -> o1.uzmiPrezime().compareTo(o2.uzmiPrezime()));
			for (Student student : studenti)
				System.out.println(student);
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} finally {
			if (skener != null)
				skener.close();
		}
	}
}
