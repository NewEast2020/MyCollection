package c3x_methods;

public class B_Inheritance003_using_super_and_this_to_reference_objects_and_contructors {

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

class Example_oef1 {
    protected String message;

    public Example_oef1(String message){
        this.message = message;
    }
}

class Main_oef1 extends Example_oef1{
    public Main_oef1(){
        super("Hello");
        super.message = "Hello";
    }

    public static void main(String[] args) {
        System.out.println(new Main_oef1().message);
    }
}

class Example_oef2 {
    private String message;

    public Example_oef2(String message){
        this.message = message;
    }

    public String toString(){
        return message;
    }
}

class Main_oef2 extends Example_oef2{
    public static void main(String[] args) {
        System.out.println(new Main_oef2("Hello"));
    }

    public Main_oef2(String message){
        super(message);
    }

    public String toString(){
        return super.toString()+"!";
    }
}
