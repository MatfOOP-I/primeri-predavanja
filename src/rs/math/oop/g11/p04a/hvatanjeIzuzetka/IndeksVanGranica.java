package rs.math.oop.g11.p04a.hvatanjeIzuzetka;

public class IndeksVanGranica {

	public static void main(String[] args) {
		System.out.println("Почетак");
		try{
			int a[] = new int[22];
			System.out.println("Приступам елементу:" + a[25]);
		}
		catch (ArrayIndexOutOfBoundsException exp){
			System.out.println("Покушај приступа неуспешан, порука: \n" + exp);
		}
		catch (Exception exp){
			System.out.println("Нека општа грешка, порука: \n" + exp);
		}
		System.out.println("Готово");
	}
}
