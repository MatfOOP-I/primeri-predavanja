package rs.math.oop.g16.p02.ispitivanjeTipaInterfejs;

import java.util.Scanner;

public class DobijanjeZaglavljaKlaseInterfejsa {

   public static void zaglavlje(String imeKlase) throws ClassNotFoundException {
      Class<?> klasniTip = Class.forName(imeKlase);
      System.out.println((klasniTip.isInterface() ? "interface " : "class ") + imeKlase);
      Class<?> roditelj = klasniTip.getSuperclass();
      if (roditelj != null)
         System.out.println("extends " + roditelj.getName());

      Class<?>[] interfaces = klasniTip.getInterfaces();
      if(interfaces.length>0) {
         if(klasniTip.isInterface())
            System.out.print("extends ");
         else
            System.out.print("implements ");
         for (int i = 0; i < interfaces.length; ++i)
            System.out.print(interfaces[i].getName()+((i<interfaces.length-1)?", ":""));
         System.out.println();
      }
   }

   public static void main(String[] args) {
      String ime;
      if (args.length > 0)
         ime = args[0];
      else {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter class or interface ime (e.g. java.lang.String): ");
         ime = in.next();
         in.close();
      }
      try{
         zaglavlje(ime);
      }
      catch (ClassNotFoundException e)
      {
         e.printStackTrace();
         return;
      }
   }

}
