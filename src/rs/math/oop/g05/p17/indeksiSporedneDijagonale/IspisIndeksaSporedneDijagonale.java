package rs.math.oop.g05.p17.indeksiSporedneDijagonale;

public class IspisIndeksaSporedneDijagonale {

	public static void main(String[] args) {

		int n = 15;
		int i, j;
		for (i = 1, j = n; i <= n && j >= 1; i++, j--) {
			for(int k=0; k < j-1; k++)
				System.out.print("      ");
			System.out.println("(" + i + ", " + j + ")");
		}
	}
}
