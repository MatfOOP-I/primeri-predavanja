package rs.math.oop.g13.p11.kloniranjeGenerickiProblem;

public class Student
{
	private String ime;
	private String prezime;
	
	public Student( String ime, String prezime)
	{
		this.ime = ime;
		this.prezime = prezime;
	}
	
	public String uzmiIme()
	{
		return ime;
	}
	
	public void postaviIme(String ime )
	{
		this.ime = ime;
	}
	
	public String uzmiPrezime()
	{
		return prezime;
	}
	
	public void postaviPrezime(String prezime )
	{
		this.prezime = prezime;
	}
	
	@Override
	public String toString()
	{
		return "Student: " + ime + " " + prezime; 
	}
}
