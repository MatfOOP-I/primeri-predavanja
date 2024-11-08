package rs.math.oop.g05.p01.blokovi;

public class Blokovi {
    // тело класе је блок
    public static void main(String[] args) {
        // тело методе је такође блок
        System.out.println("Здраво свете");
        {
            // пример сувишног блока који нема никакву намену
            int x=5;
            if (x < 3){
                // блок за if грану
                int y = x++;
                System.out.println(y);
            }
            System.out.println(x);
            //System.out.println(y);
            // немогућ испис вредности y, јер је y
            // деклараисана у if блоку и овде се не види
        }
         // бројачка променљива x дефинисана испод припада блоку који нема пресек
        // са блоком изнад те није у именском конфликту са променљивом x изнад
        for(int x=0; x<10; x++) {
            System.out.println(x);
            // са друге стране, ова променљива испод јесте у конфликту са 
            // бројачком променљивом x па је код испод закоментарисан 
                      // како би се компајлирао 
            //float x = 10.0f;
        }
    }
}