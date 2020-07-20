package c34_overloading1;

public class Overloading1 {
    public static void main(String[] args) {
        // Hier zitten we in de static omgeving, geen OO!!
        toonSpelregels(); // De 100 regels uitleg zijn nu verplaats naar de methode. Deze methode heeft geen parameters, dus ik mag geen argumenten mee te sturen.
    }

    static void toonSpelregels() { // parameters zijn altijd declaraties van method variabelen
        // ruimte voor mijn spelregels
        System.out.println("Introductie van mijn spel");
        System.out.println("Met 100 regels uitleg");
    }

    // Stappenplan methode aanmaken:
    // static of (niet static) => non access modifier
    // zichtbaarheid(public, protected, (default, maar dit typ je niet), private) => access modifiers (toegankelijkheid of zichtbaarheid)
    // returntype(primitive, object, niets => void)
    // naamMethode
    // (parameterlijst (die mag natuurlijk leeg zijn, dus 0 of meer parameters)) => altijd tussen haken
    // {}

    void naamMethode(String tekst) {
        // statements
        ; // heeeel klein statement
    }
}
/* output
Introductie van mijn spel
Met 100 regels uitleg
*/