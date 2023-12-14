package rs.math.oop.g11.p07c.stekPrekoListeKorisnickiIzuzetak;

public class PovezanaListaNiski {

   private class ElemenatListe {
      private String sadrzaj;
      private ElemenatListe sledeci;

      public ElemenatListe(String elem) {
         sadrzaj = elem;
         sledeci = null;
      }

      public String getSadrzaj() {
         return sadrzaj;
      }

      public void setSadrzaj(String sadrzaj) {
         this.sadrzaj = sadrzaj;
      }

      public ElemenatListe getSledeci() {
         return sledeci;
      }

      public void setSledeci(ElemenatListe sledeci) {
         this.sledeci = sledeci;
      }

      public void prikazi() {
         System.out.print("Elemenat liste: " + sadrzaj);
      }

   }

   private ElemenatListe pocetak = null;
   private ElemenatListe kraj = null;
   private ElemenatListe tekuci = null;

   public PovezanaListaNiski() {
   }

   public PovezanaListaNiski(String elem) throws ArgumentJeNullIzuzetak {
      if( elem == null)
         throw new ArgumentJeNullIzuzetak();
      tekuci = kraj = pocetak = new ElemenatListe(elem);
   }

   public PovezanaListaNiski(String[] elementi) throws ArgumentJeNullIzuzetak {
      if (elementi == null)
         throw new ArgumentJeNullIzuzetak();
      for (int i = 0; i < elementi.length; i++)
         dodajElemenatNaKraj(elementi[i]);
      tekuci = pocetak;
   }

   public void dodajElemenatNaKraj(String elem) {
      ElemenatListe noviKraj = new ElemenatListe(elem);
      if (pocetak == null)
         pocetak = kraj = noviKraj;
      else {
         kraj.setSledeci(noviKraj);
         kraj = noviKraj;
      }
   }

   public String ukloniElemenatSaKraja() throws PovezanaListaJePraznaIzuzetak {
      if (kraj == null)
         throw new PovezanaListaJePraznaIzuzetak();
      if (pocetak == kraj) {
         ElemenatListe jedini = kraj;
         pocetak = kraj = null;
         return jedini.getSadrzaj();
      }
      ElemenatListe poslednji = kraj;
      ElemenatListe pretposlednji = pocetak;
      while (pretposlednji.getSledeci() != poslednji)
         pretposlednji = pretposlednji.getSledeci();
      pretposlednji.setSledeci(null);
      kraj = pretposlednji;
      return poslednji.getSadrzaj();
   }

   public void dodajElemenatNaPocetak(String elem) {
      ElemenatListe noviPocetak = new ElemenatListe(elem);
      if (kraj == null)
         pocetak = kraj = noviPocetak;
      else {
         noviPocetak.setSledeci(pocetak);
         pocetak = noviPocetak;
      }
   }

   public String ukloniElemenatSaPocetka() throws PovezanaListaJePraznaIzuzetak {
      if (pocetak == null)
         throw new PovezanaListaJePraznaIzuzetak();
      if (pocetak == kraj) {
         ElemenatListe jedini = kraj;
         pocetak = kraj = null;
         return jedini.getSadrzaj();
      }
      ElemenatListe prvi = pocetak;
      pocetak = prvi.getSledeci();
      return prvi.getSadrzaj();
   }

   public String getPrvi() {
      tekuci = pocetak;
      return tekuci == null ? null : tekuci.getSadrzaj();
   }

   public String getSledeci() {
      if (tekuci != null)
         tekuci = tekuci.getSledeci();
      return tekuci == null ? null : tekuci.getSadrzaj();
   }

}
