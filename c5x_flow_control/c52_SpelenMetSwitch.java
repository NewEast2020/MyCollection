package c5x_flow_control;

class c52_SpelenMetSwitch {

    public static void main(String[] args) {

        // Doel: verschillende acties wil uitvoeren in het geval je beperkt aantal concrete condities hebt
        Integer getal = 2;
        //int getal = 2;
        final int factor = 1;  // final declaratie en initializatie op 1 regel !!! => anders compiler error
        switch (getal) { // conditie accepteer enkel bepaalde types pg 342; leer uit hoofd!
            case 1 * factor:             // binnen case block worden geen {} gebruikt
                System.out.println("een");
            case 2 * factor:             // case argument moet een compile_time_constante
                System.out.println("twee");
                break;
            case 3 * factor:
                System.out.println("drie");
            default:
                System.out.println("iets anders");
        }

        String woord = "goed";
        woord = new String("ook goed");
        switch (woord) {      // woord mag NOOIT null zijn => NullPointerError
            // woord wordt vergeleken mvb equals() methode
            case "ook goed":
            case "goed":
                System.out.println("goed");
                // return; // return 'spring' uit switch EN beeindigt methode
                break;
            case "fout":
                if (woord.equals("fout")) {
                    System.out.println("fout");
                }
                break;
            //case null   // case argument mag NOOIT null zijn => compiler error
            default:        // probeer wat er gebeurt als je default: op ander plaats zet!
                System.out.println("iets anders");
        }

        switch (4) {
        }    // dit is een minimale switch constructie (empty body)
    }
}
/* output
twee
goed
*/