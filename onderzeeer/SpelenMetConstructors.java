package onderzeeer;

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

