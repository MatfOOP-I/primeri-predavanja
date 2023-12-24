package rs.math.oop.g11.p07a.dveDimenzije;

import java.util.Scanner;

public class SabiranjeOduzimanjeMatrica {
   private static boolean kontrolaDim(double[][] m) throws MatricaNePostojiIzuzetak {
      if (m == null)
         throw new MatricaNePostojiIzuzetak();
      if (m[0] == null)
         throw new MatricaNePostojiIzuzetak();
      int n1 = m[0].length;
      for (int i = 1; i < m.length; i++) {
         if (m[i] == null)
            throw new MatricaNePostojiIzuzetak();
         if (m[i].length != n1)
            return false;
      }
      return true;
   }

   private static double[][] ucitaj() throws NegativnaDimenzijaMatriceIzuzetak {
      Scanner ulaz = new Scanner(System.in);
      System.out.println("Broj vrsta matrice");
      int m = ulaz.nextInt();
      if (m < 0)
         throw new NegativnaDimenzijaMatriceIzuzetak(m);
      System.out.println("Broj kolona matrice");
      int n = ulaz.nextInt();
      if (n < 0)
         throw new NegativnaDimenzijaMatriceIzuzetak(n);
      System.out.println("Elementi matrice su");
      double mat[][] = new double[m][n];
      for (int i = 0; i < m; i++)
         for (int j = 0; j < n; j++)
            mat[i][j] = ulaz.nextDouble();
      return mat;
   }

   private static void prikazi(double[][] a) throws MatricaNePostojiIzuzetak {
      if (a == null) {
         MatricaNePostojiIzuzetak npe = new MatricaNePostojiIzuzetak();
         throw npe;
      }
      System.out.println("Elementi matrice su");
      for (int i = 0; i < a.length; i++) {
         for (int j = 0; j < a[i].length; j++)
            System.out.printf("%15.4f", a[i][j]);
         System.out.println();
      }
   }

   private static double[][] saberi(double[][] a, double[][] b) throws NekompatibilneDimenzijeMatriceIzuzetak,
           MatricaNePostojiIzuzetak, DvodimenzionalniNizNijeMatricaIzuzetak {
      if (a == null)
         throw new MatricaNePostojiIzuzetak();
      if (b == null)
         throw new MatricaNePostojiIzuzetak();
      if (!kontrolaDim(a))
         throw new DvodimenzionalniNizNijeMatricaIzuzetak(a);
      if (!kontrolaDim(b))
         throw new DvodimenzionalniNizNijeMatricaIzuzetak(b);
      if (a.length != b.length)
         throw new NekompatibilneDimenzijeMatriceIzuzetak(true, a.length, b.length);
      if (a[0].length != b[0].length)
         throw new NekompatibilneDimenzijeMatriceIzuzetak(false, a[0].length, b[0].length);
      double[][] c = new double[a.length][a[0].length];
      for (int i = 0; i < c.length; i++)
         for (int j = 0; j < c[i].length; j++)
            c[i][j] = a[i][j] + b[i][j];
      return c;
   }

   private static double[][] oduzmi(double[][] a, double[][] b) throws NekompatibilneDimenzijeMatriceIzuzetak,
           MatricaNePostojiIzuzetak, DvodimenzionalniNizNijeMatricaIzuzetak {
      if (a == null)
         throw new MatricaNePostojiIzuzetak();
      if (b == null)
         throw new MatricaNePostojiIzuzetak();
      if (!kontrolaDim(a))
         throw new DvodimenzionalniNizNijeMatricaIzuzetak(a);
      if (!kontrolaDim(b))
         throw new DvodimenzionalniNizNijeMatricaIzuzetak(b);
      if (a.length != b.length)
         throw new NekompatibilneDimenzijeMatriceIzuzetak(true, a.length, b.length);
      if (a[0].length != b[0].length)
         throw new NekompatibilneDimenzijeMatriceIzuzetak(false, a[0].length, b[0].length);
      double[][] c = new double[a.length][a[0].length];
      for (int i = 0; i < c.length; i++)
         for (int j = 0; j < c[i].length; j++)
            c[i][j] = a[i][j] - b[i][j];
      return c;
   }

   public static void main(String[] args) {
      try {
         double[][] a = { { 1, 2, 3 }, { 3, 4, 8 } };
         // a = ucitaj();
         System.out.println("A je: ");
         prikazi(a);
         double[][] b = { { 1, 2 }, { 3, 4 } };
         // b = ucitaj();
         System.out.println("B je: ");
         prikazi(b);
         System.out.println("Zbir je: ");
         prikazi(saberi(a, b));
         System.out.println("Razlika je: ");
         prikazi(oduzmi(a, b));
      } catch ( // NegativnaDimenzijaMatriceException |
              NekompatibilneDimenzijeMatriceIzuzetak | MatricaNePostojiIzuzetak
              | DvodimenzionalniNizNijeMatricaIzuzetak e) {
         System.out.println("Doslo je do greske " + e);
         e.printStackTrace();
      }
   }

}
