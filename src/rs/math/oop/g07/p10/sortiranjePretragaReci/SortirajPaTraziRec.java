package rs.math.oop.g07.p10.sortiranjePretragaReci;

public class SortirajPaTraziRec {

	public static void main(String[] args) {
		String tekst = "Као што се може видети, низ brojPojava чува вредности "
                + "броја појава за сваки од бројева из интервала. "
                + "Стога је тип компоненте низа целобројни тип, "
                + "а број елемената низа је иницијално датом одређен "
                + "дужином интервала granica.";
        // раздвајамо речи на основу празног места
        String[] reci = tekst.split(" ");
        for(int i=0; i<reci.length; i++) {
        	// у мала слова, потом уклањамо евентуалне белине на крајевима 
        	// и уклањамо заостале зарезе и тачке
        	reci[i] = reci[i].toLowerCase().trim().replace(",","").replace(".","");
        }
        // сортирамо уграђеним сорт алгоритмом (користи се merge-sort)
        // пошто има гарантовану O(n*logn) сложеност и притом је стабилан
        java.util.Arrays.sort(reci);
        System.out.println("Сортирани низ речи:"
        		+System.lineSeparator()+"--------------------");
        for(String rec: reci)
        	System.out.println(rec);
        System.out.println("--------------------");
        
        // сада петља са уносом и претрагом унете речи
        java.util.Scanner skener = new java.util.Scanner(System.in);
        while(true) {
        	System.out.println("Унесите реч за претрагу: ");
        	String rec = skener.next();
        	if(rec.equals("КРАЈ"))
        		break;
        	// одговорност је програмера да се претрази проследи сортиран низ
        	// у супротном ће понашање претраге бити недефинисано, 
        	// можда се пронађе реч, а можда и не
        	int pozicija = java.util.Arrays.binarySearch(reci, rec);
        	if(pozicija >= 0)
        		System.out.println("Пронађена реч на позицији "  + pozicija + ".");
        	else
        		System.out.println("Није пронађена реч. Враћена је вредност "
						+ pozicija + ".");
        }
        skener.close();
	}
}
