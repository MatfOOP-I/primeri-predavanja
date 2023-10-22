package rs.math.oop.g13.p07.genericiUredjeniParUporedivNegenericki;

// због ограничења на тип уместо класом Object сва појављивања типа се замењују 
// сировим интерфејсом Comparable
public class UredjeniParUporedivNegenericki implements Comparable{
        private Comparable vrednost1;
        private Comparable vrednost2;

        public UredjeniParUporedivNegenericki(Comparable vrednost1, 
                Comparable vrednost2) {
            this.vrednost1 = vrednost1;
            this.vrednost2 = vrednost2;
        }
        
        public Comparable uzmiVrednost1() {
            return vrednost1;
        }
        
        public Comparable uzmiVrednost2() {
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
            UredjeniParUporedivNegenericki par = (UredjeniParUporedivNegenericki) o;
            int uredjenjeS = this.vrednost1.compareTo(par.vrednost1);
            if(uredjenjeS!=0)
                return uredjenjeS;
            return this.vrednost2.compareTo(par.vrednost2);
        }
}