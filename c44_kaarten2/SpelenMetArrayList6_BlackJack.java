package c44_kaarten2;

import java.util.ArrayList;

public class SpelenMetArrayList6_BlackJack {

    public static void main(String[] args) {
        SpelKaarten1 spelKaarten = new SpelKaarten1();
        spelKaarten.tonen();
    }
}

class SpelKaarten1 {
    ArrayList<Kaart6> kaarten = new ArrayList<>();

    SpelKaarten1() {
        String[] kleuren = {"Harten", "Ruiten", "Schoppen", "Klaveren"};
        String[] waarden = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Boer", "Vrouw", "Heer", "Aas"};

//        for (int i = 0; i < kleuren.length; i++) {
//            for (int j = 0; j < waarden.length; j++) {
//                Kaart kaart = new Kaart(kleuren[i], waarden[j]);
//                kaarten.add(kaart);
//            }
//        }
//
//        for (String kleur : kleuren) {
//            for (String waarde : waarden) {
//                Kaart kaart = new Kaart(kleur, waarde);
//                kaarten.add(kaart);
//            }
//        }

        for (int i = 0; i < 52; i++) {
            Kaart6 kaart = new Kaart6(kleuren[i % 4], waarden[i / 4]);
            kaarten.add(kaart);
        }
    }

    void tonen() {
        for (Kaart6 kaart : kaarten) {
            kaart.toonKaart();
        }
    }
}

class Kaart6     {

    Kaart6(String kleur, String waarde) {
        this.kleur = kleur;
        this.waarde = waarde;
    }

    String kleur;
    String waarde;

    void toonKaart() {
        System.out.println(kleur + " " + waarde);
    }
}
/* output
Harten 2
Ruiten 2
Schoppen 2
Klaveren 2
Harten 3
Ruiten 3
Schoppen 3
Klaveren 3
Harten 4
Ruiten 4
Schoppen 4
Klaveren 4
Harten 5
Ruiten 5
Schoppen 5
Klaveren 5
Harten 6
Ruiten 6
Schoppen 6
Klaveren 6
Harten 7
Ruiten 7
Schoppen 7
Klaveren 7
Harten 8
Ruiten 8
Schoppen 8
Klaveren 8
Harten 9
Ruiten 9
Schoppen 9
Klaveren 9
Harten 10
Ruiten 10
Schoppen 10
Klaveren 10
Harten Boer
Ruiten Boer
Schoppen Boer
Klaveren Boer
Harten Vrouw
Ruiten Vrouw
Schoppen Vrouw
Klaveren Vrouw
Harten Heer
Ruiten Heer
Schoppen Heer
Klaveren Heer
Harten Aas
Ruiten Aas
Schoppen Aas
Klaveren Aas
*/