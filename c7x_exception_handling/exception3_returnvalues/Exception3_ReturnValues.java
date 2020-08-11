package c7x_exception_handling.exception3_returnvalues;

public class Exception3_ReturnValues {

    public static void main(String[] args) {

        System.out.println(demoInt1());
        System.out.println("==============");
        System.out.println(demoInt2());
        System.out.println("==============");
        System.out.println(demoStringBuilder());
    }

    static int demoInt1() {
        int var = 1;
        try {
            throw new Exception("demoInt1 exception");
        } catch (Exception e) {      // handle OR declare
            return ++var;   // pass by value
        } finally {
            ++var;
        }
        /*
         *   int a =1
         *    b=a
         *   a=2
         *   b is dan nog steeds 1
         */
    }

    static int demoInt2() {
        int var = 1;
        try {
            return ++var;
            //throw new Exception("demoInt2 exception");
        } catch (Exception e) {      // handle OR declare
            return ++var;
        } finally {
            return ++var;   // bij meerdere returns in verschillende blokken/clauses, geldt de laatst uitgevoerde return!
        }
    }

    static StringBuilder demoStringBuilder() {
        StringBuilder sb = new StringBuilder();
        try {
            throw new Exception("exception in stringbuilder");
        } catch (Exception e) {
            return sb.append(" catch ");
        } finally {
            sb.append(" finally ");
        }
    }
}
/* output
2
==============
3
==============
 catch  finally
 */
