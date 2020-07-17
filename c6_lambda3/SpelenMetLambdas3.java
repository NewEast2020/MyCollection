package c6_lambda3;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class SpelenMetLambdas3 {
    public static void main(String[] args) {
        Appel groeneZwareAppel  = new Appel("groen", 200);
        Appel rodeZwareAppel    = new Appel("rood", 200);
        Appel groeneLichteAppel = new Appel("groen", 100);
        Appel rodeLichteAppel   = new Appel("rood", 100);
        Appel geleAppel         = new Appel("geel", 150);

        speelMetToString(rodeZwareAppel, groeneLichteAppel);

        Predicate<Appel> regelGroen = appel -> "groen".equals(appel.getKleur());  // regel om te testen of de appel groen is.
        Predicate<Appel> regel150Gram = appel -> appel.getGewicht() > 150;   // regel om te testen of de appel zwaarder is dan 150 gram.

        testPredicateFunctionalInterface(rodeZwareAppel, groeneLichteAppel, rodeLichteAppel, regelGroen, regel150Gram);

        List<Appel> appels = new ArrayList<>();
        appelsAdd(groeneZwareAppel, rodeZwareAppel, groeneLichteAppel, rodeLichteAppel, geleAppel, appels);

        filterListAppelMetforLoop(appels);

        spelenMet_appels_stream_filter_forEach(regelGroen, regel150Gram, appels);

        spelenMet_appels_stream_collect(appels);

        spelenMet_appels_stream_map_collect(appels);

        spelenMetDuplicatesVerwijderen(appels);
    }

    private static void spelenMet_appels_stream_map_collect(List<Appel> appels) {
        System.out.println("spelenMet_appels_stream_map_collect()");
        List <String> list = appels.stream()
                            .map(Appel::getKleur)
                            .collect(Collectors.toList());
        System.out.println("kleuren van de appels: " + list);
        System.out.println();
    }

    private static void spelenMet_appels_stream_collect(List<Appel> appels) {
        System.out.println("spelenMet_appels_stream_collect()");
        int totaalGewicht = appels.stream()
                            .collect(Collectors.summingInt(Appel::getGewicht));
        System.out.println("totaalGewicht appels = " + totaalGewicht);
        System.out.println();
    }

    private static void spelenMetDuplicatesVerwijderen(List<Appel> appels) {
        System.out.println("spelenMetDuplicatesVerwijderen()");
        // create a list with duplicate of kleuren
        List <String> dupKleuren = appels.stream()
                                   .map(Appel::getKleur)
                                   .collect(Collectors.toList());
        System.out.println("duplicate kleuren: " + dupKleuren);
        System.out.println();

        Collection<String> noDupKleuren = new HashSet<>(dupKleuren);
        System.out.println("no duplicates kleuren: " + noDupKleuren);
        System.out.println();

        Set<Integer> waarden = new HashSet<>(asList(1,2,3,4,1,2,6,7,3,2,5));
        System.out.println("no duplicates waarden: " + waarden.toString());
        System.out.println();
    }

    private static void appelsAdd(Appel groeneZwareAppel, Appel rodeZwareAppel, Appel groeneLichteAppel, Appel rodeLichteAppel,Appel geleAppel, List<Appel> appels) {
        appels.add(groeneLichteAppel);
        appels.add(rodeLichteAppel);
        appels.add(groeneZwareAppel);
        appels.add(rodeZwareAppel);
        appels.add(geleAppel);
    }

    private static void speelMetToString(Appel rodeZwareAppel, Appel groeneLichteAppel) {
        System.out.println("SpeelMetToString");
        System.out.println( "     " + groeneLichteAppel);
        System.out.println( "     " + rodeZwareAppel);
        System.out.println();
    }

    private static void filterListAppelMetforLoop(List<Appel> appels) {
        System.out.println("FilterListAppelMetforLoop()");
        for (Appel appel : appels) {
            if (appel.getGewicht() > 150 && appel.getKleur().equals("groen")) {
                System.out.println("     " + appel);
            }
        }
        System.out.println();
    }

    private static void testPredicateFunctionalInterface(Appel rodeZwareAppel, Appel groeneLichteAppel, Appel rodeLichteAppel, Predicate<Appel> regelGroen, Predicate<Appel> regel150Gram) {
        System.out.println("TestPredicateFunctionalInterface()");
        System.out.println("     rodeLichteAppel (100) > 150 g: " + regel150Gram.test(rodeLichteAppel));
        System.out.println("     rodeZwareAppel (200) > 150 g: " + regel150Gram.test(rodeZwareAppel));
        System.out.println("     rodeLichteAppel is groen: " + regelGroen.test(rodeLichteAppel));
        System.out.println("     groenLichteAppel is groen: " + regelGroen.test(groeneLichteAppel) );
        System.out.println();
    }

    private static void spelenMet_appels_stream_filter_forEach(Predicate<Appel> regelGroen, Predicate<Appel> regel150Gram, List<Appel> appels) {
        System.out.println("SpelenMet_appels_stream()");
        System.out.println("Met streams (GEEN OCA; wel waar je lambda's oa voor gebruikt");
        System.out.println(" === appels.stream 1 :  .filter(regel150Gram)");
        appels.stream()
                .filter(regel150Gram)
                .filter(regelGroen)
                .forEach(appel -> System.out.println(appel));
        System.out.println();

        System.out.println(" === appels.stream 2 ; .filter(appel -> appel.getGewicht() <= 100)");
        // in praktijk:
        appels.stream()
                .filter(appel -> appel.getGewicht() <= 100)
                .filter(appel -> appel.getKleur().equals("rood"))
                .forEach(System.out::println); // method reference is de super abstrace manier (gelukkig heb je IntelliJ hiervoor
        System.out.println();

        System.out.println(" === appels.stream 3:  .filter(appel -> appel.isLichterDan(101)) ");
        // in praktijk:
        appels.stream()
                .filter(appel -> appel.isLichterDan(101))
                .filter(appel -> appel.isKleur("rood"))
                .forEach(System.out::println);
        System.out.println();

        System.out.println(" === appels.stream 4");
        appels.stream()
                .filter(appel -> appel.isZwaarderDan(130))
                .filter(appel -> appel.isKleur("rood"))
                .forEach(System.out::println); // method reference is de super abstrace manier (gelukkig heb je IntelliJ hiervoor
        System.out.println();

        System.out.println(" === appels.stream 5 : .filter(appel -> appel.isKleur(groen))");
        appels.stream()
                .filter(appel -> appel.isKleur("groen"))
                .forEach(System.out::println);
        System.out.println();

        System.out.println(" === appels.stream 6 : .filter(appel -> appel.isZwaarderDan(50))");
        appels.stream()
                .filter(appel -> appel.isZwaarderDan(50))
                .forEach(System.out::println);
        System.out.println();
    }
}
/* output
SpeelMetToString
     Mijn appel is groen van kleur en weegt 100 gram.
     Mijn appel is rood van kleur en weegt 200 gram.

TestPredicateFunctionalInterface()
     rodeLichteAppel (100) > 150 g: false
     rodeZwareAppel (200) > 150 g: true
     rodeLichteAppel is groen: false
     groenLichteAppel is groen: true

FilterListAppelMetforLoop()
     Mijn appel is groen van kleur en weegt 200 gram.

SpelenMet_appels_stream()
Met streams (GEEN OCA; wel waar je lambda's oa voor gebruikt
 === appels.stream 1 :  .filter(regel150Gram)
Mijn appel is groen van kleur en weegt 200 gram.

 === appels.stream 2 ; .filter(appel -> appel.getGewicht() <= 100)
Mijn appel is rood van kleur en weegt 100 gram.

 === appels.stream 3:  .filter(appel -> appel.isLichterDan(101))
Mijn appel is rood van kleur en weegt 100 gram.

 === appels.stream 4
Mijn appel is rood van kleur en weegt 200 gram.

 === appels.stream 5 : .filter(appel -> appel.isKleur(groen))
Mijn appel is groen van kleur en weegt 100 gram.
Mijn appel is groen van kleur en weegt 200 gram.

 === appels.stream 6 : .filter(appel -> appel.isZwaarderDan(50))
Mijn appel is groen van kleur en weegt 100 gram.
Mijn appel is rood van kleur en weegt 100 gram.
Mijn appel is groen van kleur en weegt 200 gram.
Mijn appel is rood van kleur en weegt 200 gram.
Mijn appel is geel van kleur en weegt 150 gram.

spelenMet_appels_stream_collect()
totaalGewicht appels = 750

spelenMet_appels_stream_map_collect()
kleuren van de appels: [groen, rood, groen, rood, geel]

spelenMetDuplicatesVerwijderen()
duplicate kleuren: [groen, rood, groen, rood, geel]

no duplicates kleuren: [geel, rood, groen]

no duplicates waarden: [1, 2, 3, 4, 5, 6, 7]
 */