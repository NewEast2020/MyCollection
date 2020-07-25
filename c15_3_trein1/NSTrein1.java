package c15_3_trein1;

class NSTrein1 {
    static int spoorBreedte = 130; // Dit is een class variabele ook wel static variabele genoemd
    int locNr; // default 0 (zie H2) // Dit is een instance variabele ook wel attributes, fields, non static variabelen
    // Wordt ook wel de state van een instantie genoemd.

    static int locNrStart = 100;
    int gegenereerdelocNr;

    static NSTrein1 maakEenNSTrein() { /* statisch methode */
        NSTrein1 nsTrein = new NSTrein1();
        locNrStart++; // locNr ophogen
        nsTrein.gegenereerdelocNr = locNrStart; // Vul het veld van de trein met de statische (zojuist opgehoogde) waarde
        // En hier uiteraard nog heel veel code om de Trein heel specifiek te maken.
        return nsTrein;
    }
}
