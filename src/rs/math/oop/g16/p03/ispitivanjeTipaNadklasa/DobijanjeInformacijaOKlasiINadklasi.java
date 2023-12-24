package rs.math.oop.g16.p03.ispitivanjeTipaNadklasa;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

interface Interfejs1
{
	int m1();
}

class Klasa1 implements Interfejs1
{
	public int i = 6;
	private int j = 7;
	
	@Override
	public int m1()
	{
		return i;
	}
}

class Klasa2 extends Klasa1 implements Cloneable
{
	private int nestoPametno = 7;
	public int nestoGlupo = 6;
		
	public String proba(int i)
	{
		return "Miki_" + i;
	}

	private String proba2()
	{
		return "Miki";
	}

	public Klasa2 clone() throws CloneNotSupportedException
	{
		return (Klasa2) super.clone();
	}
}

public class DobijanjeInformacijaOKlasiINadklasi
{
	
	public static void main( String[] args )
	{
		Class<?> k = null;
		// Klasa1 p1 = new Klasa2();
		//k = p1.getClass();
		//k = Klasa1.class;
		try
		{
			String imeKlase = "rs.math.oop.g16.p01.ispitivanjeTipaKlasa.Klasa1";
			if(args.length>0){
				imeKlase = args[0];
			}
			k = Class.forName(imeKlase);
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			return;
		}
		System.out.println( "Назив класе:" + k.getName() );
		Class<?>[] implementira = k.getInterfaces();
		System.out.print("Имплементирани интерфејси: ");
		for( Class<?> i: implementira)
			System.out.print( i.getName() + " " );
		System.out.println();
	
		Field[] polja =  k.getFields();
		System.out.print("Поља: ");
		for( Field f: polja)
			System.out.print( f.getName() + " " );
		System.out.println();
		Method[] metodi =  k.getMethods();
		System.out.print("Методи: ");
		for( Method m: metodi)
			System.out.print( m.getName() + " " );
		System.out.println();
		
		System.out.println();
		Class<?> k0 = k.getSuperclass();
		System.out.println( "Надкласа:" + k0.getName() );
		Class<?>[] implementira0 = k0.getInterfaces();
		System.out.print("Имплементирани интерфејси надкласе: ");
		for( Class<?> i: implementira0)
			System.out.print( i.getName() + " " );
		System.out.println();

		Field[] polja0 =  k0.getDeclaredFields();
		System.out.print("Декларисана поља надкласе: ");
		for( Field f: polja0)
			System.out.print( f.getName() + " " );
		System.out.println();

		Method[] metodi0 =  k0.getDeclaredMethods();
		System.out.print("Декларисани меотоди надкласе: ");
		for( Method m: metodi0)
			System.out.print( m.getName() + " " );
		System.out.println();
	}
}