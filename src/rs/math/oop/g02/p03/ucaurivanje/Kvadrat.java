package rs.math.oop.g02.p03.ucaurivanje;

public class Kvadrat {
    private int dlX;
    private int dlY;
    private int a;

    Kvadrat(int doleLevoX, int doleLevoY, int ivica){
        dlX = doleLevoX;
        dlY = doleLevoY;
        a = ivica;
    }

    void prikazi() {
        System.out.println("Квадрат [(" + dlX + ", " + dlY + "),"
                + "(" + (dlX + a) + ", " + dlY + "),"
                + "(" + (dlX + a) + ", " + (dlY + a) + "),"
                +  "(" + dlX + ", " + (dlY + a) + ")" + "]");
    }

    void transliraj(int dx, int dy) {
        dlX += dx;
        dlY += dy;
    }

}
