package c51_6_bos;

public class Bos {
    static final String SPATIE = "     ";

    static void testIfElseContruct(int aantalBomen, int oppervlakte) {
        // Zet deze code om naar een ternary.
        // Uiteraard prima te testen door aantalBomen/oppvl te variëren
        System.out.println("aantalBomen = " + aantalBomen + ", oppervlakte = " + oppervlakte);
        String soortBos =  "Geen Bos";
        if (aantalBomen > 20)
            if (aantalBomen > 100)
                if (oppervlakte > 100)
                    soortBos = "Groot Bos";
                else
                    soortBos = "Compact Bos";
            else
                soortBos =  "Klein Bos";
        System.out.println(SPATIE + "We zijn nu buiten het if statement!! " + soortBos);
    }

    static void testTernaryConstruct() {

    }
}
/* output
=== Bos.testIfElseContruct ===
aantalBomen = 200, oppervlakte = 500
     We zijn nu buiten het if statement!! Groot Bos
aantalBomen = 200, oppervlakte = 80
     We zijn nu buiten het if statement!! Compact Bos
aantalBomen = 90, oppervlakte = 500
     We zijn nu buiten het if statement!! Klein Bos
aantalBomen = 10, oppervlakte = 500
     We zijn nu buiten het if statement!! Geen Bos
*/