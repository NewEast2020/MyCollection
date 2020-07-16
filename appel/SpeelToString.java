package appel;
//      Opzet van de class Appels met een override van de toString en Encapsulation
public class SpeelToString {
    public static void main(String[] args) {
        Appel groeneZwareAppel = new Appel("groen", 200);
        Appel rodeZwareAppel = new Appel("rood", 200);
        Appel groeneLichteAppel = new Appel("groen", 100);
        Appel rodeLichteAppel = new Appel("rood", 100);

        System.out.println("Mijn appel is " + groeneLichteAppel.getKleur() + " van kleur en weegt " + groeneLichteAppel.getGewicht() + " gram.");
        System.out.println(rodeZwareAppel);
    }
}

/* output
Mijn appel is groen van kleur en weegt 100 gram.
Mijn appel is rood van kleur en weegt 200 gram.
 */