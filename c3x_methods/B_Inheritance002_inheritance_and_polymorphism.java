package c3x_methods;

public class B_Inheritance002_inheritance_and_polymorphism {

    public static void main(String[] args) {
        Oef003();
        Oef004();
        Oef005();
        Oef006();
        Oef007();
        Oef008();
        Oef009();
        Oef010();
    }

    static void Oef003() {
        new B_Inheritance002_inheritance_and_polymorphism().print_oef3();
        new B_Inheritance002_inheritance_and_polymorphism_oef3().print_oef3();
    }
    private String message_oef3(){
        return "Hello!";
    }
    void print_oef3(){
        System.out.println(message_oef3());
    }

    static void Oef004() {
        new B_Inheritance002_inheritance_and_polymorphism().print_oef4();
        new B_Inheritance002_inheritance_and_polymorphism_oef4().print_oef4();
    }
    protected String message_oef4(){
        return "Hello";
    }
    void print_oef4(){
        System.out.println(message_oef4());
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

class B_Inheritance002_inheritance_and_polymorphism_oef1 extends B_Inheritance002_inheritance_and_polymorphism {
    String message(){
        return "World!";
    }
}
class B_Inheritance002_inheritance_and_polymorphism_oef2 extends B_Inheritance002_inheritance_and_polymorphism {
    static String message(){
        return "World!";
    }
}
class B_Inheritance002_inheritance_and_polymorphism_oef3 extends B_Inheritance002_inheritance_and_polymorphism {
    private String message(){
        return "World!";
    }
}
class B_Inheritance002_inheritance_and_polymorphism_oef4 extends B_Inheritance002_inheritance_and_polymorphism {
    protected String message(){
        return "World!";
    }
}
// method overriding ;
// different subclasses with a common superclass can have
// different definitions for common methods

// Main2 class extends Main class
// message methods, overridden
// class Main
// class Main2
// same header Object message_oefb201()
//             String message_oefb201()
// different return type
// compatible return type
// return type Object : child return type Object or smaller String
// thrown exception : child same or smaller
// first message is from Main
// second mesage is from Main2
// that is polymorphism in action:
// the sane method called on the same object reference type
// can have different behaviour


class Main_oefb201 {
    Object message_oefb201(){
        return "Hello!";
    }

    public static void main(String[] args) {
        Main_oefb201 m = new Main_oefb201();
        Main_oefb201 m2 = new Main2_oefb201();
        System.out.println(m.message_oefb201());
        System.out.println(m2.message_oefb201());
    }
}
// output
  // Hello!
  // World!

class Main2_oefb201 extends Main_oefb201 {
    String message_oefb201(){
        return "World!";
    }
}

class Main_oefb202 {
    static Object message_oefb202(){
        return "Hello!";
    }

    public static void main(String[] args) {
        Main_oefb202 m = new Main_oefb202();
        Main_oefb202 m2 = new Main2_oefb202();
        System.out.println(m.message_oefb202());
        System.out.println(m2.message_oefb202());
    }
}

class Main2_oefb202 extends Main_oefb202 {
    static String message_oefb202(){
        return "World!";
    }
}