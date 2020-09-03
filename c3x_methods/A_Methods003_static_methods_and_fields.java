package c3x_methods;

public class A_Methods003_static_methods_and_fields {

    public static void main(String[] args) {
    }
}
// static members belong to the class
// only a single copy of each static member will be associated with the class object
// significant implications how static members can be used
// a static member is always executed in a static context
// a static member does not have access to any instance members of the class
// it is not possible to call an instance method in a static method in the same class

class Main_oef301 {

    // static print method
    static void print(){
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        Main_oef301 m = new Main_oef301();
        m.print(); // static method with an object reference is correct
        print();   // static method call print directly from the static method main is correct
        m = null;
        m.print(); // invoking static method on a null reference is correct because
                   // a static method is associated with its class not with any instances of a class
                   // that why you do not need an object to invoke a static method
    }
    // output
    // Hello World!
    // Hello World!
    // Hello World!
}

// initialization of static fields
// examples of 2 static fields
// both variables are defined but not initialized

class Main_oef302 {
    static String message_oef302; // initialized to null by default
                                  // along with other un initialized instance variables
    //static final String message2_oef302; // this static variable us declared as
                                         // final variable required to be initialzed in the declaration
                                         // or in the default constructor of the class
                                         // both is not there:
                                         // ==== compile error =====
                                         // java: variable message2_oef302 not initialized in the default constructor
    static final String message2_oef302 = null ; // temp toegevoegd
    public static void main(String[] args) {
        System.out.println(message_oef302);
        System.out.println(message2_oef302);
    }
}   // output:
    // null
    // null
