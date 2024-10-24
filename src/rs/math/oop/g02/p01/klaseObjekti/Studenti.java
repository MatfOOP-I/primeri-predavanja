package rs.math.oop.g02.p01.klaseObjekti;

class Studenti {
    // улазна тачка програма
    public static void main(String[] args) {
        Student prvi = new Student();
        prvi.ime = "Марко Илић";
        prvi.brojIndeksa = 0b0011_1000;
        prvi.naBudzetu = false;

        Student drugi;
        drugi = new Student();
        drugi.ime = "Ана Сарић";
        drugi.brojIndeksa = 2_5;
        drugi.naBudzetu = true;

        prvi.stampajPodatke();
        drugi.stampajPodatke();
    }
}