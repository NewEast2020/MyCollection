package c3x_methods;

public class A_Methods002_method_overloading {

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
        print(42);
        print(42L);
    }
    static void print(Long num){
        System.out.println(num);
    }

    static void print(Object obj){
        System.out.println("object: "+obj);
    }

    static void Oef002() {
        System.out.print(new A_Methods002_method_overloading().message);
    }
    private String message = null;

    private  A_Methods002_method_overloading(){
        String message = "default";
        // this(message); // temp comment
    }

    private  A_Methods002_method_overloading(String message){
        this.message = message;
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


