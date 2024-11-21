package rs.math.oop.g07.p08.radSaMatricama;

public class RadSaMatricama {

    static void prikazi(double[][] a) {
        if (a == null) {
            System.err.println("Грешка!");
            return;
        }
        System.out.println("Елементи матрице су:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                System.out.printf("%15.4f", a[i][j]);
            System.out.printf("%n");
        }
    }

    static void prikazi2(double[][] a) {
        if (a == null) {
            System.out.println("Грешка!");
            return;
        }
        System.out.println("Елементи матрице су");
        for (double[] vrsta : a) {
            for (double x : vrsta)
                System.out.printf("%15.4f", x);
            System.out.printf("%n");
        }
    }

    static double[][] saberi(double[][] a, double[][] b) {
        if (!jeMatrica(a) || !jeMatrica(b))
            return null;
        if (a.length != b.length)
            return null;
        if (a[0].length != b[0].length)
            return null;
        double[][] c = new double[a.length][a[0].length];
        for (int i = 0; i < c.length; i++)
            for (int j = 0; j < c[0].length; j++)
                c[i][j] = a[i][j] + b[i][j];
        return c;
    }

    static double[][] oduzmi(double[][] a, double[][] b) {
        if (!jeMatrica(a) || !jeMatrica(b))
            return null;
        if (a.length != b.length)
            return null;
        if (a[0].length != b[0].length)
                return null;
        double[][] c = new double[a.length][a[0].length];
        for (int i = 0; i < c.length; i++)
            for (int j = 0; j < c[i].length; j++)
                c[i][j] = a[i][j] - b[i][j];
        return c;
    }

    static double[][] pomnozi(double[][] a, double[][] b) {
        if (!jeMatrica(a) || !jeMatrica(b))
            return null;
        if (a[0].length != b.length)
            return null;
        double[][] c = new double[a.length][b[0].length];
        for (int i = 0; i < c.length; i++)
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = 0;
                for (int k = 0; k < a[i].length; k++)
                    c[i][j] += a[i][k] * b[k][j];
            }
        return c;
    }

    static boolean jeMatrica(double[][] a) {
        if (a == null)
            return false;
        for (int i = 1; i < a.length; i++)
            if (a[i].length != a[0].length)
                return false;
        return true;
    }


    static boolean jeKvadratna(double[][] a) {
        if (!jeMatrica(a))
            return false;
        return a.length == a[0].length;
    }

    static double[][] iskljuci(double[][] a, int vrsta, int kolona) {
        int n = a.length;
        int m = a[0].length;
        double[][] mat = new double[n - 1][m - 1];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                if(i == vrsta || j == kolona)
                    continue;
                mat[i-((i<vrsta)?0:1)][j-((j<kolona)?0:1)] = a[i][j];
            }
        return mat;
    }

    static double[][] iskljuci1(double[][] a, int vrsta, int kolona) {
        int n = a.length;
        int m = a[0].length;
        double[][] mat = new double[n - 1][m - 1];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                if (i < vrsta) {
                    if (j < kolona)
                        mat[i][j] = a[i][j];
                    else if (j > kolona)
                        mat[i][j-1] = a[i][j];
                } else if (i > vrsta) {
                    if (j < kolona)
                        mat[i-1][j] = a[i][j];
                    else if (j > kolona)
                        mat[i-1][j-1] = a[i][j];
                }
            }
        return mat;
    }

    static double[][] iskljuci2(double[][] a, int vrsta, int kolona) {
        int n = a.length;
        int m = a[0].length;
        double[][] mat = new double[n - 1][m - 1];
        for (int i = 0; i < vrsta; i++)
            for (int j = 0; j < kolona; j++)
                mat[i][j] = a[i][j];
        for (int i = vrsta; i < n - 1; i++)
            for (int j = 0; j < kolona; j++)
                mat[i][j] = a[i + 1][j];
        for (int i = 0; i < vrsta; i++)
            for (int j = kolona; j < m - 1; j++)
                mat[i][j] = a[i][j + 1];
        for (int i = vrsta; i < n - 1; i++)
            for (int j = kolona; j < m - 1; j++)
                mat[i][j] = a[i + 1][j + 1];
        return mat;
    }

    static double determinanta(double[][] a) {
        int n = a.length;
        if (n == 1)
            return a[0][0];
        if (n == 2)
            return a[0][0] * a[1][1] - a[1][0] * a[0][1];
        double det = 0;
        double znak = 1;
        for (int j = 0; j < n; j++) {
            det += znak * a[n-1][j] * determinanta(iskljuci(a, n-1, j));
            znak = -znak;
        }
        return det;
    }

    public static void main(String[] args) {
        double[][] a = {{1.5, 2, 3}, {4, 5, 7}};
        System.out.println("A je: ");
        prikazi(a);
        double[][] b = {{2, 3, 4}, {-5, 6.6, 7}};
        System.out.println("B je: ");
        prikazi2(b);
        System.out.println("A+B je: ");
        prikazi2(saberi(a, b));
        System.out.println("A-B je: ");
        prikazi2(oduzmi(a, b));
        double[][] c = {{5, 1.5}, {3, 0}, {-1.5, 1}};
        System.out.println("C је: ");
        prikazi(c);
        System.out.println("A*C је: ");
        double[][] d = pomnozi(a, c);
        prikazi(d);
        System.out.println("C*A је: ");
        double[][] e = pomnozi(c, a);
        prikazi(e);
        System.out.println("C*A након измене je: ");
        e[1][0] = 0.75;
        e[1][1] = 2;
        prikazi2(e);
        System.out.println("C*A sa iskljucenom drugom vrstom i drugom kolonom је: ");
        prikazi(iskljuci(e,0,1));
        if (jeKvadratna(e))
            System.out.println("Детерминанта матрице C*A је: " + determinanta(e));
        else
            System.out.println("Матрица C*A није квадратна па нема детерминанту.");
    }
}
