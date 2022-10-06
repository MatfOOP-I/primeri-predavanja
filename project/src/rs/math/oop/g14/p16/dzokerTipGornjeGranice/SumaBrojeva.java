package rs.math.oop.g14.p16.dzokerTipGornjeGranice;

import java.util.Arrays;
import java.util.List;
 
class SumaBrojeva {
    public static void main(String[] args)
    {
    	// погодан метод који креира листу
    	// на основу листе аргумената променљиве дужине
        List<Integer> lista1 = Arrays.asList(24, 56, 61, 7);
        System.out.println("Сума целих бројева је: " + suma(lista1));
        // слично, само са листом реалних бројева
        List<Double> lista2 = Arrays.asList(14.1, 52.1, 6.121);
        System.out.print("Сума реалних бројева је: " + suma(lista2));
    }
 
    // апстрактна класа Number је надкласа од Integer, Float, Double, ...
    private static double suma(List<? extends Number> lista)
    {
    	// радимо са double пошто је он најопштији од бројева
    	// у класи Number нису реализовани аритметички оператори
        double suma = 0.0;
        for (Number i : lista)
            suma += i.doubleValue();
        return suma;
    }
}