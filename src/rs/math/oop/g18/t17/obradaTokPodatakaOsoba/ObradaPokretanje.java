package rs.math.oop.g18.t17.obradaTokPodatakaOsoba;

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;
import static java.util.Comparator.comparing;

public class ObradaPokretanje {
    public static void prikaziOsobe(final String poruka, final List<Osoba> osobe) {

        System.out.println(poruka);
        osobe.forEach(System.out::println);
    }

    public static void main(String[] args) {
        final List<Osoba> ljudi = Arrays.asList(
                new Osoba("John", 20),
                new Osoba("Sara", 21),
                new Osoba("Jane", 21),
                new Osoba("Greg", 35));

        {
            System.out.println("//" + "START:AGE_ASCEND_OUTPUT");
            List<Osoba> poUzrastuOpadajuce = ljudi.stream()
                    .sorted((osoba1, osoba2) -> osoba1.uzrastRazlika(osoba2)).collect(toList());
            prikaziOsobe("Sorted in ascending order by age: ", poUzrastuOpadajuce);
            System.out.println("//" + "END:AGE_ASCEND_OUTPUT");
        }

        {
            System.out.println("//" + "START:AGE_ASCEND_MR_OUTPUT");
            List<Osoba> poUzrastuOpadajuce = ljudi.stream().sorted(Osoba::uzrastRazlika).collect(toList());

            prikaziOsobe("Sorted in ascending order by age: ", poUzrastuOpadajuce);
            System.out.println("//" + "END:AGE_ASCEND_MR_OUTPUT");
        }

        {
            System.out.println("//" + "START:AGE_DESCEND_OUTPUT");
            prikaziOsobe("Sorted in descending order by age: ",
                    ljudi.stream().sorted((osoba1, osoba2) -> osoba2.uzrastRazlika(osoba1))
                            .collect(toList()));
            System.out.println("//" + "END:AGE_DESCEND_OUTPUT");

            System.out.println("//" + "START:REVERSE_ORDER_OUTPUT");
            Comparator<Osoba> uporediOpadajuce = (osoba1, osoba2) -> osoba1.uzrastRazlika(osoba2);
            Comparator<Osoba> uporediRastuce = uporediOpadajuce.reversed();

            prikaziOsobe("Sorted in ascending order by age: ",
                    ljudi.stream().sorted(uporediOpadajuce).collect(toList()));
            prikaziOsobe("Sorted in descending order by age: ",
                    ljudi.stream().sorted(uporediRastuce).collect(toList()));
            System.out.println("//" + "END:REVERSE_ORDER_OUTPUT");

            System.out.println("//" + "START:NAME_ASCEND_OUTPUT");
            prikaziOsobe("Sorted in ascending order by ime: ", ljudi.stream()
                    .sorted((osoba1, osoba2) -> osoba1.uzmiIme().compareTo(osoba2.uzmiIme()))
                    .collect(toList()));
            System.out.println("//" + "END:NAME_ASCEND_OUTPUT");
        }

        {
            System.out.println("//" + "START:YOUNGEST_OUTPUT");
            ljudi.stream().min(Osoba::uzrastRazlika)
                    .ifPresent(najmladji -> System.out.println("Youngest: " + najmladji));
            System.out.println("//" + "END:YOUNGEST_OUTPUT");
        }

        {
            System.out.println("//" + "START:ELDEST_OUTPUT");
            ljudi.stream().max(Osoba::uzrastRazlika)
                    .ifPresent(najstariji -> System.out.println("Eldest: " + najstariji));
            System.out.println("//" + "END:ELDEST_OUTPUT");
        }

        {
            ljudi.stream().sorted((osoba1, osoba2) -> osoba1.uzmiIme().compareTo(osoba2.uzmiIme()));

            prikaziOsobe("Sorted in ascending order by ime: ", ljudi.stream()
                    .sorted(comparing((Osoba osoba) -> osoba.uzmiIme())).collect(toList()));

            final Function<Osoba, String> byName = osoba -> osoba.uzmiIme();
            ljudi.stream().sorted(comparing(byName));
        }

        {
            System.out.println("//" + "START:SORT_NAME_AND_AGE_OUTPUT");

            final Function<Osoba, Integer> poUzrastu = osoba -> osoba.uzmiUzrast();
            final Function<Osoba, String> poImenu = osoba -> osoba.uzmiIme();

            prikaziOsobe("Sorted in ascending order by age and ime: ", ljudi.stream()
                    .sorted(comparing(poUzrastu).thenComparing(poImenu)).collect(toList()));
            System.out.println("//" + "END:SORT_NAME_AND_AGE_OUTPUT");
        }
    }
}
