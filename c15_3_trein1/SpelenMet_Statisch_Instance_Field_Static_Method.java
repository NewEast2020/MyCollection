package c15_3_trein1;

public class SpelenMet_Statisch_Instance_Field_Static_Method {
    public static void main(String[] args) {
        System.out.println("spoorbreedte: " + NSTrein.spoorBreedte);
        NSTrein.spoorBreedte = 120; // static variabelen kun je op de static manier (via de class) en via de instance benaderen
        //        NSTrein.locNr = 1234978;   // instance variabelen kun je alleen via de instances benaderen en NOOIT via de class direct.
        System.out.println("spoorbreedte: " + NSTrein.spoorBreedte);

        NSTrein trein1 = new NSTrein(); // new NSTrein() daarmee roepen we de (verborgen) constructor aan
        NSTrein trein2 = new NSTrein();

        System.out.println("spoorbreedtes: " + trein1.spoorBreedte + " " + trein2.spoorBreedte);
        trein1.spoorBreedte = 100;
        System.out.println("spoorbreedtes: " + trein1.spoorBreedte + " " + trein2.spoorBreedte);
        trein2.spoorBreedte = 140;
        System.out.println("spoorbreedtes: " + trein1.spoorBreedte + " " + trein2.spoorBreedte);

        System.out.println("locNrs: " + trein1.locNr + " " + trein2.locNr);
        trein1.locNr = 12312;
        trein2.locNr = 12314;
        System.out.println("locNrs: " + trein1.locNr + " " + trein2.locNr);

        NSTrein nsTrein3 = NSTrein.maakEenNSTrein();
        System.out.println("locNr Gegenereerd: " + nsTrein3.gegenereerdelocNr);
        NSTrein nsTrein4 = NSTrein.maakEenNSTrein();
        System.out.println("locNr Gegenereerd: " + nsTrein3.gegenereerdelocNr);
        System.out.println("locNr Gegenereerd: " + nsTrein4.gegenereerdelocNr);
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
        locNr Gegenereerd: 101
        locNr Gegenereerd: 101
        locNr Gegenereerd: 102
 */