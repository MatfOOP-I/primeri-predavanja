package rs.math.oop.g08.p11a.statickiMetod;

public class A {

    int polje1 = 42;
    static int polje2;

    int metod1()
    {
        return polje1;
    }


    static int metod2(){
        return polje2;
    }

    static int metod3(){
        //return polje1;
        A aProm = new A();
        return aProm.polje1;
    }

    public static void main(String... argumenti){
        System.out.println( A.metod3() );
    }

}
