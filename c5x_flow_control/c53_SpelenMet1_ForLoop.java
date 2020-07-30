package c5x_flow_control;

class c53_SpelenMet1_ForLoop {

    public static void main(String[] args) {

        // for ( initializatie ; conditie ; update_actie ) statement
        // alle 3 opties zijn facultatief


        for (int i = 0; i < 10; i++) System.out.println("i = " + i);
        for (int i = 0, k = 1; i < 10; i++) System.out.println("i,k " + i + ", " + k);
        // mag meerdere variabele declareren/initializeren, LET OP:
        // variabelen moet van HETZELFDE type zijn

        // initializatie
        int j = 0;
        for (; j < 10; j++) System.out.println("j = " + j); // hier is initializatie variable buiten loop gedaan

        // conditie: (geld voor alle flow controls) true: gaat ie verder met loop , false: stopt met loop
        // conditie wordt getest bij begin iedere iteratie
        // conditie leeg => geldt als true
        //for (int i = 0;; i++) System.out.println("i = " + i);


        // update_actie: wordt uitgevoerd op einde van iedere iteratie
        // mogen meerdere statements zijn gescheiden door KOMMA
        for (int i = 0; i < 10; System.out.print("bla:"), System.out.println("i = " + i++)) {
            // is leeg
        }

        // for(;;){}   // geldige constructie die een eindeloos loop start die geen output geeft

        String[] soort = {"harten", "klaver", "ruiten", "schoppen"};
        for (int s = 0; s < soort.length; s++) {
            String tijdelijk = soort[s];
            if (tijdelijk.equals("ruiten")){
                //break;      // stap uit loop WAARIN DEZE IS GEDEFINIEERD!
                continue;      // forceert volgende ieteratie-stap, waarbij daarom update_actie wordt uitgevoerd
            }
            System.out.println("soort[s] = " + tijdelijk);
        }
//        for (;false;){
//            System.out.println("qklq");   // unreachable code
//        }
    }
}
/* output
i = 0
i = 1
i = 2
i = 3
i = 4
i = 5
i = 6
i = 7
i = 8
i = 9
i,k 0, 1
i,k 1, 1
i,k 2, 1
i,k 3, 1
i,k 4, 1
i,k 5, 1
i,k 6, 1
i,k 7, 1
i,k 8, 1
i,k 9, 1
j = 0
j = 1
j = 2
j = 3
j = 4
j = 5
j = 6
j = 7
j = 8
j = 9
bla:i = 0
bla:i = 1
bla:i = 2
bla:i = 3
bla:i = 4
bla:i = 5
bla:i = 6
bla:i = 7
bla:i = 8
bla:i = 9
soort[s] = harten
soort[s] = klaver
soort[s] = schoppen
*/