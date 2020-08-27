package c3x_methods;

public class C_Abstract_Classes_Interfaces001_abstract_classes_interfaces {

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

abstract class Example_oefc1 {
   // abstract String message_oefc1(){ // comment temp comment
        String message_oefc1(){ // comment temp new
        return "Hello!";
    }
}

class Main_oefc1 extends Example_oefc1{
    public static void main(String[] args) {
        System.out.println(new Main_oefc1().message_oefc1());
    }

    String message_oefc1(){
        return "World!";
    }
}

interface MainInterface_oefc2 {
    default String message(){
        return "Hello!";
    }
}

class Main_oefc2 implements MainInterface_oefc2{
    public static void main(String[] args) {
        System.out.println(new Main_oefc2().message());
    }
}

interface MainInterface_oefc3 {
    static void print(){
        System.out.println("Hello!");
    }
}

class Main_oefc3 implements MainInterface_oefc3{
    public static void main(String[] args) {
        MainInterface_oefc3.print();
        // Main_oefc3.print(); // temp commented
    }
}
interface MainInterface_oefc4 {
    abstract void print();
}

class Main_oefc4 implements MainInterface_oefc4{
    public static void main(String[] args) {
        new Main_oefc4().print();
    }

    public // temp extra line
    void print() {
        System.out.println("Hello!");
    }
}
