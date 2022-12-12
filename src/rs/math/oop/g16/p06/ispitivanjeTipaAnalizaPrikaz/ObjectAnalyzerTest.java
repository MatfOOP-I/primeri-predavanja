package rs.math.oop.g16.p06.ispitivanjeTipaAnalizaPrikaz;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class ObjectAnalyzer {
   private PovezanaLista<Object> obuhvaceni = new PovezanaLista<>();

   public String prikaz(Object obj) {
      if (obj == null)
         return "null";
      if (obuhvaceni.contains(obj))
         return "...";
      obuhvaceni.addItem(obj);
      Class<?> cl = obj.getClass();
      if (cl == String.class)
         return (String) obj;
      if (cl.isArray()) {
         StringBuilder r = new StringBuilder();
         r.append(cl.getComponentType() + "[]{");
         for (int i = 0; i < Array.getLength(obj); i++) {
            if (i > 0)
               r.append(",");
            Object val = Array.get(obj, i);
            if (cl.getComponentType().isPrimitive())
               r.append(val);
            else
               r.append(prikaz(val));
         }
         r.append("}");
         return r.toString();
      }
      StringBuilder r = new StringBuilder();
      r.append( cl.getName() );
      // inspect the fields of this class and all superclasses
      do {
         r.append( "[" );
         Field[] fields = cl.getDeclaredFields();
         AccessibleObject.setAccessible(fields, true);
         // get the names and values of all fields
         for (Field f : fields) {
            if (!Modifier.isStatic(f.getModifiers())) {
               if (!r.toString().endsWith("["))
                  r.append( "," );
               r.append( f.getName() + "=" );
               try {
                  Class<?> t = f.getType();
                  Object val = f.get(obj);
                  if (t.isPrimitive())
                     r.append( val );
                  else
                     r.append( prikaz(val) );
               } catch (Exception e) {
                  e.printStackTrace();
               }
            }
         }
         r.append( "]" );
         cl = cl.getSuperclass();
      } while (cl != null);
      return r.toString();
   }
}

public class ObjectAnalyzerTest {
   public static void main(String[] args) {
      int x = 5;
      System.out.println(new ObjectAnalyzer().prikaz(x));
      System.out.println("---");

      double x1 = 5.6;
      System.out.println(new ObjectAnalyzer().prikaz(x1));
      System.out.println("---");

      String s = "Marko Markovic";
      System.out.println(new ObjectAnalyzer().prikaz(s));
      System.out.println("---");

      Zaposleni pera = new Zaposleni("Janko Jankovic", 8_000);
      System.out.println(new ObjectAnalyzer().prikaz(pera));
      System.out.println("---");

      Manager mika = new Manager("Mika Petrovic", 8000, 4000);
      System.out.println(new ObjectAnalyzer().prikaz(mika));
      System.out.println("---");

      Pair<String> mz = new Pair<>("mika", "zika");
      System.out.println(new ObjectAnalyzer().prikaz(mz));
      System.out.println("---");

      Pair<Zaposleni> pm = new Pair<>(pera, mika);
      System.out.println(new ObjectAnalyzer().prikaz(pm));
      System.out.println("---");

      int[] niz = {1, 2, 3, 4, 5};
      System.out.println(new ObjectAnalyzer().prikaz(niz));
      System.out.println("---");

      Manager m = new Manager("Petar Petrоvic", 10_100, 0);
      m.setBonus(300);
      System.out.println(new ObjectAnalyzer().prikaz(m));
      m.setBonus(700);
      System.out.println(new ObjectAnalyzer().prikaz(m));
      System.out.println("---");

      Zaposleni[] osobe = {
            new Zaposleni("Zarko Zarkovic", 20_100),
            m,
            pera,
            m
      };
      System.out.println(new ObjectAnalyzer().prikaz(osobe));
      System.out.println("---");

      PovezanaLista<String> ll1 = new PovezanaLista<>("baba");
      ll1.addItem("zaba");
      ll1.addItem("mika");
      ll1.addItem("zika");
      System.out.println(new ObjectAnalyzer().prikaz(ll1));
      System.out.println("---");
   }
}
