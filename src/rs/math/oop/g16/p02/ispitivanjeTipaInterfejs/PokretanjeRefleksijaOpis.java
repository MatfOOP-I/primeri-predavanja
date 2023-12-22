package rs.math.oop.g16.p02.ispitivanjeTipaInterfejs;

public class PokretanjeRefleksijaOpis {

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
      try
      {
         String punoImeKlase = "java.lang.String";
         if(args.length>0){
            punoImeKlase = args[0];
         }
         zaglavlje(punoImeKlase);
      }
      catch (ClassNotFoundException e)
      {
         e.printStackTrace();
         return;
      }
   }

}
