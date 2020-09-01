package c3x_methods;

public class A_Methods002_method_overloading {

    public static void main(String[] args) {
        Oef001();
        Oef002();
        Oef003();
        Oef004();
        Oef005();
        Oef006();
        Oef007();
        Oef008();
        Oef009();
        Oef010();
    }

    static void Oef001() {
        print(42);
        print(42L);
    }
    static void print(Long num){
        System.out.println(num);
    }

    static void print(Object obj){
        System.out.println("object: "+obj);
    }

    static void Oef002() {
        System.out.print(new A_Methods002_method_overloading().message);
    }
    private String message = null;

    private  A_Methods002_method_overloading(){
        String message = "default";
        // this(message); // temp comment
    }

    private  A_Methods002_method_overloading(String message){
        this.message = message;
    }
    static void Oef003() {

    }

    static void Oef004() {

    }

    static void Oef005() {

    }

    static void Oef006() {

    }

    static void Oef007() {

    }

    static void Oef008() {

    }

    static void Oef009() {

    }

    static void Oef010() {

    }
}

// methods names can be reused in the same class
// this is called method overloading
// because of the common name all methods must have different signatures
// for them to be distinguisable
// different numbers of arguments
// different argument types
// Argument in different orders,
// or all three
// resolving overloading methods calls
// Java attemps to find the most specific match

class Main_oef201 {
    public static void main(String[] args) {
        print_oef201(42); // input parameter is an int
        // java can perform a one time conversion to find the most specific match
        // promote the int 42 in an long int
        // box the long int into an integer object

        print_oef201(42L); // conversion to an int to an long integer object
    }                           // once converted to a Long integer object
                                // the method call can match either definition


    static void print_oef201(Long num){
        System.out.println("Long num: " + num);
    }

    static void print_oef201(Object obj){
        System.out.println("object: "+obj);
    }
    // output:
    // object: 42
    // Long num: 42
}

