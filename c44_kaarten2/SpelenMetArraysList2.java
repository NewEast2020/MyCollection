package c44_kaarten2;

import java.util.ArrayList;

class SpelenMetArrayslist2 {

    public static void main(String[] args) {
        Kaartspel2 kaartspel = new Kaartspel2(); // de constructor gaat voor mij een kaartspel maken
        kaartspel.schudden();
    }
}

class Kaartspel2 {
    ArrayList<Kaart2> kaarten = new ArrayList();
    Kaartspel2() {
        Kaart2 kaart1 = new Kaart2("Harten", "Aas");
        Kaart2 kaart2 = new Kaart2("Ruiten", "4");
        kaart1.toonKaart();
        kaart2.toonKaart();
        kaarten.add(kaart1);
        kaarten.add(kaart2);
        kaarten.add(new Kaart2("Ruiten","2"));
        kaarten.add(new Kaart2("Ruiten","3"));

    }

    void schudden() {
        System.out.println("Kaarten gaan geschud worden");
        // code voor het schudden van de kaarten
    }
}
