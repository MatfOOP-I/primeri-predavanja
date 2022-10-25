package rs.math.oop.g06.p01.standardniIspis;

public class RazlicitiIspisi {

    public static void main(String[] args) {
        System.out.print("Пример текста");
        System.out.print(" са конкатенацијом и бројем " + 4);
        System.out.println(); // испис знака за крај реда
        System.out.println(67.4);

        System.err.println("Ово је нека чудна грешка!!!");

        double x = 26.43462;
        int y = 0b100_1001_1101;
        float z = 1645.14f;
        System.out.printf("x=%9.6g y=%8d z=%.3f", x, y, z);
        System.out.println();
        // први број после % представља број места за комплетан запис, 
        // а ако нема броја онда се укупан број места рачуна аутоматски
        // број после тачке означава колико места се користи за разломљени део
        String s = "Неки текст";
        char c = 'c';
        // за испис знака % потребно је ставити дупли %%
        System.out.printf("Стринг се умеће помоћу формата %%s овако %s", s);
        // System.lineSeparator() враћа секвенцу за крај реда прилагођену ОС-у
        System.out.printf(" док се карактер умеће помоћу формата %%%c%s", c,
                System.lineSeparator());
        // могу се комбиновати различита писма
        // уместо %s и прослеђивања System.lineSeparator() може се ставити формат %n
        System.out.printf("%s\t%s%n", "КРАЈ", "ISPISA");
    }
}
