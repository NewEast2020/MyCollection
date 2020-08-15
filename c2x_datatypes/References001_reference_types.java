package c2x_datatypes;

public class References001_reference_types {

    public static void main(String[] args) {
//        Oef001();
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

    static Integer a ;  // a is object refernce type
    static int waarde1 = 22;

    static void Oef001() {
        // the variable name waarde is synonymous with the value its holds
        int waarde2;
        waarde2 = waarde1; // value getting copied
        System.out.println("waarde1 = " + waarde1);
        System.out.println("waarde2 = " + waarde2);


        Integer b;
        b = a ;
        System.out.println("a = " + a); // variable a is never initialized ; static Integer: null :reference to no object
        // a variable is never initialized, can be anything, whatever what was stored in the memory location previously
        // a defined as a static variable
        // the variable a get initialzed as soon as the class loaded
        // the default value of a object reference value type is null which means it does not exist
        // ============ no compile error : java: static variable get the value null ============
        System.out.println("b = " + b);

        a = 33; // a verwjjst naar een new object !
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // reference variables stores refernces to objects
        // refencence variables are assigned the same objects
        // they don not stores three copies of the some objects
        // the store three copies of the references to the same object
        // the refences getting copied not the objects
    }

    static void Oef002() {
        Integer a ;  // a is object reference type
        System.out.println("a = " + a);
        // variable a is defined in the method
        // a defined as a local variable
        // local variable has to be explicitly initialized before you can reference it
        // otherwise java compiler will throw an error
        // object reference variable can only hold valid object references or the null value
        // =========== compile error : java: variable a might not have been initialized =============
    }
    // in Java a set of object reference types that a related to the eight primitive types

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


