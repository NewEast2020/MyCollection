package c33_tafel;

public class SpelenMethodCall {
    public static void main(String[] args) {
        Tafel tafel = new Tafel();
        int lengte = tafel.getLengte();
        int breedte = 20;
        int oppervlakte = berekenOppervlakte(tafel.getLengte(), breedte); // 2 argumenten v/h type int
        System.out.println("oppervlakte = " + oppervlakte);
        oppervlakte = berekenOppervlakte(tafel.getLengte(), 20); // 2 argumenten v/h type int
        System.out.println("oppervlakte = " + oppervlakte);
//        testen(); // testen is niet static en vanuit static kan ik alleen direct statische methodes aanroepen.
    }

    void testen() {

    }

    // methode met 2 parameters v/h type int
    static int berekenOppervlakte (int lengte, int breedte) {
        int oppervlakte = lengte * breedte;
        return oppervlakte;
    }

    static int berekenOppervlakte (int lengte) {
        int oppervlakte = lengte * 100;
        return oppervlakte;
    }
}
/* output
oppervlakte = 2000
oppervlakte = 2000
 */