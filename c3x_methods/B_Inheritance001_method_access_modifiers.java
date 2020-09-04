package c3x_methods;

import c3x_methods.package1.ClassA_oefb001;
import c3x_methods.package2.ClassB_oefb001;

public class B_Inheritance001_method_access_modifiers {

    public static void main(String[] args) {
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
} // output
  //   hello
  //   World!
  //   World!