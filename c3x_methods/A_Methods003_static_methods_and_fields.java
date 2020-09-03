package c3x_methods;

public class A_Methods003_static_methods_and_fields {

    public static void main(String[] args) {
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

    static String message;
    //static final String message2; // temp comment

    static void Oef002() {
        System.out.println(message);
//        System.out.println(message2); // temp comment
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



