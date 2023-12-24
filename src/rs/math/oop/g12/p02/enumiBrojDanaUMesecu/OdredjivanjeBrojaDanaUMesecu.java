package rs.math.oop.g12.p02.enumiBrojDanaUMesecu;

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
            int brojDana = 0;
            switch (mesec) {
            case APRIL: case JUN: case SEPTEMBAR: case NOVEMBAR:
                brojDana = 30;
                break;
            case JANUAR:case MART: case MAJ: case JUL:
                case AVGUST: case OKTOBAR: case DECEMBAR:
                    brojDana=31;
                    break;
            case FEBRUAR:
                if (((godina % 4 == 0 && godina % 100 != 0)
                        || (godina % 400 == 0)) && godina > 1582)
                    brojDana = 29;
                else
                    brojDana = 28;
                break;
            }
            System.out.printf("Број дана у месецу %s године %d је %d.", 
                    mesec, godina, brojDana);
        } catch (IllegalArgumentException ex) {
            System.err.printf("Грешка при парсирању месеца са називом '%s'.",
                    args[0]);
            System.err.println(ex.getMessage());
        }
    }
}
