package rs.math.oop.g08.p14.polimorfizam;

class Ljubimac{
    public void trci(){
        System.out.println("Неки љубимци не могу да трче!");
    }
}
class Macka extends Ljubimac{
    public void trci(){
        System.out.println("Мачка трчи елегантно и гипко!");
    }
}

class Pas extends Ljubimac{
    public void trci(){
        System.out.println("Пас трчи брзо и скоковито!");
    }
}

class TestLjubimac{
    public static void main(String args[]){
        Ljubimac zuca = new Pas();
        Ljubimac maca = new Macka();
        Ljubimac kornjaca = new Ljubimac();
        zuca.trci();
        maca.trci();
        kornjaca.trci();
    }
}
