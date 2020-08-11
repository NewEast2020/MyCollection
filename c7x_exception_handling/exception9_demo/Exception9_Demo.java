package c7x_exception_handling.exception9_demo;

public class Exception9_Demo {
    public static void main(String args[]) throws Exception{
        testException();  // of zelf afhandelen (try/catch) of doorgeven / door-throwSen naar de buren (throws clause bij methode)
        gaatDitWerken();
        try {
//            System.out.println();
        } catch (Exception e) {

        }
    }

    static void testException() throws Exception { // declaren van de Exception, throws clause, door-throwsen // Over de schutting bij de buren
        RuntimeException runtimeException = new RuntimeException();
        Error error = new Error();
        Exception exception = new Exception();
        Throwable throwable = new Throwable();

//        throw runtimeException; // unchecked exception, (als dit optreedt is het eigenlijk een fout van de programmeur) vb NullPointerException (had je maar moeten checken of er een object in staat)
//         throw exception; // checked exception: => check, check, dubbel check => je MOET er wat mee doen of try/catch of door-throwsen (methode geeft het door).

        try { // of je handelt het zelf af.
            throw exception; // Of try catch
        } catch (Exception e) {
            e.printStackTrace();
        }

        throw exception; // of door-throwSen naar de aanroepende partij.
    }
    static void evenAanroepen() {
//        gaatDitWerken(); // Ik MOET hier op voorbereid zijn. dus compileert nu niet
        voorbeeld();
    }

    static void gaatDitWerken() throws Exception { // mag ik { vervangen?? // throws clause is een waarschuwingsbord en MEER niet. Je MOET hier op voorbereid zijn
        // In de bergen, het bord sneeuwkettingen verplicht, betekent niet dat je ze om je banden moet doen, maar je MOET er op voorbereid zijn.
        System.out.println("Test");
    }

    static void voorbeeld() throws ArrayIndexOutOfBoundsException { // uithangbord (throws) : voorbereid zijn op ArrayIndexOutOfBoundsException, dit is een RuntimeException en die is Unchecked
        System.out.println("Ik gooi geen exception, maar toch hangt er een uithangsbord");
//        int[] getallen = new int[]{1, 2};
//        getallen[100] = 10; // Dit levert een ArrayIndexOutOfBoundsException op, maar compileert wel!! Dus voorbeeld van een RuntimeException
    }
}
/* uitvoer
java.lang.Exception
	at c7x_exception_handling.exception9_demo.Exception9_Demo.testException(Exception9_Demo.java:17)
	at c7x_exception_handling.exception9_demo.Exception9_Demo.main(Exception9_Demo.java:5)
Exception in thread "main" java.lang.Exception
	at c7x_exception_handling.exception9_demo.Exception9_Demo.testException(Exception9_Demo.java:17)
	at c7x_exception_handling.exception9_demo.Exception9_Demo.main(Exception9_Demo.java:5)
 */