package rs.math.oop.g08.p06.uvozKlase;

import java.util.*;

//import java.util.Random;
//import java.util.Scanner;

public class IspisiPseudoslucajneCele {

	public static void main(String[] args) {
		Random rg = new Random();
		Scanner ulaz = new Scanner("4343434343");
		rg.setSeed(ulaz.nextLong());
		ulaz.close();
		for(int i=0; i<10; i++)
			System.out.println(rg.nextInt(5000));
	}
}
