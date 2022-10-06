package rs.math.oop.g02.p01.klaseObjekti;

class StudentPokretanje {
    // улазна тачка програма
    public static void main(String[] args) {
        Student prvi = new Student();
        prvi.ime = "Марко Илић";
        prvi.brojIndeksa = 243;
        prvi.naBudzetu = false;

        Student drugi;
        drugi = new Student();
        drugi.ime = "�?на Сарић";
        drugi.brojIndeksa = 25;
        drugi.naBudzetu = true;

        prvi.stampajPodatke();
        drugi.stampajPodatke();
    }
}