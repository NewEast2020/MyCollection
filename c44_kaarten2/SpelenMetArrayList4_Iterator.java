package c44_kaarten2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SpelenMetArrayList4_Iterator {

    public static void main(String[] args) {
        List<Bal2> ballenbak = new ArrayList<>();
        ballenbak.add(new Bal2("Rood"));
        ballenbak.add(new Bal2("Groen"));
        ballenbak.add(new Bal2("Blauw"));

        ListIterator<Bal2> ballenbakIterator = ballenbak.listIterator();

        while (ballenbakIterator.hasNext()) {
            System.out.println(ballenbakIterator.next().kleur);
            ballenbakIterator.remove();
        }

        System.out.println(ballenbak.size());

        ballenbak.add(new Bal2("Rood"));
        ballenbak.add(new Bal2("Groen"));
        ballenbak.add(new Bal2("Blauw"));

        Object[] objecten = ballenbak.toArray(); // .toArray levert standaard een Objecten array op => casten
        for (Object object : objecten) {
            System.out.println(((Bal1) object).kleur);
        }

        Bal2[] ballen = ballenbak.toArray(new Bal2[0]); // hiermee wordt het omgezet naar een Bal[], even een nieuwe Bal[] meegeven voor de omzetting
        for (Bal2 bal : ballen) {
            System.out.println(bal.kleur);
        }
    }
}

class Bal2 {

    Bal2(String kleur) {
        this.kleur = kleur;
    }

    String kleur;
}
/*
Rood
Groen
Blauw
0
Exception in thread "main" java.lang.ClassCastException: c44_kaarten2.Bal2 cannot be cast to c44_kaarten2.Bal1
	at c44_kaarten2.SpelenMetArrayList4_Iterator.main(SpelenMetArrayList4_Iterator.java:30)

*/