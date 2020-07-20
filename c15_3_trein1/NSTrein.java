package trein1;

class NSTrein {
    static int spoorBreedte = 130; // Dit is een class variabele ook wel static variabele genoemd
    int locNr; // default 0 (zie H2) // Dit is een instance variabele ook wel attributes, fields, non static variabelen
    // Wordt ook wel de state van een instantie genoemd.

    static int locNrStart = 100;
    int gegenereerdelocNr;

    static NSTrein maakEenNSTrein() { /* statisch methode */
        NSTrein nsTrein = new NSTrein();
        locNrStart++; // locNr ophogen
        nsTrein.gegenereerdelocNr = locNrStart; // Vul het veld van de trein met de statische (zojuist opgehoogde) waarde
        // En hier uiteraard nog heel veel code om de Trein heel specifiek te maken.
        return nsTrein;
    }
}
