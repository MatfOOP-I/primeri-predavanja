package rs.math.oop.g05.p17.indeksiSporedneDijagonale;

public class IspisIndeksaSporedneDijagonale {

	public static void main(String[] args) {
		int i, j;
		int n = 10;
		for (i = 0, j = n - 1; i < n && j >= 0; i++, j--) {
			for(int k=0; k<j; k++)
				System.out.print("      ");
			System.out.println("(" + i + ", " + j + ")");
		}
	}
}
