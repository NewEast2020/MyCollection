package c15_3_trein3;

class NSTrein3 {
    static int spoorBreedte = 130; // Dit is een class variabele ook wel static variabele genoemd
    int locNr; // default 0 (zie H2) // Dit is een instance variabele ook wel attributes, fields, non static variabelen
    // Wordt ook wel de state van een instantie genoemd.
    void benJijDeTreinDieIkGezienHeb(int locNr) { // Methode variabele => duwt de instance variabele aan de kant (shadowing)
        System.out.println("Zit nu in de methode binnen het object" + this); // this is het adres waar de instantie zich bevindt. De leash
        System.out.println("lokaal/method " + locNr);
        System.out.println("field " + this.locNr); // Dit is altijd de globale variabele
//        System.out.println(locNr == locNrDieIkZag);
//        boolean gezien = locNr == locNrDieIkZag;
//        System.out.println("Ik ben loc " + locNr + " en jij zag " + locNrDieIkZag + ". Dus: " + gezien );
    }
}
