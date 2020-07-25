package c25_6_wrapper_classes1;

public class Comparing_Objects_Of_Wrapper_Classes1 {
    public static void main(String[] args) {
        Integer getal1 = 50;
        Integer getal2 = new Integer(50); // maak een NEW object aan.
        Integer getal3 = Integer.valueOf(50);

        System.out.println("getal1 = 50");
        System.out.println("getal2 = new Integer(50)" );
        System.out.println("getal3 = Integer.valueOf(50)");

        vergelijkenMetIsIs(getal1, getal2, getal3);

        vergelijkenMetEquals(getal1, getal2, getal3);

        System.out.println("Buiten byte range");
        getal1 = 128;
        getal2 = new Integer(128); // maak een NEW object aan.
        getal3 = Integer.valueOf(128);

        System.out.println("getal1 = 128");
        System.out.println("getal2 = new Integer(128)" );
        System.out.println("getal3 = Integer.valueOf(128)");

        vergelijkenMetIsIs(getal1, getal2, getal3);
    }

    private static void vergelijkenMetIsIs(Integer getal1, Integer getal2, Integer getal3) {
        System.out.println("Vergelijken met ==");
        System.out.println("getal1 = " + getal1 + ", getal2 = " + getal2 + ", getal3 = " + getal3);
        System.out.println("getal1 == getal2: " + (getal1 == getal2));
        System.out.println("getal1 == getal3: " + (getal1 == getal3));
        System.out.println("getal2 == getal3: " + (getal2 == getal3));
        System.out.println();
    }

    private static void vergelijkenMetEquals(Integer getal1, Integer getal2, Integer getal3) {
        //equals
        System.out.println("Vergelijken met equals");
        System.out.println("getal1 = " + getal1 + ", getal2 = " + getal2 + ", getal3 = " + getal3);
        System.out.println("getal1.equals(getal2) :" + getal1.equals(getal2));
        System.out.println("getal1.equals(getal3) :" + getal1.equals(getal3));
        System.out.println("getal2.equals(getal3) :" + getal2.equals(getal3));
        System.out.println();
    }
}
/* output
getal1 = 50
getal2 = new Integer(50)
getal3 = Integer.valueOf(50)
Vergelijken met ==
getal1 = 50, getal2 = 50, getal3 = 50
getal1 == getal2: false
getal1 == getal3: true
getal2 == getal3: false

Vergelijken met equals
getal1 = 50, getal2 = 50, getal3 = 50
getal1.equals(getal2) :true
getal1.equals(getal3) :true
getal2.equals(getal3) :true

Buiten byte range
getal1 = 128
getal2 = new Integer(128)
getal3 = Integer.valueOf(128)
Vergelijken met ==
getal1 = 128, getal2 = 128, getal3 = 128
getal1 == getal2: false
getal1 == getal3: false
getal2 == getal3: false
 */

