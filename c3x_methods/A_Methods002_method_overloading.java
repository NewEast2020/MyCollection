package c3x_methods;

public class A_Methods002_method_overloading {

    public static void main(String[] args) {
    }
}

// methods names can be reused in the same class
// this is called method overloading
// because of the common name all overloading methods must have different signatures
// for them to be distinguisable
// this means:
// different numbers of arguments
// different argument types
// Arguments in different orders,
// or all three
// when resolving overloading methods calls
// Java always attemps to find the most specific match

class Main_oef201 {

    public static void main(String[] args) {

        print_oef201(42);
        // which method will match the above method call ?
        // the input parameter is an int
        // does not match the input parameter of either of the method definition exactly
        // java can perform one type conversion in order to find the match
        // in order to match this method call to the method definition method(long num) then
        // we must promote the int 42 to a long int (42L)
        // and then box the long int (42L) into an integer object

        print_oef201(42L); // conversion from an long int to an integer object
    }                           // the second definition is a closer match

                                // the 42L int is a long int
                                // it is converted to a Long integer object
                                // the method call can match either definition
                                // after the type conversion the method call matches
                                // the first method(Long num) exactly
                                // it only matches the second method method(Object obj)
                                // only if we cast the integer type to the big Object type
                                // therefore the first definition will be used
                                // because it is the more specific match

    // this java class define 2 print methods
    // overloading the print methods name
    // output depends on which method matches each method call

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
// another common use of method overloading is constructor overloading
// by definition all constuctors must have the same method name
// overloading constructors are in fact independant methods
// and therefore they can call each other
class Main_oef202 {
    private String message_oef202 = null;

    // default contructor
    private Main_oef202(){ //
        // String message_oef202 = "default";  // ==== temp commented ===
        // if an constructor calls another constructor
        // the call must appear as the first statement
        // this rule insures that an object is properly constructed
        // before anything can be done to it
        // this rule is violated in this example

        //this(message_oef202); // === temp commented ===
                                // second statement in the default constructor
                                // call overloaded constructor
                                // compile error
                                // java: call to this must be first statement in constructor
        this( "default"); // new line
    }

    private Main_oef202(String message_oef202){
        this.message_oef202 = message_oef202;
    }

    public static void main(String[] args) {
        System.out.print(new Main_oef202().message_oef202);
    }

    // output
    // default
}