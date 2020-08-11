package c7x_exception_handling.exception6_last_thrown;

public class Exception6_LastThrown {

    public static void main(String[] args) {

        try {
            testMultipleThrows();
        } catch (Exception e) {
            System.out.println("exception = " + e.getMessage());
        }
    }

    static void testMultipleThrows() throws Exception {
        try {
            throw new Exception("try");
        } catch (Exception e) {
            throw new Exception("catch");
        } finally {
            throw new Exception("finally"); // bij meerdere exception wordt LAATSTE enkel doorgeven aan de aanroepende methode
        }
    }
}
/*
exception = finally
 */