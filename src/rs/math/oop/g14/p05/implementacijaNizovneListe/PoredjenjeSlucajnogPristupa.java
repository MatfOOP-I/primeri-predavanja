package rs.math.oop.g14.p05.implementacijaNizovneListe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class PoredjenjeSlucajnogPristupa {
	public static void main(String[] args) {
		int n = 10_000_000;
		int m = 1000;
		List<Integer> povezana = new LinkedList<>();
		List<Integer> nizovna = new ArrayList<>();
		Random rg = new Random(12345);
		
		long pocetak = System.nanoTime();
		for(int i=0; i<n; i++) 
			povezana.add(i);
		System.out.printf("Убацивање %d ел. на крај повезане трајало %.2f сек.%n", 
				n, (System.nanoTime()-pocetak)/1e9f);
		
		pocetak = System.nanoTime();
		for(int i=0; i<n; i++) 
			nizovna.add(i);
		System.out.printf("Убацивање %d ел. на крај низовне трајало %.2f сек.%n", 
				n, (System.nanoTime()-pocetak)/1e9f);
		
		pocetak = System.nanoTime();
		for(Integer x : povezana) 
			;
		System.out.printf("Набрајање %d ел. повезане трајало %.2f сек.%n", 
				n, (System.nanoTime()-pocetak)/1e9f);
		
		pocetak = System.nanoTime();
		for(Integer x: nizovna)
			;
		System.out.printf("Набрајање %d ел. низовне трајало %.2f сек.%n", 
				n, (System.nanoTime()-pocetak)/1e9f);
		
		pocetak = System.nanoTime();
		for(int i=0; i<m; i++) 
			povezana.get(rg.nextInt(n));
		System.out.printf("Приступање %d ел. у повезаној трајало %.2f сек.%n", 
				m, (System.nanoTime()-pocetak)/1e9f);
		
		pocetak = System.nanoTime();
		for(int i=0; i<m; i++) 
			nizovna.get(rg.nextInt(n));
		System.out.printf("Приступање %d ел. у низовној трајало %.2f сек.%n", 
				m, (System.nanoTime()-pocetak)/1e9f);
		
	}

}
