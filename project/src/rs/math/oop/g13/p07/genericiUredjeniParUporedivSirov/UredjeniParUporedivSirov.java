package rs.math.oop.g13.p07.genericiUredjeniParUporedivSirov;

// због ограничења на тип уместо класом Object сва појављивања типа се замењују 
// негенеричким интерфејсом Comparable
public class UredjeniParUporedivSirov implements Comparable{
        private Comparable vrednost1;
        private Comparable vrednost2;

        public UredjeniParUporedivSirov(Comparable vrednost1, 
                Comparable vrednost2) {
            this.vrednost1 = vrednost1;
            this.vrednost2 = vrednost2;
        }
        
        public Comparable getVrednost1() {
            return vrednost1;
        }
        
        public Comparable getVrednost2() {
            return vrednost2;
        }
        
        @Override
        public String toString() {
            return "("+vrednost1+", "+vrednost2+")";
        }

        @Override
        public int compareTo(Object o) {
            // поређење је гарантовано и у овој варијанти једино што оно
            // није реализовано кроз генеричку compareTo методу
            UredjeniParUporedivSirov par = (UredjeniParUporedivSirov) o;
            int uredjenjeS = this.vrednost1.compareTo(par.vrednost1);
            if(uredjenjeS!=0)
                return uredjenjeS;
            return this.vrednost2.compareTo(par.vrednost2);
        }
}