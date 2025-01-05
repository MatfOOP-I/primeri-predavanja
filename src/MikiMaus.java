public class MikiMaus {

    public static void main(String[] komandnaLinija) {
        float x = 3.14E2F;
        float y = ++x;
        if (x + 10 > 300)
            x++;
        String мики = "Мики Маус";
        Прикажи(мики);
        char[] slova = { '\u0040', ' ', 'ш', '\t', '\u0161' };
        Прикажи(new String(slova));
        String s = "\u0040 ш\t\u0161\tново:\u3232";
        Прикажи(new String(s));
    }

    private static void Прикажи(String мики) {
        System.out.println(мики);
    }
}
