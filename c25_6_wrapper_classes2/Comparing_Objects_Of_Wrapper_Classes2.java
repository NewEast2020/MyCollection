package c25_6_wrapper_classes2;

public class Comparing_Objects_Of_Wrapper_Classes2 {
    public static void main(String ...ditMagOok) { // geldige psvm
        Integer getal1 = 100; // eigenlijk op de primitive manier kan ik een waarde toekennen // Hier wordt ook rekening gehouden met de cache
        // cache
        Integer getal2 = new Integer(100); // Standaard instantiëren manier // new dus ALTIJD een nieuwe instantie
        Integer getal3 = Integer.valueOf(100); // Houdt rekening met de cache
        System.out.println("Integer getal1 = 100 : ");
        System.out.println("Integer getal2 = new Integer(100) : ");
        System.out.println("Integer getal3 = Integer.valueOf(100) : ");
        System.out.println("getal1 == getal2 : " + (getal1 == getal2)); // false, want 2 is een ander object
        System.out.println("getal1 == getal3 : " + (getal1 == getal3)); // true, want beiden komen uit de cahce
        System.out.println("getal2 == getal3 : " + (getal2 == getal3)); // false, want 2 is een ander object
        System.out.println();

        // beter is om de equals te gebruiken.
        System.out.println("Via de equals methode");
        System.out.println("getal1.equals(getal2) : " + getal1.equals(getal2));
        System.out.println("getal1.equals(getal3) : " + getal1.equals(getal3));
        System.out.println("getal2.equals(getal3) : " + getal2.equals(getal3));
        System.out.println();
        getal1 = 200;
        getal2 = 200;
        getal3 = 200;
        System.out.println("Integer getal1 = 200 : ");
        System.out.println("Integer getal2 = 200 : ");
        System.out.println("Integer getal3 = 200 : ");

        System.out.println("Getal buiten de cache range toekennen");
        System.out.println("getal1 == getal2 : " + (getal1 == getal2)); // altijd false, want buiten de cache range krijg je ALTIJD een nieuwe object
        System.out.println("getal1 == getal3 : " + (getal1 == getal3)); // een ander object, dus een ander adres, dus niet gelijk
        System.out.println("getal2 == getal3 : " + (getal2 == getal3));

//        System.out.println(Integer.toHexString(15678234)); // Hoef je niet te weten voor je OCA
    }
}
/* output
Integer getal1 = 100 :
Integer getal2 =  new Integer(100) :
Integer getal3 = Integer.valueOf(100) :
getal1 == getal2 : false
getal1 == getal3 : true
getal2 == getal3 : false

Via de equals methode
getal1.equals(getal2) : true
getal1.equals(getal3) : true
getal2.equals(getal3) : true

Integer getal1 = 200 :
Integer getal2 = 200 :
Integer getal3 = 200 :
Getal buiten de cache range toekennen
getal1 == getal2 : false
getal1 == getal3 : false
getal2 == getal3 : false
 */