package c2x_datatypes;

public class References004_reference_type_casting {

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

    }
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


