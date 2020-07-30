package c5x_flow_control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class c53_SpelenMet2_ForLoop {

    public static void main(String[] args) {
        List<String> cursisten = new ArrayList<>();
        cursisten.add("Ka");
        cursisten.add("Hen");
        cursisten.add("Rut");
        cursisten.add("Co");

        cursisten = new ArrayList<>(Arrays.asList("Ka", "Hen", "Rut", "Co")); // alternatieve manier, valt buiten OCA stof

        for (int i = 0; i < cursisten.size(); i++) {
            String cursist = cursisten.get(i); // Dit is eigenlijk wat er in de enhanced for loop gebeurt.
            // Een tijdelijke lokale variabele wordt in de enhanced for loop gebruikt om het object te kunnen benaderen.
            cursist = cursist + " heeft nog even nodig voor het examen";
            System.out.println(cursist);
//            cursisten.set(i, cursisten.get(i) + " doet het goed");
//            System.out.println(cursisten.get(i));
        }

        System.out.println();
        System.out.println("Enhanced for loop (geen for each)");
        for(String cursist: cursisten) {
            cursist = cursist + " doet het heel goed.";
            System.out.println(cursist);
        }
        System.out.println(cursisten);
    }
}
/* output
Ka heeft nog even nodig voor het examen
Hen heeft nog even nodig voor het examen
Rut heeft nog even nodig voor het examen
Co heeft nog even nodig voor het examen

Enhanced for loop (geen for each)
Ka doet het heel goed.
Hen doet het heel goed.
Rut doet het heel goed.
Co doet het heel goed.
[Ka, Hen, Rut, Co]
 */