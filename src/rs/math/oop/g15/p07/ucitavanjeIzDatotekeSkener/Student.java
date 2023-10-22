package rs.math.oop.g15.p07.ucitavanjeIzDatotekeSkener;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student extends OsobaUporediva{
	
	private String indeks;
	private double prosecnaOcena;
	
	public Student(String jMBG, String ime, String prezime, int godinaRodjenja, 
			String indeks, double prosecnaOcena) {
		super(jMBG, ime, prezime, godinaRodjenja);
		this.indeks = indeks;
		this.prosecnaOcena = prosecnaOcena;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\t"+indeks+"\t"+prosecnaOcena;
	}

	public static void main(String[] args) {
		List<Student> studenti = new ArrayList<>();
		studenti.add(new Student(
				"1009987567890", "Марко", "Петровић", 1987, "23", 9.33));
		studenti.add(new Student(
				"2001967567890", "Ана", "Ковачевић", 1967, "13", 8.43));		
		studenti.add(new Student(
				"1009997567890", "Марија", "Мирковић", 1997, "111", 9.36));
		Collections.sort(studenti);
		for(Student s: studenti)
			System.out.println(s);
	}
}
