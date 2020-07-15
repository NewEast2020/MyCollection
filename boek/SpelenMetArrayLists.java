package boek;

import java.util.ArrayList;

public class SpelenMetArrayLists {
    public static void main(String[] args) {
//        ArrayList boeken = new ArrayList();
        ArrayList<Boek> mijnBoekenLijst = new ArrayList<>();

        Boek boek1 = new Boek("Harry Potter deel 1");
        Boek boek2 = new Boek("Harry Potter deel 2");
        Boek boek3 = new Boek("Harry Potter deel 3");
        Boek boek4 = new Boek("OCA");
        Boek boek5 = new Boek("Nijntje leert Java");
        Boek boek10 = boek1; // Geen extra boek, alleen extra verwijzing naar hetzelfde boek.

        Boek[] boekArray = {boek1, boek3, boek5}; // voorbeeld van Array. // Star: max 3 boeken

        mijnBoekenLijst.add(new Boek("Nijntje leert Scrum")); // maakt niet uit hoeveel ik toevoeg.
                       // Scrum komt op index 0 (1e plek in de lijst)
        mijnBoekenLijst.add(boek5); // Java komt op index 1 (2e plek)
        mijnBoekenLijst.add(boek2); //Harry 2 komt op index 2 (3e plek)
        mijnBoekenLijst.add(2, boek3); // Deze komt toch voor boek2

        printMijnBoekenLijst(mijnBoekenLijst);

        printMijnBoekenLijstEnhancedForLoop(mijnBoekenLijst);

        System.out.println("=== Nog een keer door de loop ===");
        // enhanced for-loop
        printMijnBoekenLijstEnhanced(mijnBoekenLijst);

        mijnBoekenLijst.remove(2);
        printMijnBoekenLijstEnhanced(mijnBoekenLijst);

        System.out.println(mijnBoekenLijst.get(1).naam);
        System.out.println(mijnBoekenLijst.size());
        mijnBoekenLijst.remove(boek2); // op basis van de leash kan ik ook objecten weghalen

        System.out.println("=== wat zit er in de lijst ===");
        printMijnBoekenLijstEnhanced(mijnBoekenLijst);

        for (int i=1; i<=5; i++) mijnBoekenLijst.add(boek1);

        System.out.println("=== De boekenlijst bestaat uit 3 unieke boeken, maar de arraylist bestaat uit 7 elementen ===");
        printMijnBoekenLijstEnhanced(mijnBoekenLijst);

        System.out.println("=== Boek verwijderen ===");
        System.out.println(mijnBoekenLijst.remove(boek1));  // 1e referentie die Java tegenkomt wordt weggegooid en dan is de remove klaar.
        printMijnBoekenLijstEnhanced(mijnBoekenLijst);

        System.out.println("=== mijnBoekenLijst ===");
        System.out.println(mijnBoekenLijst);
    }

    private static void printMijnBoekenLijstEnhanced(ArrayList<Boek> mijnBoekenLijst) {
        for (Boek boek : mijnBoekenLijst) {
            System.out.println("Titel boek: " + boek.naam + " " + boek.auteur);
        }
        System.out.println(" ");
    }

    private static void printMijnBoekenLijstEnhancedForLoop(ArrayList<Boek> mijnBoekenLijst) {
        // enhanced for-loop
        for (Boek boek : mijnBoekenLijst) {
            System.out.println("Titel boek: " + boek.naam + " " + boek.auteur);
            boek.auteur = "Ik weet het echt niet";
            System.out.println("boek.auteur = " + boek.auteur);
        }
        System.out.println(" ");
    }

    private static void printMijnBoekenLijst(ArrayList<Boek> mijnBoekenLijst) {
        for(int i = 0; i < mijnBoekenLijst.size(); i++)  {
//          Boek boek = mijnBoekenLijst.get(i); // Dit is hetzelfde, maar dan over 2 regels.
//          System.out.println(boek.naam);
            System.out.println(mijnBoekenLijst.get(i).naam);
            mijnBoekenLijst.get(i).auteur = "Onbekend";
        }
        System.out.println(" ");
    }
}

