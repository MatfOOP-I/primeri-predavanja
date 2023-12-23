package rs.math.oop.g14.p06.hesKod;

public class UredjeniParUporediv<S, T> extends UredjeniPar<S, T>{

	public UredjeniParUporediv(S vrednost1, T vrednost2) {
		super(vrednost1, vrednost2);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true; // исти објекат (иста референца)
		if(obj==null)
			return false; // не може никако бити исто, јер this није null
		// ако аргумент није уређени пар онда сигурно нису исти
		if(!(obj instanceof UredjeniParUporediv))
			return false;
		UredjeniParUporediv par = (UredjeniParUporediv)obj;
		// исти су само ако им је и свака координата иста
		return uzmiVrednost1().equals(par.uzmiVrednost1()) &&
				uzmiVrednost2().equals(par.uzmiVrednost2());
	}
	
	@Override
	public int hashCode() {
		int hash = 1;
	    hash = 31 * hash 
	    		+ (uzmiVrednost1() == null ? 0 : uzmiVrednost1().hashCode());
	    hash = 31 * hash 
	    		+ (uzmiVrednost2() == null ? 0 : uzmiVrednost2().hashCode());
	    return hash;
	}

	public static void main(String[] args) {
		UredjeniParUporediv<Integer, Double> par1 = 
				new UredjeniParUporediv<Integer, Double>(30, 6.74);
		UredjeniParUporediv<Integer, Double> par2 = 
				new UredjeniParUporediv<Integer, Double>(30, 6.74);
		UredjeniParUporediv<String, Double> par3 = 
				new UredjeniParUporediv<String, Double>("30", 6.74);
		System.out.println("Поредим "+par1+" и "+par1);
		System.out.println(par1.equals(par1));
		System.out.println("Хеш кодови: "+par1.hashCode()
			+" и "+par1.hashCode());
		System.out.println("Поредим "+par1+" и "+par2);
		System.out.println(par1.equals(par2));
		System.out.println("Хеш кодови: "+par1.hashCode()
			+" и "+par2.hashCode());
		System.out.println("Поредим "+par1+" и "+par3);
		System.out.println(par1.equals(par3));
		System.out.println("Хеш кодови: "+par1.hashCode()
			+" и "+par3.hashCode());
	}
}
