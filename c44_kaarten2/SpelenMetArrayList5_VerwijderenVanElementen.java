package c44_kaarten2;

import java.util.ArrayList;
import java.util.List;

public class SpelenMetArrayList5_VerwijderenVanElementen {

    public static void main(String[] args) {
        List<String> namen = new ArrayList<>();
        namen.add("Kees");
        namen.add("Karel");
        namen.add("Katrien");
        System.out.println(namen);

        List<String> nieuweNamenLijst = new ArrayList<>();
        String naam = namen.get(0);
        nieuweNamenLijst.add(naam);
        String remove = namen.remove(0);  // remove op  index geeft een element uit de lijst terug
        boolean pieter = namen.remove("Pieter"); // remove op object geeft een boolean (true/false) terug

        System.out.println(namen);
        System.out.println(nieuweNamenLijst);

        nieuweNamenLijst.add(namen.remove(0)); // Dit is dus hetzelfde als de drie losse regels: met get tijdelijk opslaan en vervolgens toevoegen/verwijderen
        // Eerst verwijderen, dat levert een leash naar de String op en vervolgens deze toevoegen aan de lijst.
        System.out.println(namen);
        System.out.println(nieuweNamenLijst);
    }
}
/* output
[Kees, Karel, Katrien]
[Karel, Katrien]
[Kees]
[Katrien]
[Kees, Karel]
*/