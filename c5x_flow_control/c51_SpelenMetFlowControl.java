package c5x_flow_control;

class c51_SpelenMetFlowControl {

    public static void main(String[] args) {

        // if (boolean expressie) statement
        // statement is 1 commando of reeks commandos opgeslagen tussen { }

        int getal = 11;
        int max = 10;
        if (getal > max)
            System.out.println("is getal wel groter dan limiet?");
        System.out.println(getal + " is groter dan " + max);

        if (getal > max) {  // voorkeur: gebruik zo mogelijk altijd {}
            System.out.println("is getal wel groter dan limiet?");
            System.out.println(getal + " is groter dan " + max);
        }

        System.out.println("if - else");
        // if (boolean expressie) statement else statement
        if (getal > max)
            System.out.println(getal + " is groter dan " + max);
            // ; // empty statement is OK, maar regel weglaten maak niet! => compiler error
        else
            System.out.println(getal + " is kleiner dan " + max);

        if (getal > max)
            for (int i = 0; i < 5; i++) {   // for statement gedraagt zich als 1 commando => geen {} nodig voor if-clausule
                System.out.println("regel 1");
                System.out.println("regel 2");
            }
            // ; // empty statement is OK, maar regel weglaten maak niet! => compiler error
        else
            System.out.println(getal + " is kleiner dan " + max);

        //return;  // zou unreachable statement compiler error veroorzaken

        System.out.println("if - else if");
        getal = 30;
        max = 15;
        if (getal == max)
            System.out.println(getal + " is gelijk aan " + max);
        else if (getal == 2 * max)
            System.out.println(getal + " is gelijk aan twee maal " + max);
        else if (getal == 3 * max)
            System.out.println(getal + " is gelijk aan drie maal " + max);
        else
            System.out.println("iets anders");

        if (false)
            System.out.println("geen unreachable code");
        // if constructie creert GEEN unreachable code situaties (itt tot ander loop constructies)


        System.out.println("*** ternary ***");

        //Doel: assignment (toekenning middels = teken) afhankelijk van bepaalde condities
        int temperatuur = 38;
        String uitslag = temperatuur > 38 ? "koorts" : "geen koorts";
        uitslag = temperatuur > 38 ? "koorts" : new String("geen koorts");
        //uitslag = temperatuur > 38 ? "koorts" : 36;  //

        System.out.println("uitslag = " + uitslag);
        // type var = conditie ? waarde_indien_true : waarde_indien_false
        //                       expressie            expressie
        // bij assignment let altijd op typering => normale regels
        // waarde_indien_true EN waarde_indien_false altijd aanwezig moet zijn

        String tarief = "laag";
        int jaar = 2010;
        //Long percentage = tarief.equals("hoog")? new Integer(21): new Integer(9);  //Integer kan niet naar long worden omgezet
        long percentage2 = tarief.equals("hoog")? new Integer(21): new Integer(9);
        percentage2 = tarief.equals("hoog")?
                new Integer(21):
                jaar >2018 ?
                        9 : 6;
        System.out.println("percentage2 = " + percentage2);
    } // main
} // FLowControl
/*
is getal wel groter dan limiet?
11 is groter dan 10
is getal wel groter dan limiet?
11 is groter dan 10
if - else
11 is groter dan 10
regel 1
regel 2
regel 1
regel 2
regel 1
regel 2
regel 1
regel 2
regel 1
regel 2
if - else if
30 is gelijk aan twee maal 15
*** ternary ***
uitslag = geen koorts
percentage2 = 6
 */