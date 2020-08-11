package c7x_exception_handling.exception2_exceptions;

public class Exception2_Exceptions {

    public static void main(String[] args) {
        onmiddellijkStoppen();
    }

    static void onmiddellijkStoppen() {
        int a = 1, b = 0, c = 1;
        try {
            // boolean resultaat = a / b > ++c;  // als een exception optreedt, stopt de verdere evaluatie van de regel onmiddellijk! dus c wordt niet opgehoogd
            //boolean resultaat = ++c < a / b;
            getal2();
        } catch (ArithmeticException e) {
            System.out.println("c: " + c);
        } catch (Exception e) {
            System.out.println("getal2 gevangen" + e.getMessage());
        }
    }

    static int getal() throws Exception {
        throw new Exception();
        //return 1;   // deze is unreachable geworden => compiler error
    }

    static int getal2() throws Exception {
        throw new Exception("test in getal2");
        // alles wat hierna zou staan zou unrechable code zijn!
    }  // andere schijfwijze voor hierboven. Eigenlijk vreemd dat geen returnwaarde gegeven is  = valkuil
}
