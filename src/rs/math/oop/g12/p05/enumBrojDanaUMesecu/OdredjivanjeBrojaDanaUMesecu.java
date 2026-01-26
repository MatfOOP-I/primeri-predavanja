package rs.math.oop.g12.p05.enumBrojDanaUMesecu;

public class OdredjivanjeBrojaDanaUMesecu {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Употреба: java <назив месеца> <година>");
            System.exit(-1);
        }
        // производи изузетак ако унесемо нешто што се не налази 
        // у списку назива набројивих типова
        try {
            MesecKalendarski mesec = 
                    MesecKalendarski.valueOf(args[0].toUpperCase());
            int godina = Integer.valueOf(args[1]);
            int brojDana = mesec.brojDana(godina);
            System.out.printf("Број дана у месецу '%s' године %d је %d.", 
                    mesec, godina, brojDana);
        } catch (NumberFormatException ex) {
            System.err.printf("Грешка при парсирању године %s.",
                    args[1]);
            System.err.println(ex.getMessage());
        } catch (IllegalArgumentException ex) {
            System.err.printf("Грешка при парсирању месеца са називом %s.",
                    args[0]);
            System.err.println(ex.getMessage());
        }
    }
}
