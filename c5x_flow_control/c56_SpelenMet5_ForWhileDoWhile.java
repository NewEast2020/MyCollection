package c5x_flow_control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class c56_SpelenMet5_ForWhileDoWhile {

    public static void main(String[] args) {
        List<String> pretparken = new ArrayList<>(Arrays.asList("Efteling", "Plopsaland", "Slagharen", "Oranjestad"));

        for (int i = 0; i < pretparken.size(); i++) {
            System.out.println(pretparken.get(i));
        }

        int i = 0; // initialisatie in de for loop
        while (i < pretparken.size()) { // voorwaarden om de loop in te mogen gaan.
            System.out.println(pretparken.get(i));

            i++; // ophogen
        } // Dit is de while variant van de for loop.

        do ; while(false);  // grote verschil met de while loop, is dat het code block {} of het losse statement ALTIJD minstens 1x wordt uitgevoerd!

        int j = 0; //
        do {
            System.out.println(pretparken.get(j));

            j++; // ophogen
        } while (j < pretparken.size()); // Hier MOET een ; achter

        System.out.println("Pretparken lijst leegmaken");
//        pretparken = new ArrayList<>(); // 2e loop gaat mis, het 0e element bestaat niet, lege lijst
        pretparken = null; // NullPointerException want pretparken verwijst naar null en pretparken.size() is het aanroepen van een methode van een object dat niet bestaat.
        System.out.println(pretparken.size());
        i = 0;
        while (i < pretparken.size()) { // voorwaarden om de loop in te mogen gaan.
            System.out.println(pretparken.get(i));

            i++; // ophogen
        } // Dit is de while variant van de for loop.
        j = 0; //
        do {
            System.out.println(pretparken.get(j));

            j++; // ophogen
        } while (j < pretparken.size()); // Hier MOET een ; achter



//        while (true)
//            System.out.println("Lekker bezig");
////            System.out.println("Lekker bezig"); // unreachable

//        while(false) ; // het statement ; (of een {}) is unreachable => compile error
//        }

//        boolean whileloop = false; // maak je deze final, dan compileert de code ook niet, want whileloop wordt dan vervangen door false
//        while(whileloop) System.out.println();; // Nu compileeert het wel, ook al zien wij allemaal dat de sout; nooit uitgevoerd zal worden
    }
}
/* output
Efteling
Plopsaland
Slagharen
Oranjestad
Efteling
Plopsaland
Slagharen
Oranjestad
Efteling
Plopsaland
Slagharen
Oranjestad
Pretparken lijst leegmaken
Exception in thread "main" java.lang.NullPointerException
	at demo.c56_SpelenMet5_ForWhileDoWhile.main(c56_SpelenMet5_ForWhileDoWhile.java:35)
 */