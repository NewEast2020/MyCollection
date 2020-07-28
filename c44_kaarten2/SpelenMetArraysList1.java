package c44_kaarten2;
import java.util.ArrayList;

//   object oriented variant
class SpelenMetArrayslist1 {

    public static void main(String[] args) {
        Kaart1 kaart1 = new Kaart1("Harten", "Aas");
        Kaart1 kaart2 = new Kaart1("Ruiten", "4");
        kaart1.toonKaart();
        kaart2.toonKaart();
        ArrayList<Kaart1> kaartspel = new ArrayList<>();
        kaartspel.add(kaart1);
        kaartspel.add(kaart2);
        kaartspel.add(new Kaart1("Ruiten","2"));
        kaartspel.add(new Kaart1("Ruiten","3"));
    }
}

class Kaart1 {
    String kleur;
    String waarde;

    Kaart1(String kleur, String waarde) {
        this.kleur = kleur;
        this.waarde = waarde;
    }

    void toonKaart() {
        System.out.println(kleur + " " + waarde);
    }
}

//        Extra uitbreiding, waarbij een kaartspel bestaat uit kaarten
class Kaart2 {
    String kleur;
    String waarde;

    Kaart2(String kleur, String waarde) {
        this.kleur = kleur;
        this.waarde = waarde;
    }

    void toonKaart() {
        System.out.println(kleur + " " + waarde);
    }
}
/*
Harten Aas
Ruiten 4
 */



