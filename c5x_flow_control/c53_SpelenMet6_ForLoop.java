package c5x_flow_control;

class c53_SpelenMet6_ForLoop {

    public static void main(String[] args) {
        mijnBlock        : {
            System.out.println("Mijn code block");
        }

        hoofdloop: for (int i = 0; i < 4; i++) {
            subloop: for (int j = 0; j < 4; j++) {
                System.out.println("i - " + i + " | j - " + j);
                if (j == 2 ) {
                    System.out.println("Tijd om te stoppen");
//                    break mijnBlock; // alleen maar breaken naar een label binnen scope
//                    break hoofdloop;
//                    continue hoofdloop; // is niet hetzelfde als break subloop
                    break subloop;
                }
            } // einde j loop
            System.out.println("Aan het einde van het i rondje");
        } // einde i loop // label hoofdloop is dood

        label: if (5 > 4) {
            System.out.println("groter dan vier");
            break label; // losse break mag NIET, maar break naar een label wel
//            System.out.println(); // geen code => unreachable
        } // breakt uit de code die bij het label hoort, dus gaat naar => } en vanaf daar gewoon verder met de code.

        System.out.println("uit het if statement");
    }
}
/*
Mijn code block
i - 0 | j - 0
i - 0 | j - 1
i - 0 | j - 2
Tijd om te stoppen
Aan het einde van het i rondje
i - 1 | j - 0
i - 1 | j - 1
i - 1 | j - 2
Tijd om te stoppen
Aan het einde van het i rondje
i - 2 | j - 0
i - 2 | j - 1
i - 2 | j - 2
Tijd om te stoppen
Aan het einde van het i rondje
i - 3 | j - 0
i - 3 | j - 1
i - 3 | j - 2
Tijd om te stoppen
Aan het einde van het i rondje
groter dan vier
uit het if statement
 */