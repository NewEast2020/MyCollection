package c35_onderzeeer;

class Onderzeeer {
    Onderzeeer(String naam, String kleur, int tonnage) {
        System.out.println(" === Onderzeeer1 : naam = " + naam + ", kleur = " + kleur + ", tonnage = " + tonnage);
        this.naam = naam;
        this.kleur = kleur;
        this.tonnage = tonnage;
        System.out.println("Alles gevuld");
    }

    // Dit is een overloaded constructor
    Onderzeeer(String naam, int tonnage) {
        this(naam, "Onbekend", tonnage); // this(..) => aanroepen van een andere constructor
        // this() => is de aanroep v/e constructor en mag je alleen gebruiken binnen een constructor.
        // Pas op voor kringverwijzingen!!!
        System.out.println("  === Onderzeer2 : naam = " + naam + ", tonnage = " + tonnage);
    }

    // Dit is een overloaded constructor
    Onderzeeer(String naam, String kleur) {
        this(naam, kleur, 0);
        System.out.println(" === Onderzeeer 3 : naam = " + naam + ", kleur = " + kleur);
    }

    // Dit is een overloaded constructor
    Onderzeeer() {
        this("Nog geen naam", "Onbekend"); // als je this() gebruikt MOET het het 1e statement zijn
        System.out.println(" === Onderzeeer 4 : Geen argumenten");
    }

    // Zodra je een eigen constructor aanmaakt, verdwijnt de default constructor (altijd zonder argumenten).
    //    public Onderzeeer() {
    //                         Dit is eigenlijk de default constructor.
    //                         Hij staat er niet,
    //                         maar is er wel.
    //    }

    String naam; // volgorde van members in een class maakt niet uit voor het kunnen aanroepen/gebruiken.
    String kleur;
    int tonnage;
}

/* output
call 1: new Onderzeeer(USS Holland, Oranje, 273894);
 === Onderzeeer1 : naam = USS Holland, kleur = Oranje, tonnage = 273894
Alles gevuld
onderzeeerHolland.naam: USS Holland

call 2: new Onderzeeer(Turtle, 78234789);
 === Onderzeeer1 : naam = Turtle, kleur = Onbekend, tonnage = 78234789
Alles gevuld
  === Onderzeer2 : naam = Turtle, tonnage = 78234789
onderzeeerTurtle.kleur: Onbekend

Even de no argument constructor gebruiken
call 3: new Onderzeeer();
 === Onderzeeer1 : naam = Nog geen naam, kleur = Onbekend, tonnage = 0
Alles gevuld
 === Onderzeeer 3 : naam = Nog geen naam, kleur = Onbekend
 === Onderzeeer 4 : Geen argumenten
 */