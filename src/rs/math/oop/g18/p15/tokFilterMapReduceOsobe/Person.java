package rs.math.oop.g18.p15.tokFilterMapReduceOsobe;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Person
{
	
	public static List<Person> LIKOVI_CRTANI;
	
	static
	{
		LIKOVI_CRTANI = new ArrayList<>();
		LIKOVI_CRTANI.add( new Person( "Miki Maus", LocalDate.of( 1928, 5, 7 ), Sex.MALE,
				"mickey.mouse@disney.com" ) );
		LIKOVI_CRTANI.add( new Person( "Paja Patak", LocalDate.of( 1932, 5, 7 ), Sex.MALE,
				"donald.duck@disney.com" ) );
		LIKOVI_CRTANI.add( new Person( "Dusko Dugousko", LocalDate.of( 1932, 5, 7 ), Sex.MALE,
				"bugs.buney@wb.com" ) );
		LIKOVI_CRTANI.add( new Person( "Mini Maus", LocalDate.of( 1929, 5, 7 ), Sex.FEMALE,
				"miney.mouse@disney.com" ) );
		LIKOVI_CRTANI.add( new Person( "Silja", LocalDate.of( 1940, 5, 7 ), Sex.MALE,
				"guffy@disney.com" ) );
		LIKOVI_CRTANI.add( new Person( "Patak Daca", LocalDate.of( 1945, 5, 7 ), Sex.MALE,
				"duffy.duck@wb.com" ) );
	}
	
	public Person( String ime, LocalDate birthday, Sex gender,
			String emailAddress )
	{
		super();
		this.ime = ime;
		this.birthday = birthday;
		this.gender = gender;
		this.emailAddress = emailAddress;
	}
	
	public enum Sex
	{
		MALE, FEMALE
	}
	
	String ime;
	LocalDate birthday;
	Sex gender;
	String emailAddress;
	
	public long getAge()
	{
		return birthday.until( LocalDate.now(), ChronoUnit.YEARS);
	}
	
	@Override
	public String toString()
	{
		return ime + " " + gender + " " + birthday + " " +  getAge() + " "  + emailAddress;
	}
	
	public void printPerson()
	{
		System.out.println( this );
	}
}
