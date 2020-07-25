package c15_3_trein2;

public class SpelenMet_Statisch_Instance_Field_Static_Method2 {

    public static void main(String[] args) {
        System.out.println("spoorbreedte: " + NSTrein2.spoorBreedte);
        NSTrein2.spoorBreedte = 120; // static variabelen kun je op de static manier (via de class) en via de instance benaderen
//        NSTrein.locNr = 1234978;   // instance variabelen kun je alleen via de instances benaderen en NOOIT via de class direct.
        System.out.println("spoorbreedte: " + NSTrein2.spoorBreedte);
        NSTrein2 trein1 = new NSTrein2(); // new NSTrein() daarmee roepen we de (verborgen) constructor aan
        NSTrein2 trein2 = new NSTrein2();
        System.out.println("spoorbreedtes: " + trein1.spoorBreedte + " " + trein2.spoorBreedte);
        trein1.spoorBreedte = 100;
        System.out.println("spoorbreedtes: " + trein1.spoorBreedte + " " + trein2.spoorBreedte);
        trein2.spoorBreedte = 140;
        System.out.println("spoorbreedtes: " + trein1.spoorBreedte + " " + trein2.spoorBreedte);

        System.out.println("locNrs: " + trein1.locNr + " " + trein2.locNr);
        trein1.locNr = 12312;
        trein2.locNr = 12314;
        System.out.println("locNrs: " + trein1.locNr + " " + trein2.locNr);

        NSTrein2 nsTrein3 = NSTrein2.maakEenNSTrein();
        NSTrein2 nsTrein4 = NSTrein2.maakEenNSTrein();

        trein1.treinGaatRijden();
        trein2.treinGaatRijden();
    }
}

/* output
spoorbreedte: 130
spoorbreedte: 120
spoorbreedtes: 120 120
spoorbreedtes: 100 100
spoorbreedtes: 140 140
locNrs: 0 0
locNrs: 12312 12314
Trein 12312 gaat rijden.
Trein 12314 gaat rijden.
*/
