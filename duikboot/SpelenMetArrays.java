package duikboot;

public class SpelenMetArrays {
    public static void main(String[] args) {
        int[] intArray;                     // Declaratie
        intArray = new int[10];             // Allocatie (alle elementen krijgen de default waarde (zie H2)
        System.out.println("intArray[0]: " + intArray[0]);    // Dus op elke plek staat voor de ints een 0
        intArray[0] = 10;                   // Initialisatie
        intArray[1] = 10;
        intArray[2] = 10;
//        intArray[10] = 10;                // ArrayIndexOutOfBoundsException => runtimeException, fout van programmeur
        System.out.println("intArray.length: " + intArray.length);    // lengte van array

        int []ints = new int[5];            // Declaratie en allocatie in één
        int integers[] = {1, 2, 4, 10};     // Declaratie, allocatie en initialisatie in één. In deze vorm MOET het op één regel staan!!
//        integers = {1, 2, 4};               // Dit compileert niet!

        int[] getallen = new int[] {1, 3, 4}; // alternatieve manier. Hier mag je tussen de haken de grootte NIET aangeven.

        Duikboot[] duikboten = new Duikboot[4];  // Array van 4 duikboten met de default waarde => null
//        System.out.println(duikboten[2].naam); // Nullpointer exception
        for (int i = 0; i < duikboten.length; i++) {
            duikboten[i] =  new Duikboot(); // initialisatie!!! (Om nullpointers te voorkomen)
        }
        System.out.println("duikboten[2].naam: " + duikboten[2].naam); // Nu gaat het wel goed. Naam is nog null, maar dat is geen probleem
        System.out.println("duikboten[2].naam.length(): " + duikboten[2].naam.length()); // Null pointer exception, omdat naam naar null verwijst
        duikboten[2].naam = "Yellow Submarine";
        System.out.println(duikboten[2].naam.length()); // Nu gaat het wel goed

        int[][] intArray2dim = {{1, 2}, {3, 4, 5}, null, {}};  // geldige 2 dimensionale array
//        System.out.println(intArray2dim[0][2]); // ArrayIndexOutOfBoundsException 2e dimensie op plek 0 heeft maar 2 plekken, dus plek 3 (index 2) bestaat niet
//        System.out.println(intArray2dim[2][0]); // ArrayIndexOutOfBoundsException: op index 2 staat geen array (null)
//        System.out.println(intArray2dim[3][0]); // ArrayIndexOutOfBoundsException: op index 3 staat een lege array

        Number[] wrappers = new Number[] {
                new Integer(5),
                new Double(2.5),
//                Boolean.FALSE, // Dit compileert niet, want Boolean is geen onderdeel van de Number familie
                Short.valueOf("12")
        };
    }
}

