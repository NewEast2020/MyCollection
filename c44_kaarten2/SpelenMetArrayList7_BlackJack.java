package c44_kaarten2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SpelenMetArrayList7_BlackJack {
    public static void main(String[] args) {
        SpelKaarten2 spelKaarten = new SpelKaarten2();
//        spelKaarten.tonen();
//        spelKaarten.schudden();
        spelKaarten.schudden2();
        spelKaarten.tonen();
    }
}

class SpelKaarten2 {

    List<Kaart7> kaarten = new ArrayList<>();

    SpelKaarten2() {
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
            Kaart7 kaart = new Kaart7(kleuren[i % 4], waarden[i / 4]);
            kaarten.add(kaart);
        }
    }

    void tonen() {
        for (Kaart7 kaart : kaarten) {
            kaart.toonKaart();
        }
    }

    void schudden() {
        Random random = new Random();
        random.nextInt(52);
        List<Kaart7> kaartenGeschud = new ArrayList<>();
        for (int i = 52; i > 0; i--) {
//            System.out.println(i);
//            System.out.println("Random waarde: " + random.nextInt(i));
            int teTrekkenKaart = random.nextInt(i);
            Kaart7 kaart = kaarten.get(teTrekkenKaart);
            kaartenGeschud.add(kaart);
            kaarten.remove(teTrekkenKaart); // kaarten.remove(kaart) is natuurlijk ook goed
            System.out.println(kaarten.size() + " " + kaartenGeschud.size());
        }
        kaarten = kaartenGeschud;
    }

    void schudden2() {
        Collections.shuffle(kaarten);
    }
}

class Kaart7 {

    Kaart7(String kleur, String waarde) {
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
Schoppen 6
Klaveren 3
Schoppen 3
Harten Heer
Klaveren 7
Klaveren Boer
Klaveren Aas
Klaveren 9
Harten 6
Ruiten 5
Klaveren 8
Harten 8
Ruiten 9
Ruiten 6
Harten 7
Schoppen 8
Harten 9
Harten 5
Ruiten 10
Harten Boer
Klaveren 2
Schoppen 7
Klaveren Heer
Schoppen Aas
Schoppen Vrouw
Harten 4
Klaveren 4
Schoppen 9
Schoppen 4
Harten 2
Schoppen Boer
Ruiten 2
Ruiten 3
Ruiten 4
Harten Vrouw
Klaveren Vrouw
Klaveren 10
Klaveren 5
Harten Aas
Ruiten 7
Ruiten Aas
Schoppen 10
Ruiten 8
Ruiten Vrouw
Klaveren 6
Harten 10
Schoppen 5
Harten 3
Ruiten Boer
Schoppen 2
Ruiten Heer
Schoppen Heer
 */