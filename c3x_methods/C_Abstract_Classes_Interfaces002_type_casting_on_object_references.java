package c3x_methods;

import java.util.ArrayList;

public class C_Abstract_Classes_Interfaces002_type_casting_on_object_references {

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

class Example_oefc21 {
    public void print(){
        System.out.println("Hello");
    }
}

class Main_oefc21 extends Example_oefc21{
    public void print(){
        System.out.println("World");
    }

    public static void main(String[] args) {
        Main_oefc21 m = new Main_oefc21();
        Example_oefc21 e;

        e = m;
        // m = e; // temp comment
        m.print();
    }
}


class Main_oefc22 {
    public static void main(String[] args) {
        final ArrayList<String> array = new ArrayList<>();
        array.add("Hello");
        array.add("World");
        array.add("!");
        System.out.println(array);
    }
}