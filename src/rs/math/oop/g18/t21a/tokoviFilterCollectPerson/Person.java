package rs.math.oop.g18.t21a.tokoviFilterCollectPerson;

public class Person
{
	private final String ime;
	private final int age;
	
	public Person( final String theName, final int theAge )
	{
		ime = theName;
		age = theAge;
	}
	
	public String getIme()
	{
		return ime;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public int ageDifference( final Person drugi )
	{
		return age - drugi.age;
	}
	
	public String toString()
	{
		return String.format( "%s - %d", ime, age );
	}
}
