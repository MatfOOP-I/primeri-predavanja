package rs.math.oop.g08.p22.zastitaPolja;

public class KrugZasticeni {
    
    private double cx, cy, r, p, o;
    
    public KrugZasticeni(double cx, double cy, double r) {
        this.cx = cx;
        this.cy = cy;
        this.r = r;
        preracunaj();
    }
    
    private void preracunaj() {
        p = r*r*Math.PI;
        o = 2*r*Math.PI;
    }
    
    public double uzmiCx() { return cx; }
    
    public void postaviCx(double cx) { this.cx = cx; }
    
    public double uzmiCy() { return cy; }
    
    public void postaviCy(double cy) { this.cy = cy; }
    
    public double uzmiR() { return r; }
    
    public void postaviR(double r) {
        this.r = r;
        // ажурирамо изведена поља
        preracunaj();
    }
    // нпр. изведене атрибуте само узимамо, не мењамо их директно
    public double uzmiP() { return p; }
    
    public double uzmiO() { return o; }
    
    @Override
    public String toString() {
        return String.format("C=(%.2f, %.2f) r=%.2f P=%.2f O=%.2f",
                cx, cy, r, p, o);
    }
}