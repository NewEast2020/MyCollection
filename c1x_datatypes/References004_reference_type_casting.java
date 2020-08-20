package c1x_datatypes;

public class References004_reference_type_casting {

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

    static void Oef001(){
        Integer b = 123; // primitive integer converted to an integer Object through autoboxing
        Object a = b; // copies one object reference to another
                      // assigning value of a reference type to another reference type
                      // both a and b point to the same object
                      // it worked because the Object class type is a super class of the Integer class type
                      // only one object is created

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static void Oef002(){
        Integer a = 123; // a and b are reference types
        Object b = a; // a and b points to the same object
        a = (Integer)b; // casting solves the compile error
                        // b is in fact pointing to an Integer object
        //a = b; // compile error
                 // java: incompatible types: java.lang.Object cannot be converted to java.lang.Integer
                 // assigning an object class type to an integer class type xxx not possible
                 // They do not know that the 2 references point to the same object
                 // Remember the code is not run yet
                 // a=b not aloud bcause Integer class is not a superclass of the Object class
        System.out.println(b instanceof Integer);
        System.out.println(b instanceof Object);
        System.out.println(a instanceof Integer);
        System.out.println(a instanceof Object);

        System.out.println("a = " + a);
    } // true
      // true
      // true
      // true
      // a = 123

    //  ==== the rules ===                                                   // Integer a = 123;
    // subclass type to superclass type conversion is automatic              // Object b = a;
    // superclass type to subclass type conversion requires an explicit cast // a = (Integer)b;
    // Conversion between unrelated reference types is not allowed           // reference type has to be related
                                            // reference type must be compatible with the object type

    static void Oef003(){

    }
    static void Oef004(){

    }
    static void Oef005(){

    }
    static void Oef006(){

    }
    static void Oef007(){

    }
    static void Oef008(){

    }
    static void Oef009(){

    }
    static void Oef010(){

    }
}


