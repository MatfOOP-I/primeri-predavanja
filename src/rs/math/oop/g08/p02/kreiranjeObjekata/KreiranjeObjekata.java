package rs.math.oop.g08.p02.kreiranjeObjekata;

class KreiranjeObjekata{

	   public static void main(String[] args) {
	       Zaposleni z1 = new Zaposleni();
	       Zaposleni z2 = new Zaposleni();
		   Zaposleni z3 = z1;

		   System.out.println(z1);
		   System.out.println(z2);

		   if(z1.equals(z2))
			   System.out.printf("Metod equals() vrace true za %s i %s%n", z1, z2);
		   else
			   System.out.printf("Metod equals() vrace false za %s i %s%n", z1, z2);
		   if(z1.equals(z3))
			   System.out.printf("Metod equals() vrace true za %s i %s%n", z1, z3);
		   else
			   System.out.printf("Metod equals() vrace false za %s i %s%n", z1, z3);

	       String s1 = new String("Објектно оријентисано програмирање");
	       String s2 = new String("Објектно оријентисано програмирање");
		   if(s1.equals(s2))
			   System.out.printf("Metod equals() vrace true za %s i %s%n", s1, s2);
		   else
			   System.out.printf("Metod equals() vrace false za %s i %s%n", s1, s2);
	    }
	}
