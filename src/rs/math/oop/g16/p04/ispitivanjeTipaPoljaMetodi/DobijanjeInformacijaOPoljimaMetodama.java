package rs.math.oop.g16.p04.ispitivanjeTipaPoljaMetodi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class DobijanjeInformacijaOPoljimaMetodama {

   public static void prikaziPolja(Class<?> cl) {
      Field[] fields = cl.getDeclaredFields();
      for (Field f : fields) {
         Class<?> type = f.getType();
         String ime = f.getName();
         System.out.print("   ");
         String modifiers = Modifier.toString(f.getModifiers());
         if (modifiers.length() > 0)
            System.out.print(modifiers + " ");
         System.out.println(type.getName() + " " + ime + ";");
      }
   }

   public static void prikaziKonstruktore(Class<?> cl) {
      Constructor<?>[] constructors = cl.getDeclaredConstructors();
      for (Constructor<?> c : constructors) {
         String ime = c.getName();
         System.out.print("   ");
         String modifiers = Modifier.toString(c.getModifiers());
         if (modifiers.length() > 0)
            System.out.print(modifiers + " ");
         System.out.print(ime + "(");
         // print parameter types
         Class<?>[] paramTypes = c.getParameterTypes();
         for (int j = 0; j < paramTypes.length; j++) {
            if (j > 0)
               System.out.print(", ");
            System.out.print(paramTypes[j].getName());
         }
         System.out.println(");");
      }
   }

   public static void prikaziMetode(Class<?> cl) {
      Method[] methods = cl.getDeclaredMethods();
      for (Method m : methods) {
         Class<?> retType = m.getReturnType();
         String ime = m.getName();
         System.out.print("   ");
         // print modifiers, return type and method ime
         String modifiers = Modifier.toString(m.getModifiers());
         if (modifiers.length() > 0)
            System.out.print(modifiers + " ");
         System.out.print(retType.getName() + " " + ime + "(");
         // print parameter types
         Class<?>[] paramTypes = m.getParameterTypes();
         for (int j = 0; j < paramTypes.length; j++) {
            if (j > 0)
               System.out.print(", ");
            System.out.print(paramTypes[j].getName());
         }
         System.out.println(");");
      }
   }

   public static void main(String[] args) {
      // read class ime from command line args or user input
      String ime;
      if (args.length > 0)
         ime = args[0];
      else {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter class ime (e.g. java.lang.String): ");
         ime = in.next();
         in.close();
      }
      try {
         // print class ime and superclass ime (if != Object)
         Class<?> klasa = Class.forName(ime);
         Class<?> nadklasa = klasa.getSuperclass();
         String modifiers = Modifier.toString(klasa.getModifiers());
         if (modifiers.length() > 0)
            System.out.print(modifiers + " ");
         System.out.print("class " + ime);
         if (nadklasa != null && nadklasa != Object.class)
            System.out.print(" extends " + nadklasa.getName());
         Class<?>[] interfaces = klasa.getInterfaces();
         System.out.println((interfaces.length > 0) ? " implements " : "");
         for (int i = 0; i < interfaces.length; ++i) {
            System.out.println(interfaces[i].getName() + ((i != interfaces.length - 1) ? ", " : ""));
         }
         System.out.print("\n{\n");
         prikaziPolja(klasa);
         System.out.println();
         prikaziKonstruktore(klasa);
         System.out.println();
         prikaziMetode(klasa);
         System.out.println("}");
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      }
      System.exit(0);
   }

}
