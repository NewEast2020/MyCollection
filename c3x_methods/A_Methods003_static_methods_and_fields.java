package c3x_methods;

public class A_Methods003_static_methods_and_fields {

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
        A_Methods003_static_methods_and_fields m = new A_Methods003_static_methods_and_fields();
        m.print();
        print();
        m = null;
        m.print();
    }
    static void print(){
        System.out.println("Hello World!");
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


