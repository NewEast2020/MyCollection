package c3x_methods;

public class A_Methods004_pass_by_value_vs_pass_by_reference {

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
        String greetings = "Hello";
        update(greetings);
        System.out.println(greetings);

        StringBuilder greetings1 = new StringBuilder("Hello");
        update1(greetings1);
        System.out.println(greetings1);
    }
    static void update(String greetings){
        greetings = "Hello world!";
    }

    static void update1(StringBuilder greetings){
        greetings.append(" world!");
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

