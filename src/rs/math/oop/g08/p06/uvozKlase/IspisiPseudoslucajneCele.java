package rs.math.oop.g08.p06.uvozKlase;

import java.util.*;

public class IspisiPseudoslucajneCele {

	public static void main(String[] args) {
		Random rg = new Random();
		for(int i=0; i<10; i++)
			System.out.println(rg.nextInt(5000));
	}
}
