package reis;

public class SpelenMetScope {
    public static void main(String[] args) { // String[] args => methode variabele
        ExtraReis busReis = new ExtraReis();
        testScope1(busReis);

        Reis wandeling = new Reis();
        testScope2(wandeling);
    }

    private static void testScope1(ExtraReis busReis) {
        System.out.println("=== testScope1 === ");
        System.out.println("busReis.testGetal: " + busReis.testGetal);
        busReis = null; // object aangemaakt in regel 5 is eligable for gc
        System.out.println("busReis: " + busReis);
        if (busReis == null) {
            System.out.println("U bent vergeten het object te initialiseren met een echt object");
        } else {
            System.out.println("busReis.testGetal: " + busReis.testGetal);
        }
    }

    private static void testScope2(Reis wandeling) {
        System.out.println("=== testScope2 === ");
        System.out.println("Reis.staticGetal: "  + Reis.staticGetal);

        System.out.println("wandeling.staticGetal: " + wandeling.staticGetal);
        // dereferencing (oftewel doe maar via de class name,
        // maar dit mag ook, maar hebben we liever niet...)
        wandeling = null;
        System.out.println("wandeling.staticGetal: " + wandeling.staticGetal);
        // Hier geen null pointer exception.
        // Java hoeft hiervoor NIET naar de heap.
        // Het is immers een static variabele
        // Dit is niet mooi, maar wel geldige code!!
        // GEEN compile error
        // Snap je de concepten van OO, dan is het helder.

        System.out.println("wandeling.instanceGetal: " + wandeling.instanceGetal);
        // Hier wel null pointer exception.
    }
}

