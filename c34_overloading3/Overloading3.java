package c34_overloading3;

public class Overloading3 {
    public static void main(String[] args) {
        String sleutel = "12345";
        Gebouw westVleugel = new Gebouw();
        boolean isGebouwOpen = westVleugel.openen(sleutel);
        System.out.println("Is de westvleugel geopend? " + isGebouwOpen);

        String hackerSleutel = null;
        System.out.println(westVleugel.openen(hackerSleutel));
        System.out.println("Gebouwen te openen zonder sleutel? " + westVleugel.openen());
        // gebouwbeheerder past iets aan:
        westVleugel.open = true;
        System.out.println("Gebouwen te openen zonder sleutel? " + westVleugel.openen());

    }
}

// Zie bijv System.out.println std voorbeeld van overloading => je hoeft niet na te denken welke methode je aanroept
//        System.out.println(12);
//        System.out.println("Tekst");
//        System.out.println(new DemoOverloading());

/* output
Is de westvleugel geopend? false
false
Gebouwen te openen zonder sleutel? false
Gebouwen te openen zonder sleutel? true
 */