package c44_kaarten2;

import java.util.ArrayList;
import java.util.ListIterator;

public class SpelenMetArrayList3_Bal {

    public static void main(String[] args) {

        Bal1 bal1 = new Bal1("rood");
        Bal1 bal2 = new Bal1("wit");
        Bal1 bal3 = new Bal1("blauw");

        ArrayList<Bal1> ballenbak1 = new ArrayList<>();
        ballenbak1.add(bal1);
        ballenbak1.add(bal2);
        ballenbak1.add(bal3);

        System.out.println("*** Wijzig aantal elementen van ArryList in enhanced-for loop ***");
        for (Bal1 bal : ballenbak1) {
            System.out.println("balkleur: " + bal.kleur);
            // ballenbak1.remove(0); // geeft ConcurrentModificationException; in enhanced-for loop kun je het aantal elementen niet veranderen!
        }

        System.out.println("*** Wijzig aantal elementen van ArryList loop met Iterator ***");
        ListIterator<Bal1> iter = ballenbak1.listIterator();
        while (iter.hasNext()) {
            Bal1 bal = iter.next();
            if (bal.kleur.equals("wit")) {  // selecteer en verwijder de witte bal
                iter.remove();
            }
        }
        for (Bal1 b : ballenbak1) {
            System.out.println("balkleur: " + b.kleur);
        }

        ballenbak1.add(1, bal2); // voeg verwijderde bal weer toe op oude positie (tbv onderstaande voorbeelden)

        ArrayList<Bal1> ballenbak2 = new ArrayList<>();
        ballenbak2.add(bal1);
        ballenbak2.add(bal2);
        ballenbak2.add(bal3);

        System.out.println("*** Verander de kleur van de witte bal in ballenbak1 ***");
        ballenbak1.get(1).kleur = "zwart";
        // wat gebeurt er in ballenbak 2?
        for (Bal1 b : ballenbak2) {
            System.out.println("balkleur:  " + b.kleur); // ook in ballenbak 2 is de witte bal van kleur veranderd WANT beide bakkne wijzen naar DEZELFDE ballen!
        }

        System.out.println("*** Stop ArrayList in Array; oftwel 'ballenbak in ballengoot' ***");
        Bal1[] ballengoot = ballenbak1.toArray(new Bal1[0]); // maak dimensie kleiner/gelijk aan benodigde ruimte, dan wordt automatisch juiste ruimte gereserveerd
        for (Bal1 b : ballengoot) {
            System.out.println("balkleur: " + b.kleur); // inhoud ongewijzigd
        }

        System.out.println("*** Wissel volgorde in ballengoot ***");
        Bal1 temp = ballengoot[0];
        ballengoot[0] = ballengoot[2];
        ballengoot[2] = temp;
        for (Bal1 b : ballengoot) {
            System.out.println("ballengoot: balkleur: " + b.kleur); // hier volgorde aangepast
        }
        for (Bal1 b : ballenbak1) {
            System.out.println("ballenbak: balkleur: " + b.kleur); // hier blijft volgorde hetzelfde!
        }

        System.out.println("*** Verander kleur van bal in ballengoot ***");
        ballengoot[1].kleur = "groen"; // verander de bal naar groen
        for (Bal1 b : ballengoot) {
            System.out.println("ballengoot: balkleur: " + b.kleur);
        }

        for (Bal1 b : ballenbak1) {
            System.out.println("ballenbak: balkleur: " + b.kleur);  // bal in ballenbak is ook groen WANT ballengoot/ballenbak wijzen naar ZELFDE bal!
        }
    }
}

class Bal1   {
    String kleur;

    Bal1(String kleur) {
        this.kleur = kleur;
    }

    void rol() {
        System.out.println("bal met kleur " + kleur + " rolt");
    }
}
/*
*** Wijzig aantal elementen van ArryList in enhanced-for loop ***
balkleur: rood
balkleur: wit
balkleur: blauw
*** Wijzig aantal elementen van ArryList loop met Iterator ***
balkleur: rood
balkleur: blauw
*** Verander de kleur van de witte bal in ballenbak1 ***
balkleur:  rood
balkleur:  zwart
balkleur:  blauw
*** Stop ArrayList in Array; oftwel 'ballenbak in ballengoot' ***
balkleur: rood
balkleur: zwart
balkleur: blauw
*** Wissel volgorde in ballengoot ***
ballengoot: balkleur: blauw
ballengoot: balkleur: zwart
ballengoot: balkleur: rood
ballenbak: balkleur: rood
ballenbak: balkleur: zwart
ballenbak: balkleur: blauw
*** Verander kleur van bal in ballengoot ***
ballengoot: balkleur: blauw
ballengoot: balkleur: groen
ballengoot: balkleur: rood
ballenbak: balkleur: rood
ballenbak: balkleur: groen
ballenbak: balkleur: blauw
*/