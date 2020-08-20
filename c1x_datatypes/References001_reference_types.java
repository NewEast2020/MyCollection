package c1x_datatypes;

public class References001_reference_types {

    public static void main(String[] args) {
//        Oef001();
//        Oef002();
        Oef003();
    }

    static Integer a;  // a is object refernce type
    static int waarde1 = 22;

    static void Oef001() { // static variable Integer in the class outside the method
        // the variable name waarde is synonymous with the value its holds
        int waarde2;
        waarde2 = waarde1; // value getting copied
        System.out.println("waarde1 = " + waarde1);
        System.out.println("waarde2 = " + waarde2);


        Integer b;
        b = a;
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

    static void Oef002() { // local variable Integer in the method
        Integer a;  // a is object reference type
//        System.out.println("a = " + a);
        // variable a is defined in the method
        // a defined as a local variable
        // local variable has to be explicitly initialized before you can reference it
        // otherwise java compiler will throw an error
        // object reference variable can only hold valid object references or the null value
        // =========== compile error : java: variable a might not have been initialized =============
    }
    // in Java a set of object reference types that a related to the eight primitive types
    // they are called wrapper classes
    // they allow us conviniently to treat primitive data as objects if we want to
    // Its wrapper class has a set of static helper methods
    // Integer class has
    // a valueOf method that returns an Integer object reference and
    // a parseInt method that returns a primitive int

    // Three diiferent ways to create a wrapper object ;
    static void Oef003() {
        int a = 123;
        Integer b = new Integer(a);             //  1 : use a prinmtive int
        Integer c = new Integer("123");      //  2 ; use a String
        Integer d = Integer.parseInt("123"); //  3 ; use a String
        Integer e = a;                          //  4 autoboxing : assign primitive to an Integer reference type
        //    java does the type conversion for us automatically
        // All wrapper classes behave in similair way
        System.out.println(a + " " + b);
        System.out.println(c + " " + d + " " + e);
    }
    // 123 123
    // 123 123 123
}

