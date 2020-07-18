package c51_6_bos;

public class Bos {
    static final String SPATIE = "     ";

    static void testIfElseContruct(int aantalBomen, int oppervlakte) {
        // Zet deze code om naar een ternary.
        // Uiteraard prima te testen door aantalBomen/oppvl te variëren
        System.out.println("testIfElseContruct : aantalBomen = " + aantalBomen + ", oppervlakte = " + oppervlakte);
        String soortBos = "Geen Bos";
        if (aantalBomen > 20)
            if (aantalBomen > 100)
                if (oppervlakte > 100)
                    soortBos = "Groot Bos";
                else
                    soortBos = "Compact Bos";
            else
                soortBos = "Klein Bos";

        System.out.println(SPATIE + "We zijn nu buiten het if statement!! " + " === " + soortBos + " === ");
    }

    // ternary met identation
    static void testTernaryConstruct(int aantalBomen, int oppervlakte) {
        System.out.println("testTernaryConstruct : aantalBomen = " + aantalBomen + ", oppervlakte = " + oppervlakte);
        String soortBos = (aantalBomen > 20) ?
                (aantalBomen > 100) ?
                        (oppervlakte > 100) ? "Groot Bos" : "Compact Bos"
                        : "klein bos"
                : "Geen Bos";
        System.out.println(SPATIE + "We zijn nu buiten de ternary statement!! " + " === " + soortBos + " === ");
    }

    // ternary zonder identation
    static void testTernaryConstruct2(int aantalBomen, int oppervlakte) {
        System.out.println("testTernaryConstruct2 : aantalBomen = " + aantalBomen + ", oppervlakte = " + oppervlakte);
        String soortBos = (aantalBomen > 20) ? (aantalBomen > 100) ? (oppervlakte > 100) ? "Groot Bos"
                : "Compact Bos" : "klein bos" : "Geen Bos";
        System.out.println(SPATIE + "We zijn nu buiten de ternary statement!! " + " === " + soortBos + " === ");
    }
}
/* output
=== Bos.testIfElseContruct ===
testIfElseContruct : aantalBomen = 200, oppervlakte = 500
     We zijn nu buiten het if statement!!  === Groot Bos ===
testIfElseContruct : aantalBomen = 200, oppervlakte = 80
     We zijn nu buiten het if statement!!  === Compact Bos ===
testIfElseContruct : aantalBomen = 90, oppervlakte = 500
     We zijn nu buiten het if statement!!  === Klein Bos ===
testIfElseContruct : aantalBomen = 10, oppervlakte = 500
     We zijn nu buiten het if statement!!  === Geen Bos ===
 ===== Bos.testTernaryConstruct ===
testTernaryConstruct : aantalBomen = 200, oppervlakte = 500
     We zijn nu buiten de ternary statement!!  === Groot Bos ===
testTernaryConstruct : aantalBomen = 200, oppervlakte = 80
     We zijn nu buiten de ternary statement!!  === Compact Bos ===
testTernaryConstruct : aantalBomen = 90, oppervlakte = 500
     We zijn nu buiten de ternary statement!!  === klein bos ===
testTernaryConstruct : aantalBomen = 10, oppervlakte = 500
     We zijn nu buiten de ternary statement!!  === Geen Bos ===
===== Bos.testTernaryConstruct2 ====
testTernaryConstruct2 : aantalBomen = 200, oppervlakte = 500
     We zijn nu buiten de ternary statement!!  === Groot Bos ===
testTernaryConstruct2 : aantalBomen = 200, oppervlakte = 80
     We zijn nu buiten de ternary statement!!  === Compact Bos ===
testTernaryConstruct2 : aantalBomen = 90, oppervlakte = 500
     We zijn nu buiten de ternary statement!!  === klein bos ===
testTernaryConstruct2 : aantalBomen = 10, oppervlakte = 500
     We zijn nu buiten de ternary statement!!  === Geen Bos ===
*/