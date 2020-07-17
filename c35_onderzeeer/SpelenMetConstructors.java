package c35_onderzeeer;

public class SpelenMetConstructors {
    public static void main(String[] args) {
//        Onderzeeer onderzeeer = new Onderzeeer();
//        onderzeeer.naam = "Walrus";
//        onderzeeer.kleur = "Geel";
//        onderzeeer.tonnage = 12789;

        System.out.println("call 1: new Onderzeeer(USS Holland, Oranje, 273894);");
        Onderzeeer onderzeeerHolland = new Onderzeeer("USS Holland", "Oranje", 273894);
        System.out.println("onderzeeerHolland.naam: " + onderzeeerHolland.naam);
        System.out.println(" ");


        System.out.println("call 2: new Onderzeeer(Turtle, 78234789);" );

        Onderzeeer onderzeeerTurtle = new Onderzeeer("Turtle", 78234789);
        System.out.println("onderzeeerTurtle.kleur: " + onderzeeerTurtle.kleur);
        System.out.println(" ");


        System.out.println("Even de no argument constructor gebruiken");
        System.out.println("call 3: new Onderzeeer();");
        new Onderzeeer();
    }
}
/*
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
