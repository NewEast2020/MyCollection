package c15_3_trein2;

class NSTrein2 {
    static int spoorBreedte = 130; // Dit is een class variabele ook wel static variabele genoemd
    int locNr; // default 0 (zie H2) // Dit is een instance variabele ook wel attributes, fields, non static variabelen
    // Wordt ook wel de state van een instantie genoemd.

    static NSTrein2 maakEenNSTrein() { // Dit is een static methode
        NSTrein2 nsTrein = new NSTrein2();
        return nsTrein;
    }

    void treinGaatRijden() { // Dit wordt ook wel behaviour genoemd, alle niet statische methodes van een instantie
        System.out.println("Trein " + locNr + " gaat rijden.");
    }
}
