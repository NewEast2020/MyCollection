package c15_3_phone;

class Phone1 { // class is 1e niveau
    // class members: of methodes, of variabelen (globale variabelen)
    // Bij de methodes en variabelen heb ik twee smaakjes: static en niet static (door woord static NIET te gebruiken wordt het niet static)
    static boolean touchscreen = false; // default waarde van boolean is false!!

    public static void main(String[] args) {
        touchscreen = true;
        Phone1 phone1 = new Phone1();
        Phone1 phone2 = null;
        Phone1.touchscreen = false;
        phone1.touchscreen = true;
        System.out.println(phone1.touchscreen);
        System.out.println(phone2.touchscreen);

        int nogEenVeld;
        int aantaltoetsen; // deze heeft GEEN default. Deze MOET ik nog initialiseren VOOR dat ik deze variabele gebruik.
//        System.out.println(aantaltoetsen); // compileert niet, want de variabele is nog niet geïnitialiseerd.
        aantaltoetsen = 10; // Op een andere regel heb ik de lokale variabele geïnitisaliseerd en nu gaat het goed.
        int totaal = aantaltoetsen + 10;
    }

    int aantal; // default 0
    static boolean touchscreen2 = false; // default waarde van boolean is false!!
    // static boolean veld; => declaratie van de variabele met de naam veld van het type boolean. Oftewel het aanmaken van de variabele
    // Dit wordt ook een globale variabele genoemd. Deze mag ik initialiseren, maar hoeft NIET!
    static boolean key; // default waarde = false;
    // volgorde van de gemaakte methodes/variabelen maakt niet uit.
}
/* output
true
true
 */