package c3x_methods;

public class B_Inheritance002_inheritance_and_polymorphism {

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
        B_Inheritance002_inheritance_and_polymorphism m = new B_Inheritance002_inheritance_and_polymorphism();
        B_Inheritance002_inheritance_and_polymorphism m2 = new B_Inheritance002_inheritance_and_polymorphism2();
        System.out.println(m.message());
        System.out.println(m2.message());
    }

    Object message(){
        return "Hello!";
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

class B_Inheritance002_inheritance_and_polymorphism2 extends B_Inheritance002_inheritance_and_polymorphism {
    String message(){
        return "World!";
    }
}
