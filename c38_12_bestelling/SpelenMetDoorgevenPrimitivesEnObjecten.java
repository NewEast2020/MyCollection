package c38_12_bestelling;

import java.util.ArrayList;
import java.util.List;

//        Doorgeven van primitives & objecten
//        import java.util.*; // met .* alles uit de package java.util
public class SpelenMetDoorgevenPrimitivesEnObjecten {

    static public void main(String ... argumenten) { // geldige psvm
        Bestelling bestelling = new Bestelling();
        bestelling.items.add("Hamburger");
        bestelling.items.add("Frites");
        bestelling.items.add("Fritesaus");
        System.out.println(bestelling.items);
        System.out.println(bestelling);

        int aantalKerenBestellen = 10;
        System.out.println("aantal " + aantalKerenBestellen);

//        verwerkBestelling(bestelling, aantalKerenBestellen); // kopie van de waarden wordt meegegeven.
        aantalKerenBestellen = verwerkBestelling(bestelling, aantalKerenBestellen); // kopie van de waarden wordt meegegeven.

        System.out.println();
        System.out.println("De grote vraag: Wat staat er nu in de bestelling en wat staat er in aantalKerenBestellen");
        System.out.println(bestelling.items);
        System.out.println("aantal " + aantalKerenBestellen);
    }

    private static int verwerkBestelling(Bestelling bestelling, int aantalKerenBestellen) {
                                         // kopie wordt hier opgeslagen in de lokale methode variabelen
        aantalKerenBestellen = 20; // Dit is echt een andere variabele met de KOPIE van de waarde 10,
                                   // maar deze wordt nu overschreven met 20
        // bestelling = new Bestelling();     // Dit zorgt ervoor dat ik NIET meer verwijs
                                              // naar de bestelling die ik heb binnengekregen
        bestelling.items = new ArrayList<>(); // Door deze regel krijg ik een nieuwe lijst binnen mijn bestelling
        bestelling.items.add("McKroket");
        System.out.println("Zit nu nu in de methode!!!");
        System.out.println(bestelling.items);
        System.out.println("aantal in methode: " + aantalKerenBestellen);
        return aantalKerenBestellen;
    }
}

class Bestelling {
    List<String> items = new ArrayList<>();
}
/* output
[Hamburger, Frites, Fritesaus]
demo.Bestelling@28d93b30
aantal 10
Zit nu nu in de methode!!!
[McKroket]
aantal in methode: 20

De grote vraag: Wat staat er nu in de bestelling en wat staat er in aantalKerenBestellen
[McKroket]
aantal 20
 */