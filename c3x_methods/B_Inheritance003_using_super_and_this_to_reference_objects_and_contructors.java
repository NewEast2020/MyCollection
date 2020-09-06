package c3x_methods;

public class B_Inheritance003_using_super_and_this_to_reference_objects_and_contructors {

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

    }

    static void Oef002() {

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

class Example_oef2 {
    private String message;

    public Example_oef2(String message){
        this.message = message;
    }

    public String toString(){
        return message;
    }
}

class Main_oef2 extends Example_oef2{
    public static void main(String[] args) {
        System.out.println(new Main_oef2("Hello"));
    }

    public Main_oef2(String message){
        super(message);
    }

    public String toString(){
        return super.toString()+"!";
    }
}
// There are 2 special keywords in java
// This and Super
// important in the context of inheritance because

// this refers to current class instance;
// this can be used as arguments or return values
// this() invokes current class constructors (default and overloaded)

// super refers to immediate parent class instance variable or methods
// super() invokes immediately parent class constuctors (default and overloaded)

// A constructor in any class must invoke one of the constructors in the
// immediate parent class using the super keyword

// if it is not typed implicitly
// the compiler will insert the call on the default constructor of the immediately parent class

// if a class defines no constructor at all
// the compiler will insert a default constructor that will cause the default constructor
// to call the constructor of the immediate parent class

// uses of this is similair
// key difference
// this can literally used as an object reference to the current class instance
// this can be passed as arguments or returned as return values

// super can only be used to refer to members of the immediate parent class

// Main class extends Example class
// class Example has an overloaded constructor (no arg constructor disappeared)
// class Main has a default constructor
class Example_oefb301 {
    protected String message_oefb301;

    public Example_oefb301(String message_oefb301){
        this.message_oefb301 = message_oefb301;
    }
    // because of constructor exist
    // java is not add a default no-argument constructor for us
}

class Main_oefb301 extends Example_oefb301{
    public Main_oefb301(){
        // compile error: there is no default constuctor available
        super("Hello"); // inserted line
                                      // else super() xxx
        super.message_oefb301 = "Hello";
    }

    public static void main(String[] args) {
        System.out.println(new Main_oefb301().message_oefb301);
    }

//    public Main_oefb301(int waarde){
//        // compile error: there is no default constuctor available
//        super.message_oefb301 = "Hello";
//    }

}
// output
// Hello