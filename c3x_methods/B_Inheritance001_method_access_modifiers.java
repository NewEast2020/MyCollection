package c3x_methods;

import c3x_methods.package1.ClassA_oefb001;
import c3x_methods.package2.ClassB_oefb001;

public class B_Inheritance001_method_access_modifiers {

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
        new B_Inheritance001_method_access_modifiers().print();
        new ClassA_oefb001().print_oefb001();
        new ClassB_oefb001().print_oefb001();
    }
    private String message = "hello";

    private void print(){
        System.out.println(message);
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


class Main_oefb001 {
    private String message_oefb001 = "hello";

    public static void main(String[] args) {
        new Main_oefb001().print_oefb001();
        new ClassA_oefb001().print_oefb001();
        new ClassB_oefb001().print_oefb001();
    }

    private void print_oefb001(){
        System.out.println(message_oefb001);
    }
}