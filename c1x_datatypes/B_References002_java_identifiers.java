package c1x_datatypes;

public class B_References002_java_identifiers {

    public static void main(String[] args) {
        Oef001();
    }

    // java identifiers can be names of
    // variables
    // methods
    // classes
    // interfaces
    // and members 2229
    // Exam : identify valid identifiers
    // there are three rules for legal identifiers

    // 1.must begin with a letter
    // 2.must begin with a $ (dollar)
    // 3.must begin with a _ (underscore)

    // 4.can not use special characters except $ and _
    // 5.can not use Java reserved words

    static void Oef001() {
        // Are they valid identifiers
        int _123;            // yes
        //int 1 inifnioteloop; // xxxx letter $ _
        int $123$;           // yes
        //int int;             // xxxx no java reserved keyyword
        int True;            // yes
        //int public@;         // xxx no use of spectial characters
    }
}
