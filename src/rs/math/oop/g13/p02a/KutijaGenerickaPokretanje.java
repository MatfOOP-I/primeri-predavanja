package rs.math.oop.g13.p02a;

public class KutijaGenerickaPokretanje
{
    public static void main(String[] args) {
        KutijaGenericka<String> kutija1 = new KutijaGenericka<String>();
        kutija1.postaviVrednost("Текст");
        System.out.println(kutija1);
        KutijaGenericka<Integer> kutija2 = new KutijaGenericka<>();
        kutija2.postaviVrednost(45);
        System.out.println(kutija2);
        KutijaGenericka<KutijaGenericka<String>> kutija3 = new KutijaGenericka<>();
        kutija3.postaviVrednost(kutija1);
        System.out.println(kutija3);
        kutija1.postaviVrednost("Miki Maus");
        System.out.println(kutija3);
        kutija3.uzmiVrednost().postaviVrednost("Paja Patak");
        System.out.println(kutija3);
        System.out.println(kutija1);
    }
}
