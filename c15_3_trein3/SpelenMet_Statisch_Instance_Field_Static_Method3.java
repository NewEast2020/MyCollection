package c15_3_trein3;

public class SpelenMet_Statisch_Instance_Field_Static_Method3 {

    public static void main(String[] args) {
        System.out.println("spoorbreedte: " + NSTrein3.spoorBreedte);
        NSTrein3 trein1 = new NSTrein3(); // new NSTrein() daarmee roepen we de (verborgen) constructor aan
        NSTrein3 trein2 = new NSTrein3();
        System.out.println("locNrs: " + trein1.locNr + " " + trein2.locNr);
        trein1.locNr = 12312;
        trein2.locNr = 12314;
        System.out.println("locNrs: " + trein1.locNr + " " + trein2.locNr);

        int nummerDatIkGespotHeb = 12317823;
        System.out.println("Vanuit main - trein1 " + trein1);
        trein1.benJijDeTreinDieIkGezienHeb(nummerDatIkGespotHeb);
        System.out.println("Vanuit main - trein2 " + trein2);
        trein2.benJijDeTreinDieIkGezienHeb(nummerDatIkGespotHeb);
    }
}

/*
spoorbreedte: 130
locNrs: 0 0
locNrs: 12312 12314
Vanuit main - trein1 c15_3_trein3.NSTrein@28d93b30
Zit nu in de methode binnen het objectc15_3_trein3.NSTrein@28d93b30
lokaal/method 12317823
field 12312
Vanuit main - trein2 c15_3_trein3.NSTrein@1b6d3586
Zit nu in de methode binnen het objectc15_3_trein3.NSTrein@1b6d3586
lokaal/method 12317823
field 12314
*/
