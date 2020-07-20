package c34_overloading2;

public class Overloading2 {
    public static void main(String[] args) {
//        double getal10 = 10.5;
        // Hier zitten we in de static omgeving, geen OO!!
        toonSpelregels(); // De 100 regels uitleg zijn nu verplaats naar de methode. Deze methode heeft geen parameters, dus ik mag geen argumenten mee te sturen.

        short delen = 12; // short of int, geen probleem, maar GEEN long
        int nogEenBerekening = delen; // delen is geen methode, want er staan geen haakjes achter => Dus een variabele

        int berekening = vermenigvuldig(12, 15.4);  // berekening is de naam van de int variabele
        // en die wordt gevuld door het aanroepen van de methode vermenigvuldig
        System.out.println(berekening);

        int getal = 12;
        if (groterDanVijf(getal)) { // groterDanVijf is een methode aanroep, want daarachter staan haakjes met daartussen 1 argument
            System.out.println(getal + " is groter dan vijf.");
        } else {
            System.out.println(getal + " is kleiner dan vijf.");
        }
    }

    static boolean groterDanVijf(int getal) { // methode variabele mag dezelfde naam hebben, hoeft niet
        boolean groterDanVijf = getal > 5;
        return groterDanVijf;
//        return getal > 5; // Dit is de kortere notatie
    }

    static int vermenigvuldig(int getal1, double getal2) { // parameters zijn altijd declaraties van method variabelen
        double vermenigvuldiging = getal1 * getal2;
        int uitkomst = (int)vermenigvuldiging; // double past niet in een int, maar we mogen casten. (int) ervoor => casten naar int
        return uitkomst;

        // Dit kan ook zo in 1 regel
//        return (int)(getal1 * getal2); // getal1 * getal2 => int * double, dat levert een double op en dus geen int
    }

    static void toonSpelregels() { // parameters zijn altijd declaraties van method variabelen
        // ruimte voor mijn spelregels
        System.out.println("Introductie van mijn spel");
        System.out.println("Met 100 regels uitleg");
    }

    // Stappenplan methode aanmaken:
    // static of (niet static) => non access modifier
    // zichtbaarheid(public, protected, (default, maar dit typ je niet), private) => access modifiers (toegankelijkheid of zichtbaarheid)
    // returntype(primitive, object(naam v/d class), niets => void)
    // naamMethode
    // (parameterlijst (die mag natuurlijk leeg zijn, dus 0 of meer parameters)) => altijd tussen haken
    //      parameters zijn altijd declaraties van method variabelen
    // {}

    void naamMethode(String tekst) {
        // statements
        ; // heeeel klein statement
    }
}
/* output
Introductie van mijn spel
Met 100 regels uitleg
184
12 is groter dan vijf.
 */