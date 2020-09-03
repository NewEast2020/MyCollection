package c3x_methods;

public class A_Methods004_pass_by_value_vs_pass_by_reference {

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

// parameters are always passed to methods by value
// value of each parameters are stored in a local variable for the method
// therefore the original value can not be changed by method is passed by value

// if parameter passed to methods is of reference type
// the orignal value can be changed by method via passed reference type
// known as passed by reference

class Main_oef401 {
    // there are 2 update methods
    public static void main(String[] args) {
        String greetings_oef401 = "Hello"; // a String object is created
        //String greetings_oef401 = new String("Hello");
        update1(greetings_oef401); // will String object change or stay the same ?
                    // due pass by value
                    // update method will get a copy of the reference of the String object
                    // inside the method the copy is overwritten by  greetings_oef401 = "Hello world!";
                    // obviously this has no effect on the object created outside the method

        System.out.println(greetings_oef401);

        StringBuilder greetings1_oef401 = new StringBuilder("Hello");
             // a StringBuilder object is created
             // the objectreference is passed through update1 method
             // the  method invokes the append.method  greetings_oef401.append(" world!");
             //
        update2(greetings1_oef401);
        System.out.println(greetings1_oef401);

        greetings1_oef401 = new StringBuilder("Hello");
        update3(greetings1_oef401);
        System.out.println(greetings1_oef401);

    }

    static void update1(String greetings_oef401){
        greetings_oef401 = "Hello world!"; // assigns a new value to the string parameter
    }

    static void update2(StringBuilder greetings_oef401){ // modify a stringBuilder object
                                                         // by append a String to it
        greetings_oef401.append(" world!");
    }
    static void update3(StringBuilder greetings_oef401){
        greetings_oef401 = new StringBuilder(" world!");
    }
    // output
    //   Hello
    //   Hello world!
    //   Hello
}
    // the object can be changed through either reference

